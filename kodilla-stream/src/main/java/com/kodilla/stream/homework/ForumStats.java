package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {

    public static void main(String[] args) {
        double avgless40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() <= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();

        System.out.println(" 40 < " + avgless40);


        double avg = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();

        System.out.println("40 > " + avg);

//        UsersRepository.getUserList()
//                .stream()
//                .forEach(e->{numberlist.add(e.getAge());});

    }
}
