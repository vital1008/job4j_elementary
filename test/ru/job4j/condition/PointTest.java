package ru.job4j.condition;

import org.junit.Assert;

import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20them2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void when10to01them1() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when11to56them6() {
        double expected = 6.40;
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out,  0.01);
    }


}