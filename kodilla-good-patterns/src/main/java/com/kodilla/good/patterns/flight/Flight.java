package com.kodilla.good.patterns.flight;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private String flightNo;

    public Flight(String flightNo, String departureAirport, String arrivalAirport) {
        this.flightNo = flightNo;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight number: " + flightNo +
                " from: " + departureAirport +
                " to: " + arrivalAirport;
    }
}