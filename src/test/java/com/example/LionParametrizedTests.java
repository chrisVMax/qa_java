package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParametrizedTests {
    private final String sex;
    private final boolean expected;
    TestData testData = new TestData();
    @Mock
    Feline feline;


    public LionParametrizedTests(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
                { "Не определился", false},
        };
    }
    @Test
    public void getLionSexTest() {
        try{
           Lion lion = new Lion(sex, feline);
           Assert.assertEquals(expected, lion.doesHaveMane());
        } catch (Exception e) {
            Assert.assertTrue(e.toString().contains(testData.getException()));
        }
    }

}



