package com.example.modulithexploring.order.application.domain.model;

import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Identity;

import java.util.UUID;

@AggregateRoot
public class Order {

    @Identity
    private OrderIdentifier id;

    public record OrderIdentifier(UUID id) {}
}
