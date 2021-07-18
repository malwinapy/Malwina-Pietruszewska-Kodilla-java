package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    boolean sold(User user, LocalDateTime orderDate, Product product, int quantity);
}
