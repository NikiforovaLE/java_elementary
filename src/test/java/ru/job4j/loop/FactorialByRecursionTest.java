package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialByRecursionTest {

    @Test
    @DisplayName("Test the calc method when n = 0 then result = 1")
    void calcWhenNIs0Then1() {
        int in = 0;
        int out = FactorialByRecursion.calc(in);
        int expected = 1;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test the calc method when n = 1 then result = 1")
    void calcWhenNIs1Then1() {
        int in = 1;
        int out = FactorialByRecursion.calc(in);
        int expected = 1;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test the calc method when n = -5 then result = -1")
    void calcWhenNIsNegativeThenError() {
        int in = -5;
        int out = FactorialByRecursion.calc(in);
        int expected = -1;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test the calc method when n = 62 then result = 2")
    void calcWhenNIs2Then2() {
        int in = 2;
        int out = FactorialByRecursion.calc(in);
        int expected = 2;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test the calc method when n = 3 then result = 6")
    void calcWhenNIs3Then6() {
        int in = 3;
        int out = FactorialByRecursion.calc(in);
        int expected = 6;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test the calc method when n = 6 then result = 720")
    void calcWhenNIs6Then720() {
        int in = 6;
        int out = FactorialByRecursion.calc(in);
        int expected = 720;
        assertEquals(expected, out);
    }
}