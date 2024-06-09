package com.example.modulithexploring.inventory.application.domain.service;

import com.example.modulithexploring.inventory.port.in.UpdateInventoryUseCase;
import com.example.modulithexploring.order.application.domain.model.Order;
import com.example.modulithexploring.shared.OrderIdentifier;
import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.stereotype.Service;

@Service
@Application
public class UpdateInventoryService implements UpdateInventoryUseCase {

    @Override
    public void updateInventory(OrderIdentifier identifier) {
        // some business logic
    }
}
