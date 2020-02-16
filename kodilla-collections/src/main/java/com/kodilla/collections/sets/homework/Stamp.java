package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private int stampSize;
    private char stampSignature;

    public Stamp(String stampName, int stampSize, char stampSignature) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampSignature = stampSignature;
    }

    public String getStampName() {
        return stampName;
    }

    public int getStampSize() {
        return stampSize;
    }

    public char getStampSignature() {
        return stampSignature;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stampSignature=" + stampSignature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampSize == stamp.stampSize &&
                stampSignature == stamp.stampSignature &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampSignature);
    }
}
