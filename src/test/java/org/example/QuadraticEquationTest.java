package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    private QuadraticEquation quadraticEquation;

    @BeforeEach
    void SetUp() {
        quadraticEquation = new QuadraticEquation();
    }

    @Test
    void testUsingAEqualsZero() {
        double a = 0;
        double b = 2;
        double c = 3;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a, b, c));
    }

    @Test
    void testUsingDeltaLessThanZero() {
        double a = 1;
        double b = 1;
        double c = 1;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertNull(roots);
    }

    @Test
    void testUsingDeltaEqualsZero() {
        double a = 1;
        double b = 2;
        double c = 1;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{-b / (2 * a)}, roots);
    }

    @Test
    void testUsingDeltaGreaterThanZero() {
        double a = 1;
        double b = 4;
        double c = 3;
        double[] roots = QuadraticEquation.solve(a, b, c);
        assertArrayEquals(new double[]{(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)}, roots);
    }


}