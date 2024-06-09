package com.example.modulithexploring.order.application.domain.service;

import com.example.modulithexploring.order.application.domain.model.Order;
import com.example.modulithexploring.order.application.domain.spi.OrderCreatedEvent;
import com.example.modulithexploring.shared.OrderIdentifier;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Application
@Service
@RequiredArgsConstructor
@Slf4j
public class CreateOrderService {

    private final ApplicationEventPublisher eventPublisher;

    public void createOrder() {
        log.info("Creating order");

        Order order = new Order(new OrderIdentifier(UUID.randomUUID()));

        eventPublisher.publishEvent(new OrderCreatedEvent(order.getId()));
    }
}
