package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements SupplierInterface {
    private final String name;
    private final String address;
    private List<Product> listOfProducts;

    public HealthyShop(String name, String address, ArrayList<Product> listOfProducts) {
        this.name = name;
        this.address = address;
        this.listOfProducts = listOfProducts;
    }

    @Override
    public OrderDto process(OrderRequest orderRequest) {

        boolean isReady = checkStock(orderRequest);
        if (isReady) {
            System.out.println("Preparing order in " + name);
            orderRequest.getOrder().display();
            System.out.println("Package ready for pickup");
            return new OrderDto(orderRequest, true);
        } else {
            return new OrderDto(orderRequest, false);
        }
    }

    @Override
    public boolean checkStock(OrderRequest orderRequest) {

        return true;
    }
}