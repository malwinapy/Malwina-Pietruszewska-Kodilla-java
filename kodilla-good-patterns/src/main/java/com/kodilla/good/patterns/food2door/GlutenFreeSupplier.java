package com.kodilla.good.patterns.food2door;

public class GlutenFreeSupplier implements SupplierInterface {

    @Override
    public void process(Order order) {

    }

    public void deliver() {
        System.out.println("pick-up only");
    }
}