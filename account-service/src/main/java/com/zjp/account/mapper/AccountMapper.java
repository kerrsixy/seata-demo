package com.zjp.account.mapper;

import com.zjp.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
public interface AccountMapper extends BaseMapper<Account> {
    void deduct(String userId, Double money);
}
