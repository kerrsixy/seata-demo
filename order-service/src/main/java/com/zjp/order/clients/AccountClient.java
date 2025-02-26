package com.zjp.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.math.BigDecimal;

/**
 * ClassName: AccountClient
 * Package: com.zjp.order.clients
 * Description:
 *
 * @Author zjp
 * @Create 2025/2/23 18:26
 * @Version 1.0
 */
@FeignClient(value = "account-service")
public interface AccountClient {
    @PutMapping("/account/{userId}/{money}")
    void deduct(@PathVariable("userId") String userId, @PathVariable("money") BigDecimal money);
}
