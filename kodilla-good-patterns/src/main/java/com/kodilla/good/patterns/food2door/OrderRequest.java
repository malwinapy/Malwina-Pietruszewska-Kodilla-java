package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderRequest {
    private User user;
    private List<Product> productList;

    public OrderRequest(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", productList=" + productList +
                '}';
    }
}
