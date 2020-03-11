package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add( new Student("Ted", new Teacher("Pit")));
        studentList.add( new Student("max", new Teacher("Pit")));
        studentList.add( new Student("1", new Teacher("Pit")));
        studentList.add( new Student("2", new Teacher("Pit")));
        studentList.add( new Student("3", new Teacher("Pit")));
        studentList.add( new Student("4", new Teacher("Pit")));
        studentList.add( new Student("5", new Teacher("Pit")));
        studentList.add( new Student("6", new Teacher("Pit")));
        studentList.add( new Student("7", new Teacher(null)));


        System.out.println(studentList.stream().filter(element ->element.getName().startsWith("m")).findFirst().get());


}
}

