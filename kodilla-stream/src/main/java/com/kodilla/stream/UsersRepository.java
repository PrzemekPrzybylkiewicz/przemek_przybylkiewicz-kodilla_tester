package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    public static List<User> getUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Zawodnik 1", 50, 7, "Chemists"));
        users.add(new User("Zawodnik 2", 28, 1, "Menager"));
        users.add(new User("Zawodnik 3", 14, 1, "Chemists"));
        users.add(new User("Zawodnik 4", 49, 0, "Menager"));
        users.add(new User("Zawodnik 5", 44, 2, "Chemists"));
        users.add(new User("Zawodnik 6", 57, 11, "Menager"));
        return users;
    }
}
