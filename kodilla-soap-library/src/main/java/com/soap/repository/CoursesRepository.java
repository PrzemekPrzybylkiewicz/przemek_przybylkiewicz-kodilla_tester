package com.soap.repository;

import com.kodilla.courses.soap.Course;
import com.kodilla.courses.soap.Type;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class CoursesRepository {
    private static final Map<String, Course> courses = new HashMap<>();

    @PostConstruct
    public void initData() {
        Course javaJdp = new Course();
        javaJdp.setReference("1");
        javaJdp.setAuthor("Zbigniew Nienacki");
        javaJdp.setName("Pan Samochodzik");
        javaJdp.setType(Type.CRIME);
        javaJdp.setYear(1990);

        courses.put(javaJdp.getName(), javaJdp);

        Course java = new Course();
        javaJdp.setReference("2");
        javaJdp.setAuthor("Daniela Defoe");
        javaJdp.setName("Robinson Crusoe");
        javaJdp.setType(Type.SCI_FI);
        javaJdp.setYear(1991);

        courses.put(java.getName(), java);

        Course webWdp = new Course();
        webWdp.setName("New Book");
        webWdp.setType(Type.SCI_FI);
        webWdp.setYear(1900);

        courses.put(webWdp.getName(), webWdp);

    }

    public Course findCourse(String name) {
        Assert.notNull(name, "You have to specify the course's name");
        return courses.get(name);
    }
}
