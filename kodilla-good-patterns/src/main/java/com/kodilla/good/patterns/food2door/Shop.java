package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public abstract class Shop {
    private String shopName;
    private Map<Product, Supplier> products;

    public Shop(String shopName, Map<Product, Supplier> products) {
        this.shopName = shopName;
        this.products = new HashMap<>();
    }

    public void add(Product product, Supplier supplier) {
        this.products.put(product, supplier);
    }


    public OrderResultDto process(Product product) {
        OrderResultDto results = new OrderResultDto();
        if (products.containsKey(product)) {
            ResultDto result = products.get(product).process(product);
            results.addResult(result);
        }
        return results;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", products=" + products +
                '}';
    }
}