package com.kodilla.abstracts.homework;

public  class Person {
    public String firstName;
    public int age;
    public String job;

    public void process(Job job){
        job.toDo();
    }
}
