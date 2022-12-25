package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensParametrizedTests {
    Feline feline = new Feline();
    private final int kittensNumber;
    private final int expected;


    public FelineGetKittensParametrizedTests(int kittensNumber, int expected) {
        this.kittensNumber = kittensNumber;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] kittensNumber() {
        return new Object[][] {
                { 1, 1},
                { 2, 2},
                { 10, 10},
                { 0, 0},
                { -10, -10},
        };
    }
    @Test
    public void getKittensWithNumberTest() {
        Assert.assertEquals(expected, feline.getKittens(kittensNumber));
    }


}



