package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

//         TaskRepository.getTasks()
//         .stream()
//         .map(u->u.getDeadline())
//         .forEach(un -> System.out.println(un));

    LocalDate data = LocalDate.now();

         List<LocalDate> dataList=TaskRepository.getTasks()
         .stream()
         .filter(u->u.getDeadline().isAfter(data))
         .map(TaskManager::getTaskData)
         .collect(Collectors.toList());

        System.out.println(dataList);
    }

    public static LocalDate getTaskData(Task task){
        return task.getDeadline();
    }


}
