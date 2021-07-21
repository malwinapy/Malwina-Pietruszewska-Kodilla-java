package com.kodilla.good.patterns.food2door;

public class Product {
    private String productName;
    private char productKind;
    private double productPrice;

    public Product(String productName, char productKind, double productPrice) {
        this.productName = productName;
        this.productKind = productKind;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public char getProductKind() {
        return productKind;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productKind=" + productKind +
                ", productPrice=" + productPrice +
                '}';
    }
}