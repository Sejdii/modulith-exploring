package com.example.modulithexploring.inventory.application.domain.model;

import lombok.Getter;
import org.jmolecules.ddd.types.AggregateRoot;
import org.jmolecules.ddd.types.Identifier;

import java.util.UUID;

@Getter
public class Inventory implements AggregateRoot<Inventory, Inventory.InventoryIdentifier> {

    private InventoryIdentifier id;

    public record InventoryIdentifier(UUID id) implements Identifier {}
}
