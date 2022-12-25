package com.example;

import org.junit.Assert;
import org.junit.Test;

public class FelineTests {
    Feline feline = new Feline();
    TestData testData = new TestData();

    @Test
    public void eatMeatTest() throws Exception {
        Assert.assertEquals(testData.getArray(), feline.eatMeat());
    }

    @Test
    public void getPredatorFamilyTest() {
        Assert.assertEquals(testData.getCatFamily(), feline.getFamily());
    }

    @Test
    public void getKittensWithoutNumberTest() {
        Assert.assertEquals(testData.getOneKitten(), feline.getKittens());
    }
}
