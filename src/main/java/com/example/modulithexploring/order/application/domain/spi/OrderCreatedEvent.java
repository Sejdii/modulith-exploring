package com.example.modulithexploring.order.application.domain.spi;

import com.example.modulithexploring.shared.OrderIdentifier;
import org.jmolecules.event.annotation.DomainEvent;

@DomainEvent
public record OrderCreatedEvent(OrderIdentifier orderIdentifier) {
}
