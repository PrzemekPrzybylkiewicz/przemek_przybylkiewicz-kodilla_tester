package com.kodilla.inheritance.homework;

public class BestBuy {
    public static void main(String[] args) {


    OperatingSystem operatingSystem =  new OperatingSystem(1986);
    operatingSystem.turnOff();
    Winxp winxp = new Winxp(2000);
    winxp.turnOn();
    MacOs macOs = new MacOs(2100);
    macOs.turnOff(); // wywołanie przez argument w konstruktorze
    macOs.whichYear();// wywołanie przez argument w konstruktorze
    winxp.whichYear();//tu z zmianą lokalna prywatna
}
}
