package com.example.modulithexploring.order.application.domain.model;

import com.example.modulithexploring.shared.OrderIdentifier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Identity;

import java.util.UUID;

@Getter
@AggregateRoot
@AllArgsConstructor
public class Order {

    @Identity
    private OrderIdentifier id;
}
