package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShop extends Shop {
    public GlutenFreeShop(String shopName, Map<Product, Supplier> products) {
        super(shopName, products);
    }

}