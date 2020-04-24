package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    Shop shop = new Shop();
//    Order one = new Order(2.50, 2019-02-01, "Kupujacy1");
//    Order two = new Order(5.2, 03-07-2019, "Kupujacy2");
//    Order three= new Order(4, 01-12-2019, "Kupujacy3");
//    Order four = new Order(8.9, 01-01-2019, "Kupujacy4");

    @Test
    public void shouldItAddOrder() {

//        shop.addOrder(one);

        int numbOfOrders = shop.getSize();

        assertEquals(1,numbOfOrders);
    }




}