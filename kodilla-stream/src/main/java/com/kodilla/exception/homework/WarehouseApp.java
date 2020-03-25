package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws Exception {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("1234"));

        try {
            warehouse.getOrder("1");
            warehouse.getOrder("12");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order whit that number is incorrect");
            e.printStackTrace();
        } finally {
            System.out.println("Thanks For Searching.");
        }
    }
}
