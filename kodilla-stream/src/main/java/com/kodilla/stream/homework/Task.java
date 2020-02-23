package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDate opende;
    private LocalDate deadline;

    public Task(String name, LocalDate opende, LocalDate deadline) {
        this.name = name;
        this.opende = opende;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpende() {
        return opende;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(opende, task.opende) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, opende, deadline);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", opende=" + opende +
                ", deadline=" + deadline +
                '}';
    }
}
