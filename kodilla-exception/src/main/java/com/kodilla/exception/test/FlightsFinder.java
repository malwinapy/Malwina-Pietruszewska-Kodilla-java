package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class FlightsFinder {
    public Optional<String> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightCollection = new HashMap<>();

        flightCollection.put("Warsaw", true);
        flightCollection.put("Brussels", false);
        flightCollection.put("New York", true);
        flightCollection.put("Madrid", true);
        flightCollection.put("Paris", false);
        flightCollection.put("London", true);
        flightCollection.put("Rome", false);
        flightCollection.put("Amsterdam", false);

        return Optional <String> possibleFly = flightCollection.entrySet().stream()
         .filter(f -> flight.getArrivalAirport().equals(f.getKey()))
         .findFirst()
         .orElseThrow(() -> new RouteNotFoundException();

        // Assertions.assertEquals(flight.getArrivalAirport()), f.getKey());

        //for (Map.Entry<String, Boolean> map : flightCollection.entrySet()) {
        //    if (map.getKey().equals(flight.getDepartureAirport())) {
        //        if (map.getKey().equals(flight.getArrivalAirport()) && (map.getValue().equals(true))) {
        //            System.out.println("Flight from: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        //            System.out.println("Flight available");
        //            System.out.println(" ");
//                }
        //    }else {
        //            System.out.println("Flight from: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        //            throw new RouteNotFoundException();
        //        }
            }
        }
    }

