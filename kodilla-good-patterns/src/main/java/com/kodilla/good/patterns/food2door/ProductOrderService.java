package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductOrderService implements OrderService{

    private Map<Product, Shop> shops;

    public ProductOrderService() {
        this.shops = new HashMap<>();
    }

    public void addShop(Product product, Shop shop) {
        this.shops.put(product, shop);
    }

    @Override
    public boolean order(User user, List<Product> productList) {
        for (Product product : productList) {
            if (this.shops.containsKey(product)) {
                OrderResultDto resultDto = this.shops.get(product).process(product);
                System.out.println(resultDto);
            }
            return false;
        }
        return true;
    }
}