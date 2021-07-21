package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightApp {
    public static void main(String[] args)  {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("WL1", "Warsaw", "London"));
        flights.add(new Flight("LP2","London", "Paris"));
        flights.add(new Flight("PB3","Paris", "Berlin"));
        flights.add(new Flight("BL4","Berlin", "London"));
        flights.add(new Flight("WB5","Warsaw", "Berlin"));
        flights.add(new Flight("BP6","Berlin", "Paris"));

        FlightFinder flightFinder = new FlightFinder(flights);

        Set<Flight> flightsFromWarsaw = flightFinder.findFlightFromAirport("Warsaw");
        Set<Flight> flightsToBerlin = flightFinder.findFlightToAirport("Berlin");
        Set<Flight> flightsToParis = flightFinder.findFlightToAirport("Paris");

        Set<Flight> flightsFromWarsawToParis = flightFinder.findStopoverAirport("Warsaw", "Paris");
        System.out.println("Flights from Warsaw: ");
        System.out.println(flightsFromWarsaw);
        System.out.println("Flights to Berlin: ");
        System.out.println(flightsToBerlin);
        System.out.println("Flights from Warsaw to Paris");
        System.out.println(flightsFromWarsawToParis);
        Set<Flight> finderConnection = flightFinder.findConnection("Warsaw", "Paris");
        System.out.println("connected flights from Warsaw to Paris");
        System.out.println(finderConnection);

    }
}