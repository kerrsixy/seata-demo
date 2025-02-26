package com.zjp.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: StorageApplication
 * Package: com.zjp.storage
 * Description:
 *
 * @Author zjp
 * @Create 2025/2/23 18:01
 * @Version 1.0
 */
@MapperScan("com.zjp.storage.mapper")
@SpringBootApplication
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
