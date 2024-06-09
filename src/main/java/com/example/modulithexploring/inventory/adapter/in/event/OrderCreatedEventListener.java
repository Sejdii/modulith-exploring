package com.example.modulithexploring.inventory.adapter.in.event;


import com.example.modulithexploring.inventory.port.in.UpdateInventoryUseCase;
import com.example.modulithexploring.order.application.domain.spi.OrderCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.jmolecules.architecture.hexagonal.PrimaryAdapter;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@PrimaryAdapter
@RequiredArgsConstructor
@Slf4j
class OrderCreatedEventListener {

    private final UpdateInventoryUseCase updateInventoryUseCase;

    @Async
    @EventListener
    public void handleOrderCreated(OrderCreatedEvent orderCreatedEvent) {
        log.info("Handling order created event: {}", orderCreatedEvent);

        updateInventoryUseCase.updateInventory(orderCreatedEvent.orderIdentifier());
    }
}
