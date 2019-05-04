package com.albayrak.erdil.oca.ch2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyMathTest {

    private MyMath math;

    @BeforeEach
    void setUp() {
        math = new MyMath();
    }

    @Test
    void testSuccessfulDivision() {
        final int first = 10;
        final int second = 5;
        final double result = math.div(first, second);
        assertEquals(first / second, result);
    }

    @Test
    void testIfDivideByZeroThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> math.div(10, 0));
    }

    @Test
    void testMultipleOperandSumOperation() {
        int result = (int) math.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(result);

        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        final List evenNumbers = integerList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        final long numOdds = integerList.stream().filter(i -> i % 2 == 1).count();
        System.out.println(numOdds);

        final List newIntegers = integerList.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(newIntegers);
    }
}