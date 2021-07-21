package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Food2DoorApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderService(), new ProductOrderRepository());
        OrderDto process = orderProcessor.process(orderRequest);
        System.out.println(process);
        OrderResultDto orderResultDto = new OrderResultDto();
        Product product = new Product("onion", 'V', 2);
        Product product1 = new Product("apple", 'F', 10);
        ResultDto resultDto = new ResultDto(product, true);
        ResultDto resultDto1 = new ResultDto(product1, true);

        orderResultDto.addResult(resultDto);
        orderResultDto.addResult(resultDto1);

        System.out.println(resultDto);
        System.out.println(resultDto1);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product);
        Supplier supplier = new Supplier("ExtraFoodShop",productList) {
            @Override
            public String getSupplierName() {
                return super.getSupplierName();
            }
        };

        Map<Product, Supplier> products = new HashMap<>();
        products.put(product, supplier);
        products.put(product1, supplier);

        Shop shop = new Shop("ExtraFoodShop", products) {
            @Override
            public void add(Product product, Supplier supplier) {
                super.add(product, supplier);
            }
        };
        System.out.println(supplier);
        System.out.println(shop);
    }
}