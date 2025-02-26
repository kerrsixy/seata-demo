package com.zjp.storage.service.impl;

import com.zjp.storage.entity.Storage;
import com.zjp.storage.mapper.StorageMapper;
import com.zjp.storage.service.IStorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements IStorageService {
    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void deduct(String id, Double count) {
        log.info("开始扣减库存...");
        try {
            Storage storage = storageMapper.selectById(id);
            if (storage == null || storage.getCount() < count || storage.getCount() == 0) {
                throw new RuntimeException("库存不足！");
            }
            storageMapper.deduct(id, count);
        } catch (Exception e) {
            throw new RuntimeException("扣减库存失败！", e);
        }
        log.info("扣减库存成功！");
    }
}
