package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {
    private final Set<Continent> worldSet = new HashSet<>();

    public void addContinent(Continent continent){
    worldSet.add(continent);
    }
    public boolean removeContinent(Continent continent){
        return worldSet.remove(continent);
    }
    public Set<Set> getWorldSet(){
        return worldSet.stream()
                .map(Continent::getCountriesOnContinent)
                .collect(Collectors.toSet());
    }
    public BigDecimal getPeopleQuantity(){
        return worldSet.stream()
                .flatMap(continent -> continent.getCountriesOnContinent().stream())
                .map(country -> getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current)->sum=sum.add(current));
    }
}

