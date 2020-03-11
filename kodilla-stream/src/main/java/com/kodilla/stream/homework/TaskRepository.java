package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Kowalski", LocalDate.of(2020, 02, 22), LocalDate.of(2020, 03, 22)));
        tasks.add(new Task("Nowak", LocalDate.of(2020, 01, 13), LocalDate.of(2020, 01, 22)));
        tasks.add(new Task("Piekarczuk", LocalDate.of(2020, 02, 21), LocalDate.of(2020, 02, 23)));
        tasks.add(new Task("Rambo", LocalDate.of(2020, 02, 21), LocalDate.of(2020, 04, 23)));
        tasks.add(new Task("Pan Kazimierz", LocalDate.of(2020, 02, 21), LocalDate.of(2020, 02, 23)));
        tasks.add(new Task("Korzeniowski", LocalDate.of(2020, 02, 21), LocalDate.of(2020, 06, 19)));
        tasks.add(new Task("Kuzbiel", LocalDate.of(2022, 03, 01), LocalDate.of(2023, 01, 23)));
        return tasks;
    }

}
