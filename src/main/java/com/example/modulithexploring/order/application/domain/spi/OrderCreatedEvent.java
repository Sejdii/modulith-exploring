package com.example.modulithexploring.order.application.domain.service;

import com.example.modulithexploring.order.application.domain.model.Order;
import org.jmolecules.event.annotation.DomainEvent;

@DomainEvent
public record OrderCreatedEvent(Order.OrderIdentifier orderIdentifier) {
}
