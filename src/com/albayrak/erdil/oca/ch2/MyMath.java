package com.albayrak.erdil.oca.ch2;

public class MyMath {

    public double div(final int first, final int second) {
        return first / second;
    }

    public float sum(final int... operandArray) {
        int sum = 0;
        for (int operand : operandArray) {
            sum += operand;
        }
        return sum;
    }

}
