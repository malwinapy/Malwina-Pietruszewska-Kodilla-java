package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Order {
    private final Map<Product, Integer> order = new HashMap<>();
    private String deliveryAddress;

    public Order(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void addToList(Product goods, int quantity) {
        order.putIfAbsent(goods, quantity);
    }

    public void display() {
        double sum = 0;
        System.out.println("Order is: ");
        for (Product goods : order.keySet()) {
            int quantity = order.get(goods);
            System.out.println("- " + goods.getName()
                    + "  " + quantity + "* " + goods.getPrice()
                    + " = " + (quantity * goods.getPrice()));
            sum += goods.getPrice() * quantity;
            sum *=100;
            sum = Math.round(sum);
            sum/=100;
        }
        System.out.println("Total: " + sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order1 = (Order) o;
        return order.equals(order1.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }

}