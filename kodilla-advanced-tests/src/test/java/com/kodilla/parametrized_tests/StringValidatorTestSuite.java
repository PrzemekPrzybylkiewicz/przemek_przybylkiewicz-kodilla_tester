package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "   ",})
    public void shouldReturnTrueIfStringIsEmpty(String m) {
        assertTrue(validator.isBlank(m));
    }


    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfNullSource(String text) {
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmptySource(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }

}