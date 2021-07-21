package com.kodilla.good.patterns.food2door;

import java.util.List;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public void createOrder(User user, List<Product> productList) {
        System.out.println("Order has been created");
    }
}