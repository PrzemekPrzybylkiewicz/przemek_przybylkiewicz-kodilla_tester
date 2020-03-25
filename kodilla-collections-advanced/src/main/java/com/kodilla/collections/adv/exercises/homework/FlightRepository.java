package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Warszawa", "Berlin"));
        flightList.add(new Flight("Brno", "Praga"));
        flightList.add(new Flight("Warzone ", "NewYork"));
        // flightList.add(new Flight("Brno", "NewYork"));
        // flightList.add(new Flight("Brno", "Roma"));
        // flightList.add(new Flight("brno", "Roma"));
        return flightList;
    }
}
