package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

//    Person person = new Person(1.70, 40,"Very severely underweight");
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideNumbsForTesting")
    public void shouldCalculateBMI(Person person ) {
        assertEquals(person.getName(),person.getBMI());
    }

}