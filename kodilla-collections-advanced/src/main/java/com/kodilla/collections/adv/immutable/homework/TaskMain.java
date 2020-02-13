package com.kodilla.collections.adv.immutable.homework;

public class TaskMain {
    public static void main(String[] args) {
//        Task task = new Task("Niemutowalność", 123);
//        task.duration = 55;
//        task.showMe();
        Task task = new TaskDemolition(" Wow ",15);
        TaskDemolition taskDemolition =(TaskDemolition) task;
        taskDemolition.demolitionHammer(66);
        System.out.println(task.getTitle() + task.getDuration());
        task.showMe();

    }
}
