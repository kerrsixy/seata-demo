package com.zjp.account.controller;


import com.zjp.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zjp
 * @since 2025-02-23
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @PutMapping("/{userId}/{money}")
    public String deduct(@PathVariable("userId") String userId, @PathVariable("money") Double money) {
        accountService.deduct(userId, money);
        return "success";
    }
}
