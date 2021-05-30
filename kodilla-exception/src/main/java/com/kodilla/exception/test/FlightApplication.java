package com.kodilla.exception.test;

public class FlightApplication {
    public static void main(String[] args) {
        FlightsCollection flightsCollection = new FlightsCollection();
        Flight flight1 = new Flight("Brussels", "Warsaw");
        Flight flight2 = new Flight("Eindhoven", "Katowice");
        Flight flight3 = new Flight("Paris", "Rome");

        try {
            boolean possibleFlight = flightsCollection.findFlight(flight3);
            if (possibleFlight){
                System.out.println("Flight possible");
            } else {
                System.out.println("Flight impossible");
            }
        } catch (RouteNotFoundException e){
            System.out.println("arrivalAirport does not exist");
        }
    }
}

