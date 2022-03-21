package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    @DisplayName("Test findMax method when first = 0, second = 65, then result = 65")
    void findMaxWhen0And65Then65() {
        int first = 0;
        int second = 65;
        int out = Max.findMax(first, second);
        int expected = 65;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 34, second = -35, then result = 34")
    void findMaxWhen34AndMinus35Then34() {
        int first = 34;
        int second = -35;
        int out = Max.findMax(first, second);
        int expected = 34;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 5, second = 5, then result = 5")
    void findMaxWhen5And5Then5() {
        int first = 5;
        int second = 5;
        int out = Max.findMax(first, second);
        int expected = 5;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 1, second = 2, third = 3, then result = 3")
    void findMaxWhen1And2And3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int out = Max.findMax(first, second, third);
        int expected = 3;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = -2, second = -1, third = -3, then result = -1")
    void findMaxWhenMinus2AndMinus1AndMinus3ThenMinus1() {
        int first = -2;
        int second = -1;
        int third = -3;
        int out = Max.findMax(first, second, third);
        int expected = -1;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 1, second = 1, third = 3, then result = 3")
    void findMaxWhen1And3And1Then3() {
        int first = 1;
        int second = 1;
        int third = 3;
        int out = Max.findMax(first, second, third);
        int expected = 3;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 1, second = 1, third = 1, then result = 1")
    void findMaxWhen1And1And1Then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int out = Max.findMax(first, second, third);
        int expected = 1;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 1, second = 2, third = 3, then result = 3")
    void findMaxWhen4And3And2And1Then4() {
        int first = 4;
        int second = 3;
        int third = 2;
        int fourth = 1;
        int out = Max.findMax(first, second, third, fourth);
        int expected = 4;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 4, second = 4, third = 4, fourth = 4, then result = 3")
    void findMaxWhen4And4And4And4Then4() {
        int first = 4;
        int second = 4;
        int third = 4;
        int fourth = 4;
        int out = Max.findMax(first, second, third, fourth);
        int expected = 4;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 2, second = 4, third = 3, fourth = 1, then result = 4")
    void findMaxWhen2And4And3And1Then4() {
        int first = 2;
        int second = 4;
        int third = 3;
        int fourth = 1;
        int out = Max.findMax(first, second, third, fourth);
        int expected = 4;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = -2, second = -4, third = -3, fourth = -1, then result = 4")
    void findMaxWhenMinus2AndMinus4AndMinus3AndMinus1ThenMinus1() {
        int first = -2;
        int second = -4;
        int third = -3;
        int fourth = -1;
        int out = Max.findMax(first, second, third, fourth);
        int expected = -1;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = -2, second = -3, third = 0, fourth = -1, then result = 0")
    void findMaxWhenMinus2AndMinus3And0AndMinus1Then0() {
        int first = -2;
        int second = -3;
        int third = 0;
        int fourth = -1;
        int out = Max.findMax(first, second, third, fourth);
        int expected = 0;
        assertEquals(expected, out);
    }

    @Test
    @DisplayName("Test findMax method when first = 0, second = 0, third = 0, fourth = 0, then result = 0")
    void findMaxWhen0And0And0And0Then0() {
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int out = Max.findMax(first, second, third, fourth);
        int expected = 0;
        assertEquals(expected, out);
    }
}