package org.example;

public class QuadraticEquation {
    public static double[] solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a must not be zero");
        }
        double delta = (b * b ) - (4* a * c);
        if (delta < 0) {
            return null;
            // Probably it is better to throw an exception too!
        }
        if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }
        return new double[]{
                // This line treats the case where delta is strictly positive
                (-b + Math.sqrt(delta)) / (2 * a),
                (-b - Math.sqrt(delta)) / (2 * a)
        };
    }
}
