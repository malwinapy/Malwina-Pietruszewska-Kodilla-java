package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsCollection {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightCollection = new HashMap<>();

        flightCollection.put("Warsaw", true);
        flightCollection.put("Brussels", false);
        flightCollection.put("New York", true);
        flightCollection.put("Madrid", true);
        flightCollection.put("Paris", false);
        flightCollection.put("London", true);
        flightCollection.put("Rome", false);
        flightCollection.put("Amsterdam", false);

        if (!flightCollection.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        return flightCollection.get(flight.getArrivalAirport());
        }
    }
