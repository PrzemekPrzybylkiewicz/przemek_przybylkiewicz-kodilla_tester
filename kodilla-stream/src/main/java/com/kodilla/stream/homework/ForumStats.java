package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {

    public static void main(String[] args) {
       UsersRepository.getUserList()
                .stream()
                .map(u->u.getAge()).mapToInt(n->n).average().getAsDouble();
      


//        UsersRepository.getUserList()
//                .stream()
//                .forEach(e->{numberlist.add(e.getAge());});

    }
}
