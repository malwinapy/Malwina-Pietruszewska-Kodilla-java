package com.kodilla.exception.test;

public class FlightApplication {
    public static void main(String[] args) {
        FlightsFinder flightsFinder = new FlightsFinder();
        Flight flight1 = new Flight("Brussels", "Warsaw");
        Flight flight2 = new Flight("Eindhoven", "Katowice");
        Flight flight3 = new Flight("Paris", "Rome");

        try {
            //flightsFinder.findFlight(flight1);
            //flightsFinder.findFlight(flight2);
            flightsFinder.findFlight(flight3);

        } catch (RouteNotFoundException e){
            System.out.println("Flight not found");
        }
        finally {
            System.out.println("***");
        }
    }
}

