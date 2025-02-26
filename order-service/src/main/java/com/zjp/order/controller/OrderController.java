package com.zjp.order.controller;


import com.zjp.order.entity.Order;
import com.zjp.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @PostMapping
    public Integer createOrder(@RequestBody Order order) {
        return orderService.create(order);
    }
}
