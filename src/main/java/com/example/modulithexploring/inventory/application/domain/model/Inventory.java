package com.example.modulithexploring.inventory.application.domain.model;

import lombok.Getter;
import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Identity;
import org.jmolecules.ddd.types.Identifier;

import java.util.UUID;

@Getter
@AggregateRoot
public class Inventory {

    @Identity
    private InventoryIdentifier id;

    public record InventoryIdentifier(UUID id) {}
}
