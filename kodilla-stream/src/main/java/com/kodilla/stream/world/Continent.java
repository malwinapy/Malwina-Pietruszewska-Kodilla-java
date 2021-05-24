package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final String nameContinent;
    private final Country country;
    private final Set<Country> countriesOnContinent = new HashSet<>();

    public Continent(String nameContinent, Country country) {
        this.nameContinent = nameContinent;
        this.country = country;
    }

    public void addCountry(Country country) {
        countriesOnContinent.add(country);
    }

    public boolean removeCountry(Country country) {
        return countriesOnContinent.remove(country);
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public Country getCountry() {
        return country;
    }

    public Set<Country> getCountriesOnContinent() {
        return countriesOnContinent;
    }
}
