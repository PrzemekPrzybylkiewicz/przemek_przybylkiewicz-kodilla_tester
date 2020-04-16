package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTest {
    StringValidator stringValidator = new StringValidator();

    @Test
    public void sholdReturnTrueIfStringIsHasOnlySpace() {
        boolean result = stringValidator.isBlank("  ");
        assertTrue(result);
    }

    @Test
    public void sholdReturnTrueIfStringIsEmpty() {
        boolean result = stringValidator.isBlank("");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        boolean result = stringValidator.isBlank("test");
        assertFalse(result);
    }

    ;

    @Test
    public void shouldReturnTrue() {
        assertTrue(stringValidator.isBlank(null));
    }
}