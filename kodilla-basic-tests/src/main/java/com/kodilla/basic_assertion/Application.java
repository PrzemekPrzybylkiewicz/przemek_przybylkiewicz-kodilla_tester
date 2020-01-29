package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
       int x = 5;
       int y = 6;
       int sumCal= calculator.addNum(x,y);
       boolean correct = ResultChecker.assertEquals(13,sumCal);
       if(correct){
           System.out.println("suma jest poprawna"+x + "i"+y);
       }else {
           System.out.println("wartość dodawania się nie zgadza");
       }
        // zadanie 1. dodaj test dla metody odejmującej liczby.

        int subNum = calculator.subtruckNum(x,y);
        boolean subCorrect = ResultChecker.assertEquals(-1,subNum);
        if(subCorrect){
            System.out.println("Metoda odejmowania dziła "+ x + " i " +y +" = "+ subNum + " oczekiwany rezultat -1" );
        }else {
            System.out.println("wartość odejmowania się nie zgadza");
        }
        //2. W klasie Calculator dodaj metodę podnoszącą liczbę do kwadratu
        double subPow = calculator.powNum(x,y);
        boolean powCorrect = ResultChecker.assertEquals(15625, subPow);
        if(powCorrect){
            System.out.println("Metoda potegowania dziła "+ x + " i " +y +" = "+ powCorrect + " oczekiwany rezultat 78 125" );
        }else {
            System.out.println("wartość potegowania się nie zgadza");
        }



    }
}
