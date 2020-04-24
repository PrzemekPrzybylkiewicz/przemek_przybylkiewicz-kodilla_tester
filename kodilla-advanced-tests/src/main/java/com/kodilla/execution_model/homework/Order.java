package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private double price;
    private LocalDate date;
    private String login;

    public Order(double price, LocalDate date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }


    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", data='" + date + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
