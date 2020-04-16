package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class WarehouseAppTest {

    @Test(expected = OrderDoesntExistException.class)
    public void testIsExeptionIsCorrect() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order testExeption = warehouse.getOrder("12");
        //then
        assertFalse(testExeption.getNumber().contains("12"));
    }
}