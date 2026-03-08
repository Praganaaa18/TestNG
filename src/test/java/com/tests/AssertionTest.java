package com.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    @Test
    public void verifyTitle() {
        String expected = "Google";
        String actual = "Google";

        Assert.assertEquals(actual, expected);
    }
}
