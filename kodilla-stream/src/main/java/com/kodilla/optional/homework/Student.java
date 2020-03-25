package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Optional<String> teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = Optional.ofNullable(teacher.getName());
    }

    public Student(String name) {
        this.name = name;
        this.teacher = Optional.ofNullable("undefined");
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return String.valueOf(teacher);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
