package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements SupplierInterface {

    private final String name;
    private final String address;
    private List<Product> listOfProducts;

    public ExtraFoodShop(String name, String address, ArrayList<Product> listOfProducts) {
        this.name = name;
        this.address = address;
        this.listOfProducts = listOfProducts;
    }

    @Override
    public OrderDto process(OrderRequest orderRequest) {

        boolean isOrdered = checkStock(orderRequest);
        if (isOrdered) {
            System.out.println("Booked order from " + name);
            orderRequest.getOrder().display();
            System.out.println("Sending package to " + orderRequest.getOrder().getDeliveryAddress());
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
