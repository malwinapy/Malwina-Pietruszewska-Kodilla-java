package com.kodilla.good.patterns.flight;

import static com.kodilla.good.patterns.flight.FlightDb.KATOWICE;
import static com.kodilla.good.patterns.flight.FlightDb.WROCLAW;

public class Application {
    public static void main(String[] args) {
        FlightDb flightDb = new FlightDb();

        FlightFinderService flightFinderService = new FlightsFinder(flightDb);

        System.out.println("Flights from Wroclaw");
        flightFinderService.findFrom(WROCLAW)
                .forEach(System.out::println);

        System.out.println("\nFlights to Katowice");
        flightFinderService.findTo(KATOWICE)
                .forEach(System.out::println);

        System.out.println("\nIndirect flights from Wroclaw to Katowice");
        flightFinderService.findIndirect(WROCLAW, KATOWICE)
                .forEach(System.out::println);
    }
}