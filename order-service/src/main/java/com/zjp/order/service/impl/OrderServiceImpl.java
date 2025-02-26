package com.zjp.order.service.impl;

import com.zjp.order.clients.AccountClient;
import com.zjp.order.clients.StorageClient;
import com.zjp.order.entity.Order;
import com.zjp.order.mapper.OrderMapper;
import com.zjp.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public Integer create(Order order) {
        log.info("开始创建订单...");
        Integer id = order.getId();
        // 创建订单
        orderMapper.insert(order);
        try {
            // 扣用户余额
            accountClient.deduct(order.getUserId(), order.getMoney());
            // 扣库存
            storageClient.deduct(id, order.getCount());

        } catch (FeignException e) {
            throw new RuntimeException("创建订单失败。", e);
        }
        log.info("订单创建成功。");
        return order.getId();
    }
}
