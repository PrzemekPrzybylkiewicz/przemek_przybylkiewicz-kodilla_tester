package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTest {

    private FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlight() {
        List<Flight> result = flightFinder.findFlightsFrom("Brno");
        List<Flight> testList = new ArrayList<>();
        assertEquals(3, result.size());
    }

    @Test
    public void testFindFlight2() {
        List<Flight> result = flightFinder.findFlightsFrom("Brno");
        List<Flight> testList = new ArrayList<>();
        testList.add(new Flight("Brno", "Roma"));
        assertEquals(testList, result);
    }
}