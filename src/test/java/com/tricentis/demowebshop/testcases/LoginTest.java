package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.base.BaseTest;

import com.tricentis.demowebshop.pages.LoginPage;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {



    @Test (description = "Test the login function with valid email and password")
    public void shouldBeAbleToLoginWithEmailandPassword()  {

        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loginFunction();
        String logout =  driver.findElement(By.cssSelector("[href=\"/logout\"]")).getText();
        System.out.println(logout);
       // Assert.assertEquals(logout , "Log out");
        loginPage.logoutBtn();
    }







}
