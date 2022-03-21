package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    @DisplayName("Test method distance when x1 = 0, y1 = 0, x2 = 2, y2 = 0, then result = 2")
    void distanceWhenX1Is0Y1Is0X2Is2Y2Is0Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }

    @Test
    @DisplayName("Test method distance when x1 = 0, y1 = 0, x2 = 0, y2 = 2, then result = 2")
    void distanceWhenX1Is0Y1Is0X2Is0Y2Is2Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }

    @Test
    @DisplayName("Test method distance when x1 = 0, y1 = 0, x2 = 0, y2 = 0, then result = 0")
    void distanceWhenX1Is0Y1Is0X2Is0Y2Is0Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double out = a.distance(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }

    @Test
    @DisplayName("Test method distance3D when x1 = 0, y1 = 0, z1 = 0, x2 = 0, y2 = 0, z2 = 1, then result = 1")
    void testDistance3DWhenX1Is0Y1Is0Z1Is0X2Is0Y2Is0ZIs1Then1() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 1);
        double expected = 1;
        double out = a.distance3D(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }

    @Test
    @DisplayName("Test method distance3D when x1 = 6, y1 = 6, z1 = 6, x2 = 4, y2 = 4, z2 = 4, then result = 3.464")
    void testDistance3DWhenX1Is6Y1Is6Z1Is6X2Is4Y2Is4ZIs4Then3Point464() {
        Point a = new Point(6, 6, 6);
        Point b = new Point(4, 4, 4);
        double expected = 3.464;
        double out = a.distance3D(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }

    @Test
    @DisplayName("Test method distance3D when x1 = 0, y1 = 0, z1 = 0, x2 = 0, y2 = 0, z2 = 0, then result = 0")
    void testDistance3DWhenX1Is0Y1Is0Z1Is0X2Is0Y2Is0ZIs0Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0;
        double out = a.distance3D(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }

    @Test
    @DisplayName("Test method distance3D when x1 = -1, y1 = -1, z1 = -1, x2 = 4, y2 = 4, z2 = 4, then result = 8.66")
    void testDistance3DWhenX1IsMinus1Y1IsMinus1Z1IsMinus1X2Is4Y2Is4ZIs4Then8Point66() {
        Point a = new Point(-1, -1, -1);
        Point b = new Point(4, 4, 4);
        double expected = 8.66;
        double out = a.distance3D(b);
        double eps = 0.01;
        assertEquals(expected, out, eps);
    }
}