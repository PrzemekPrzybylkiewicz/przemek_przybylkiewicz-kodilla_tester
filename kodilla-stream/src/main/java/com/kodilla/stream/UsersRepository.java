package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    public static List<User> getUserList(){
    List<User> users = new ArrayList<>();
    users.add(new User("Zawodnik 1", 26 ,7 ,"Chemists"));
    users.add(new User("Zawodnik 2", 36 ,4 ,"Menager"));
    users.add(new User("Zawodnik 3", 25 ,6 ,"Chemists"));
    users.add(new User("Zawodnik 4", 45 ,13 ,"Menager"));
    users.add(new User("Zawodnik 5", 27 ,6 ,"Chemists"));
    users.add(new User("Zawodnik 6", 17 ,16 ,"Menager"));
    return users;
    }
}
