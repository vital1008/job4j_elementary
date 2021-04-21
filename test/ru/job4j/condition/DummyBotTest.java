package ru.job4j.condition;

import org.junit.Assert;

import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBo() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, result);
    }
}