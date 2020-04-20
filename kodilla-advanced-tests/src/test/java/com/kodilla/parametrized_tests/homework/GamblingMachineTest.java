package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTest {
    GamblingMachine gamblingMachine = new GamblingMachine();
    @ParameterizedTest
    @CsvFileSource(resources = "/generateNumber.csv", numLinesToSkip = 1)
    public void test(String input)  throws InvalidNumbersException {
        String[] gamNums = input.split(" ");
        Set<Integer> numbers = new HashSet<>();

        for (String num: gamNums) {
            numbers.add(Integer.parseInt(num));
        }
        int result = gamblingMachine.howManyWins(numbers);
        System.out.println(result);
    }

}