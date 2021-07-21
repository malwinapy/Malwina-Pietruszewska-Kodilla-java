package com.kodilla.good.patterns.food2door;

public class ResultDto {

    private Product product;
    private boolean processed;

    public ResultDto(Product product, boolean processed) {
        this.product = product;
        this.processed = processed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultDto resultDto = (ResultDto) o;

        if (processed != resultDto.processed) return false;
        return product != null ? product.equals(resultDto.product) : resultDto.product == null;
    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + (processed ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResultDto{" +
                "product=" + product +
                ", processed=" + processed +
                '}';
    }
}