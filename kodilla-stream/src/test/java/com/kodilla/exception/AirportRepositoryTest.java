package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AirportRepositoryTest {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsowInUse = airportRepository.isAirportInUse("Warsow");
        //then
        assertTrue(isWarsowInUse);
    }

    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_whitException() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        //then
        assertFalse(isWarsawInUse);
    }
}