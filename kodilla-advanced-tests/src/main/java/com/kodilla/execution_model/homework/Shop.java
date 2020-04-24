package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order){
        this.orders.add(order);
    }


    public int getSize(){
        return this.orders.size();
    }

}
