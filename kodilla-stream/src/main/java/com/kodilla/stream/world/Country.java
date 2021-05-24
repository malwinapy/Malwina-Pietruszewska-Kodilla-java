package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String nameCountry;
    private final BigDecimal peopleQuantity;

    public Country(String nameCountry, BigDecimal peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getName() {
        return nameCountry;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

  }
