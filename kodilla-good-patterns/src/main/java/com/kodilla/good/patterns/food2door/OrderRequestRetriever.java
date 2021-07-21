package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class OrderRequestRetriever {

    public OrderRequest retrieveOrder() {
        Order order = new Order("5th Avenue");
        Product bread = new Product("Bread", 1.2);
        Product butter = new Product("Butter", 1.79);
        order.addToList(bread, 2);
        order.addToList(butter, 1);
        return new OrderRequest(order);
    }

    public SupplierInterface retrieveSupplier(String name) {
        switch (name) {
            case "ExtraFoodShop": {
                ArrayList<Product> listOfProducts = new ArrayList<>();
                listOfProducts.add(new Product("Bread", 1.2));
                listOfProducts.add(new Product("Butter", 1.79));
                return new ExtraFoodShop("ExtraFoodShop", "Plentiful St. 3", listOfProducts);
            }
            case "HealthyShop": {
                ArrayList<Product> listOfProducts = new ArrayList<>();
                listOfProducts.add(new Product("Bread", 1.2));
                listOfProducts.add(new Product("Butter", 1.79));
                return new HealthyShop("HealthyShop", "Plentiful St. 4", listOfProducts);
            }
            case "GlutenFreeShop": {
                ArrayList<Product> listOfProducts = new ArrayList<>();
                listOfProducts.add(new Product("Bread", 1.2));
                listOfProducts.add(new Product("Butter", 1.79));
                return new GlutenFreeShop("GlutenFreeShop", "Plentiful St. 5", listOfProducts);
            }
            default:
                return new ExtraFoodShop("name", "address", new ArrayList<>());
        }
    }
}