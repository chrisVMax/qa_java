package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    TestData testData = new TestData();
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String result = cat.getSound();
        Assert.assertEquals(testData.getCatSound(), result);
    }

    @Test
    public void getCatFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(testData.getArray());
        Assert.assertEquals(testData.getArray(), cat.getFood());
    }
}

