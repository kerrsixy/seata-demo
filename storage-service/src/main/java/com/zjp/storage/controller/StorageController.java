package com.zjp.storage.controller;


import com.zjp.storage.service.IStorageService;
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
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private IStorageService storageService;

    /**
     * 扣减库存
     *
     * @param id    商品编号
     * @param count 要扣减的数量
     * @return 无
     */
    @PutMapping("/{id}/{count}")
    public void deduct(@PathVariable("id") String id, @PathVariable("count") Double count) {
        storageService.deduct(id, count);
    }
}
