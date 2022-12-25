package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {
    @Mock
    Feline feline;

    TestData testData = new TestData();

    @Test
    public void getLionAlexFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(testData.getLionAlexFriends(), lionAlex.getFriends());
    }
    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(testData.getLionAlexPlaceOfLiving(), lionAlex.getPlaceOfLiving());
    }
    @Test
    public void getLionAlexSexTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertTrue(lionAlex.doesHaveMane());
    }
    @Test
    public void getLionAlexKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(testData.getZeroKitten() ,lionAlex.getKittens());
    }
}