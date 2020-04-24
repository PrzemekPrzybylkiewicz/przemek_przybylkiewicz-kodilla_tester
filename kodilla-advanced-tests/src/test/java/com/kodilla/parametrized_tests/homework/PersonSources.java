package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideNumbsForTesting() {
        return Stream.of(
                Arguments.of(new Person( 1.70, 40,"Very severely underweight")),
                Arguments.of(new Person( 1.70, 45,"Severely underweight"))
//                Arguments.of(new Person( 1.70, 70)),
//                Arguments.of(new Person( 1.70, 80)),
//                Arguments.of(new Person( 1.70, 90)),
//                Arguments.of(new Person( 1.70, 100))
        );
    }
}
