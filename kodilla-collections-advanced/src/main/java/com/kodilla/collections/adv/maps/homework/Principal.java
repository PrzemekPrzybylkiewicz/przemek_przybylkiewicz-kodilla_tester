package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String name;
    private String lastname;

    public Principal(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name) &&
                Objects.equals(lastname, principal.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return name + lastname ;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
