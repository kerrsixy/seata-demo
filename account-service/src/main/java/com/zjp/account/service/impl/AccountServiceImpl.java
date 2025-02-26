package com.zjp.account.service.impl;

import com.zjp.account.entity.Account;
import com.zjp.account.mapper.AccountMapper;
import com.zjp.account.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional
    public void deduct(String userId, Double money) {
        log.info("开始扣款...");
        try {
            accountMapper.deduct(userId, money);
        } catch (Exception e) {
            throw new RuntimeException("扣款失败。", e);
        }
        log.info("扣款成功。");
    }
}
