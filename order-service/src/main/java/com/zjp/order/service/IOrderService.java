package com.zjp.order.service;

import com.zjp.order.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
public interface IOrderService extends IService<Order> {
    Integer create(Order order);
}
