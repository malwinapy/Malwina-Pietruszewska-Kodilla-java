package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderRequest {
    private final Order order;

    public OrderRequest(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
