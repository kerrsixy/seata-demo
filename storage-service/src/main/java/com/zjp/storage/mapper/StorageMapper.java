package com.zjp.storage.mapper;

import com.zjp.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
public interface StorageMapper extends BaseMapper<Storage> {
    void deduct(String id, Double count);
}
