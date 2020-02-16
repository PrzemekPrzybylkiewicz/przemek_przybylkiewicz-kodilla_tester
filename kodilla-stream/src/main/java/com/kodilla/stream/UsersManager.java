package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUserList()
                .stream()
                .map(u -> u.getUsername())
                .forEach(un -> System.out.println(un));

    }
}
