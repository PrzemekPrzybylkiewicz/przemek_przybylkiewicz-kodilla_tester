package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add( new Student("Ted", new Teacher("McGregor")));
        studentList.add( new Student("Max"));
        studentList.add( new Student("Tom", new Teacher("Kowalski")));
        studentList.add( new Student("Aron", new Teacher(null)));




        for(Student student :studentList){
            String teacher =student.getTeacher();
            System.out.println("student " +student.getName() +" teacher :" + teacher);
        }




}
}

