package com.example.modulithexploring.order.application.domain.model;

import com.example.modulithexploring.shared.OrderIdentifier;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jmolecules.ddd.annotation.Identity;

import java.util.UUID;
import org.jmolecules.ddd.types.AggregateRoot;

@Getter
@RequiredArgsConstructor
public class Order implements AggregateRoot<Order, OrderIdentifier> {

    @Identity
    private final OrderIdentifier id;

    private List<LineItem> lineItems;
}
