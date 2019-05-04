package com.albayrak.erdil.oca.ch2;

import org.junit.jupiter.api.*;

class ATest {

    private A a;

    @BeforeAll
    static void globalSetUp() {
        System.out.println("global setup");
    }

    @AfterAll
    static void globalTearDown() {
        System.out.println("global teardown");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setup A");
        a = new A();
    }

    @AfterEach
    void tearDown() {
        System.out.println("teardown A");
        a = null;
    }

    @Test
    public void testFoo() {
        a.foo();
    }

    @Test()
    public void testBar() {
        final boolean bool = false;

        assert bool;

        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("exception");
        });
//        a.bar();
    }
}