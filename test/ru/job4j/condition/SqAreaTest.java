package ru.job4j.condition;

import org.junit.Assert;

import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square4() {
        int expected = 4;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void whenP8K4Square13() {
        double expected = 12.8;
        int p = 8;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void whenP12K6Square31() {
        double expected = 30.86;
        int p = 12;
        int k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}