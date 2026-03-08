package com.tests;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeMethod
    public void setup() {
        System.out.println("Open Browser");
    }

    @Test
    public void loginTest() {
        System.out.println("Login test running");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Close Browser");
    }
}
