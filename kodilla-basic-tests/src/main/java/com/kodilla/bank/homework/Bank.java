package com.kodilla.bank.homework;

public class Bank {
    public static void main(String[] args) {

    CashMachine cashMachine = new CashMachine();
    cashMachine.losoweLiczby();
    System.out.println(cashMachine.bankSaldo() + " Saldo konta");
    System.out.println(cashMachine.income() + " ilość wpłat" );
    System.out.println(cashMachine.charge()+ " ilość wypłat");
    System.out.println(cashMachine.midIncome() + " Sredni przychód ");
    System.out.println(cashMachine.midCharge() + " Sredni koszt");
    }
}
