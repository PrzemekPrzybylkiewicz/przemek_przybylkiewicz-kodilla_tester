package com.kodilla.execution_model;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTest {


    @Test
    public void shouldAddItem(){
        Invoice invoice = new Invoice();
       // invoice.addItem("name",1.2);
        Item milk = new Item("Milk",3.50);
        invoice.addItem(milk);

        //when
        int numberOfItems = invoice.getSize();

        //then
        assertEquals(1, numberOfItems);
    }

    @Test

    public void pullItemCheckIsOk(){
        Invoice invoice =new Invoice();
        Item milk = new Item("Milk",3.50);
        invoice.addItem(milk);
        //when
        Item result = invoice.getItem(0);
        // then
        assertEquals("Milk",result.getName());
//        assertEquals(3.50,result.getPrice());
        // co to jest delta
        assertEquals(3.48,result.getPrice(),0.02);
    }
    @Test

    public void shouldReturnNullWhenPassingNegativeIndex(){
        Invoice invoice =new Invoice();
        Item milk = new Item("Milk",3.50);
        invoice.addItem(milk);

        Item result = invoice.getItem(-3);

        assertNull(result);
    }

    @Test

    public void shouldReturnNullWhenPassingMassiveIndex(){
        Invoice invoice =new Invoice();
        Item milk = new Item("Milk",3.50);
        invoice.addItem(milk);

        Item result = invoice.getItem(3);

        assertNull(result);
    }
    @Test

    public void shouldClearInvoice(){
        Invoice invoice =new Invoice();
        Item milk = new Item("Milk",3.50);
        invoice.addItem(milk);

        invoice.clear();

        assertEquals(0,invoice.getSize());
    }
}