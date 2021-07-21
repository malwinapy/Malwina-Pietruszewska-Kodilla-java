package com.kodilla.good.patterns.food2door;

import java.util.List;

public abstract class Supplier {
    public String supplierName;
    public List<Product> productList;

    public Supplier() {
    }

    public Supplier(String supplierName, List<Product> productList) {
        this.supplierName = supplierName;
        this.productList = productList;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public ResultDto process(Product product) {
        if (productList.contains(product)) {
            return new ResultDto(product, true);
        }
        return new ResultDto(product, false);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierName='" + supplierName + '\'' +
                ", productList=" + productList +
                '}';
    }
}