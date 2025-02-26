package com.zjp.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * ClassName: StorageClient
 * Package: com.zjp.order.clients
 * Description:
 *
 * @Author zjp
 * @Create 2025/2/23 18:29
 * @Version 1.0
 */
@FeignClient(value = "storage-service")
public interface StorageClient {
    @PutMapping("/storage/{id}/{count}")
    void deduct(@PathVariable("id") Integer id, @PathVariable("count") Integer count);
}
