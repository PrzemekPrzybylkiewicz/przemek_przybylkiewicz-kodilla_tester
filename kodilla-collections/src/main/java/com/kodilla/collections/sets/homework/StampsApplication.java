package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("George Washington", 5, 'Y'));
        stamps.add(new Stamp("Liberty", 6, 'N'));
        stamps.add(new Stamp("Oregon", 4, 'Y'));
        stamps.add(new Stamp("Nevada", 6, 'N'));
        stamps.add(new Stamp("Illinois", 4, 'Y'));
        stamps.add(new Stamp("George Washington", 5, 'Y'));
        stamps.add(new Stamp("George Washington ", 5, 'Y'));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }

}
