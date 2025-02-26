package com.zjp.storage.service;

import com.zjp.storage.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
public interface IStorageService extends IService<Storage> {
    void deduct(String id, Double count);
}
