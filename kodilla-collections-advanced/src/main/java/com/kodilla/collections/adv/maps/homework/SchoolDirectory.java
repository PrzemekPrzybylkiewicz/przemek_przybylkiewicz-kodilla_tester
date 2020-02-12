package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal , School> schoolMap = new HashMap<>();
        Principal mrEd = new Principal("Edward ", " Whiteman");
        Principal mrAd = new Principal("Adam ", " Blackman");
        Principal mrTom = new Principal("Thomas ", " Pinkman");


        School mrEdSchool = new School(30, 26 , 23 , 15 , 33 , 25 , 36);
        School mrAdSchool = new School(34, 20 , 21 , 18, 31 , 26 , 14);
        School mrTomSchool = new School(32, 30 , 28 , 14 , 38 , 22 , 26);

        schoolMap.put(mrEd, mrEdSchool);
        schoolMap.put(mrAd, mrAdSchool );
        schoolMap.put(mrTom, mrTomSchool );

        System.out.println(schoolMap.get(mrAd));

        for (Map.Entry<Principal,School> schoolEntry : schoolMap.entrySet())
            System.out.println(" Dyrektor "+ schoolEntry.getKey().getLastname() + schoolEntry.getValue() );

    }
}
