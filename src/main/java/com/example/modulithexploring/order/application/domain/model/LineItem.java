package com.example.modulithexploring.order.application.domain.model;

import lombok.Getter;
import org.jmolecules.ddd.types.Entity;

@Getter
public class LineItem implements Entity<Order, String> {

    private String id;
}
