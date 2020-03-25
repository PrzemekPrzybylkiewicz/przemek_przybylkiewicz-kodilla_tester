package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
    orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
    return orders
            .stream()
            .filter(o->o.getNumber().equals(number))
            .findFirst().orElseThrow(OrderDoesntExistException::new);

    }
}