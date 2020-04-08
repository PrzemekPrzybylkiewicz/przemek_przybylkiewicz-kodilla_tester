package com.kodilla.exception.homework;

import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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