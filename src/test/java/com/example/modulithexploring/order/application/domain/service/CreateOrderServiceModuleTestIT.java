package com.example.modulithexploring.order.application.domain.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
@RequiredArgsConstructor
class CreateOrderServiceModuleTestIT {

    private final CreateOrderService createOrderService;

    @Test
    void shouldCreateOrder() {
        createOrderService.createOrder();
    }
}