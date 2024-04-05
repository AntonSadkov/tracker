package ru.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 8;
        assertThat(triangle.area())
                .isCloseTo(expected, offset(0.001));
    }

    @Test
    void when00and00and04ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = -1;
        assertThat(triangle.area())
                .isCloseTo(expected, offset(0.001));
    }
}