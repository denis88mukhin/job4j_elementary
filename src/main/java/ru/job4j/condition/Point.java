package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0, 0) to (2, 0) " + result);
        result = Point.distance(0, 0, 4, 2);
        System.out.println("Result (0, 0) to (4, 2) " + result);
        result = Point.distance(1, 3, 8, 5);
        System.out.println("Result (1, 3) to (8, 5) " + result);
        result = Point.distance(-6, -4, 2, 3);
        System.out.println("Result (-6, -4) to (2, 3) " + result);
        result = Point.distance(0, 0, -6, -4);
        System.out.println("Result (0, 0) to (-6, -4) " + result);
    }
}
