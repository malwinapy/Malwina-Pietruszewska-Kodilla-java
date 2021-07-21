package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Kowalski","abc");
        Product product1 = new Product("Onion", 'V',2);
        Product product2 = new Product("Apple", 'F',5);
        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        return new OrderRequest(user, productList);
    }
}