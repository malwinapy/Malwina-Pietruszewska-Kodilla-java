package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderResultDto {

    private List<ResultDto> results = new ArrayList<>();

    public void addResult(ResultDto result) {
        this.results.add(result);
    }

    @Override
    public String toString() {
        return "OrderResultDto{" +
                "results=" + results +
                '}';
    }
}