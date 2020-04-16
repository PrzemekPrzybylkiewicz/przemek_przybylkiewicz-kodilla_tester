package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Test_1234.-"})
    // tu mam jakis bład z kodu wykasowąłem \n
    public void isUserNameIsCorrect(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"przemek@gmail.com"})
    public void isMailIsCorrect(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

}