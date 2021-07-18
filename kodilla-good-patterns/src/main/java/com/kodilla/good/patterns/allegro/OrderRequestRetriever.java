package com.kodilla.good.patterns.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Janusz", "Kowalski", "janusz1970kowalski@gmail.com");

        LocalDateTime orderDate = LocalDateTime.of(2021,7,18,15,47,30);
        Product soldProduct = new Product("zestaw grillowy", new BigDecimal("1234567890"), new BigDecimal("19.90"));
        int quantity = 1;

        return new OrderRequest(user, orderDate, soldProduct, quantity);
    }
}
