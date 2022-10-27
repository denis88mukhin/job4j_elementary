package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13To85Then7point28() {
        double expected = 7.28;
        int x1 = 1;
        int y1 = 3;
        int x2 = 8;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00ToMinus6Minus4Then7point21() {
        double expected = 7.21;
        int x1 = 0;
        int y1 = 0;
        int x2 = -6;
        int y2 = -4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus6Minus4To23Then10point63() {
        double expected = 10.63;
        int x1 = -6;
        int y1 = -4;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}