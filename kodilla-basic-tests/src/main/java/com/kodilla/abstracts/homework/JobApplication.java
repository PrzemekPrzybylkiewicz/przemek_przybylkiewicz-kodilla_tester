package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {


        Job programista = new Programista();
        Person person = new Person();
        person.process(programista);
        person.firstName="Tomasz";
        person.age=33;
        System.out.println("Kandydat "+person.firstName + " lat " +person.age);



    }
}
