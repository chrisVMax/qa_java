package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {

    Animal animal = new Animal();
    TestData testData = new TestData();

    @Test
    public void getFoodPredatorTest() throws Exception {
        Assert.assertEquals(testData.getArray(), animal.getFood(testData.getPredatorAnimalType()));
    }
    @Test
    public void getFoodHerbivorousTest() throws Exception {
        Assert.assertEquals(testData.getHerbivorousFoodTypes(), animal.getFood(testData.getHerbivorousAnimalType()));
    }
    @Test
    public void getFoodShouldThrowExceptionTest() {
        try {
            animal.getFood(testData.getUndefinedAnimalType());
        } catch (Exception e) {
            Assert.assertTrue(e.toString().contains(testData.getAnimalTypeExceptionText()));
        }
    }
    @Test
    public void getFamilyTest() {
        Assert.assertEquals(testData.getAnimalsFamilies(), animal.getFamily());
    }
}





