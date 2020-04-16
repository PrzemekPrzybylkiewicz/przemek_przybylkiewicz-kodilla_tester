package com.kodilla.bank.homework;

import java.util.Random;

public class CashMachine {

    private double saldo;
    private double income;
    private double charge;
    private int numOfTransaction;
    private int numOfPayment;
    private double midIncome;
    private double midCharge;

    double[] atm = new double[10];

    void losoweLiczby() {
        Random random = new Random();
        for (int i = 0; i < atm.length; i++) {
            atm[i] = random.nextInt(20000) - 10000;
            System.out.println(atm[i]);
            System.out.println("");
        }
    }

    public double bankSaldo() {
        for (int i = 0; i < atm.length; i++) {
            saldo += atm[i];
        }
        return saldo;
    }

    public double income() {
        for (int i = 0; i < atm.length; i++) {
            if (atm[i] > 0) {
                income += atm[i];
                numOfTransaction++;
            }
        }
        return numOfTransaction;
    }

    public double charge() {
        for (int i = 0; i < atm.length; i++) {
            if (atm[i] < 0) {
                charge += atm[i];// suma wypłat
                numOfPayment++; // ilosc wypłat
            }
        }
        return numOfPayment++;
    }

    public double midIncome() {
        return midIncome = income / numOfTransaction;
    }

    public double midCharge() {
        return midCharge = charge / numOfPayment;
    }

}
