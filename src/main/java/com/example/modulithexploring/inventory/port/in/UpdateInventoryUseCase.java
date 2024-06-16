package com.example.modulithexploring.inventory.port.in;

import com.example.modulithexploring.shared.OrderIdentifier;
import org.jmolecules.architecture.hexagonal.PrimaryPort;

@PrimaryPort
public interface UpdateInventoryUseCase {

    void updateInventory(OrderIdentifier identifier);
}
