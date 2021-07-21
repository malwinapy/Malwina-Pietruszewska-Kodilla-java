package com.kodilla.good.patterns.food2door;

public class Food2DoorApplication {
    public static void main(String[] args) {
        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = requestRetriever.retrieveOrder();
        ExtraFoodShop EFSSupplier
                = (ExtraFoodShop) requestRetriever.retrieveSupplier("ExtraFoodShop");
        HealthyShop HSSupplier
                = (HealthyShop) requestRetriever.retrieveSupplier("HealthyShop");

        EFSSupplier.process(orderRequest);
        HSSupplier.process(orderRequest);

    }
}