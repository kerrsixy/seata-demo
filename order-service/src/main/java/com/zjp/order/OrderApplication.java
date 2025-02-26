package com.zjp.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: OrderApplication
 * Package: com.zjp.order
 * Description:
 *
 * @Author zjp
 * @Create 2025/2/23 18:01
 * @Version 1.0
 */
@EnableFeignClients
@SpringBootApplication
@MapperScan("com.zjp.order.mapper")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
