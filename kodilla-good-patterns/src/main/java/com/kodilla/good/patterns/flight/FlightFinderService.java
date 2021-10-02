package com.kodilla.good.patterns.flight;

import java.util.List;

public interface FlightFinderService {
    List<Flight> findFrom (String from);
    List<Flight> findTo(String to);
    List<IndirectFlight> findIndirect(String from, String to);
}