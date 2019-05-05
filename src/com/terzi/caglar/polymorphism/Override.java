package com.terzi.caglar.polymorphism;

public class Override {
    public static void main(String[] args) {
        override("asd");
        override(new Double(4));
        override(new String("45"));
        override(23.31);
        override((int)23);
        override((long)34);
    }

    public static void override(String s)
    {
        System.out.println("str" + s);
    }

    public static void override(Object o)
    {
        System.out.println("obj" + o);
    }

    public static void override(int a)
    {
        System.out.println("int " + a);
    }

    public static void override(long l)
    {
        System.out.println("long" + l);
    }
}
