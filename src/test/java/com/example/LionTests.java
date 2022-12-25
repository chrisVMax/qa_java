package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    TestData testData = new TestData();
    @Mock
    Feline feline;

    @Test
    public void getLionKittensTest() throws Exception {
        Lion lion = new Lion(testData.getMale(), feline);
        Mockito.when(feline.getKittens()).thenReturn(testData.getOneKitten());
        Assert.assertEquals(testData.getOneKitten(), lion.getKittens());
    }
    @Test
    public void getLionFoodTest() throws Exception {
        Lion lion = new Lion(testData.getFemale(), feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(testData.getArray());
        Assert.assertEquals(testData.getArray(), lion.getFood());
    }
}


