package com.kodilla.good.patterns.food2door;

public class OrderDto {

    private final OrderRequest orderRequest;
    private final boolean isOrdered;

    public OrderDto(OrderRequest orderRequest, boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}

