package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private User user;
    private List<Product> productList;
    private Supplier supplier;
    private LocalDateTime orderDate;

    public Order(User user, List<Product> productList, Supplier supplier, LocalDateTime orderDate) {
        this.user = user;
        this.productList = productList;
        this.supplier = supplier;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product List=" + productList +
                ", supplier=" + supplier +
                ", orderDate=" + orderDate +
                '}';
    }
}