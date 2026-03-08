package com.tests;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void loginTest() {
        System.out.println("Login test running");
    }

    @Test(priority = 1)
    public void openBrowser() {
        System.out.println("Browser opened");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("User logged in");
    }

    @Test(priority = 3)
    public void logout() {
        System.out.println("User logged out");
    }
}