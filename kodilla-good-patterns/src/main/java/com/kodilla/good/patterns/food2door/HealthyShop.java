package com.kodilla.good.patterns.food2door;

import java.util.List;
import java.util.Map;

public class HealthyShop extends Shop{
    public HealthyShop(String shopName, Map<Product, Supplier> products) {
        super(shopName, products);
    }
}