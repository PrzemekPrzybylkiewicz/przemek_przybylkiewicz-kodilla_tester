package com.kodilla.collections.adv.immutable.homework;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Niemutowalność", 123);
        task.duration = 55;

        System.out.println(task.getTitle() + task.getDuration());


    }
}
