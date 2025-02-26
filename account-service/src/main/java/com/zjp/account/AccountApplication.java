package com.zjp.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: AccountApplication
 * Package: com.zjp.account
 * Description:
 *
 * @Author zjp
 * @Create 2025/2/23 17:59
 * @Version 1.0
 */
@MapperScan("com.zjp.account.mapper")
@SpringBootApplication
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
