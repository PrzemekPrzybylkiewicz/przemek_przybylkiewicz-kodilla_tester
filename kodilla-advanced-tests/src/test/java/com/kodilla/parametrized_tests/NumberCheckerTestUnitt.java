package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTestUnitt {
    NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldResultReturnTrueNumberEqualsThree(){
        // Zmienna typu boolean o nazwie result przypisanan do classy numberChecker i metody spradzajacej czy liczba
        // jest podzielna przez 3. bez reszty. %
        boolean result = numberChecker.isDivisibleByThree(9);
        // oczekiwany pozytywny wynik
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseIfNumberIsNotDivisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(2);
        //wynik pozytywny oczekiwany negatywny wynik testu
        assertFalse(result);
    }

}
