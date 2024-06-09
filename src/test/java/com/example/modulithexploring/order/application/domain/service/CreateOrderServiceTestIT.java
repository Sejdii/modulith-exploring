package com.example.modulithexploring.order.application.domain.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CreateOrderServiceTestIT {

    @Autowired
    private CreateOrderService createOrderService;

    @Test
    void shouldCreateOrder() {
        createOrderService.createOrder();
    }
}
