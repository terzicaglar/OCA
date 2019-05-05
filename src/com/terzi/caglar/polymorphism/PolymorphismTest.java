package com.terzi.caglar.polymorphism;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class PolymorphismTest {

    @Test
    void testIfTypeCastedAnimalObjectBarks()
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.sound();
        animal = (Animal)dog;

        assertTrue(animal instanceof Animal);
        assertTrue(animal instanceof Dog);
        assertFalse(animal instanceof Cat);
    }

}
