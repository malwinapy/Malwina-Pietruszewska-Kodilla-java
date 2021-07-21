package com.kodilla.good.patterns.food2door;

public interface SupplierInterface {
    OrderDto process(OrderRequest orderRequest);
    boolean checkStock(OrderRequest orderRequest);
}
