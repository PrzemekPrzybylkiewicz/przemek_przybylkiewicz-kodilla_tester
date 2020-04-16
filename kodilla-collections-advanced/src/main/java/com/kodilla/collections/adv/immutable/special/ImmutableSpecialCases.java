package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        String x = "XXX";
        String y = "XXX";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("");

        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;
        d = 10567;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        System.out.println("");
        Integer e = 10568;
        Integer f = 10568;
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
        System.out.println(e == f);
        String s = "text";
        String s2 = new String("text");
        System.out.println("");
        System.out.println(s.equals(s2));

        System.out.println(0.3 == 0.1 + 0.2);
        System.out.println(Math.abs(0.3 - (0.1 + 0.2)) < 0.000001);
    }
}
