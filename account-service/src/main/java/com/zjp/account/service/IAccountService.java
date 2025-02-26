package com.zjp.account.service;

import com.zjp.account.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
public interface IAccountService extends IService<Account> {
    void deduct(String userId, Double money);
}
