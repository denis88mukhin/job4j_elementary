package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To85Then7point28() {
        double expected = 7.28;
        Point a = new Point(1, 3);
        Point b = new Point(8, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00ToMinus6Minus4Then7point21() {
        double expected = 7.21;
        Point a = new Point(0, 0);
        Point b = new Point(-6, -4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus6Minus4To23Then10point63() {
        double expected = 10.63;
        Point a = new Point(-6, -4);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}