package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.factory.DriverFactory;
import com.tricentis.demowebshop.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class LoginTest  {



    @Test
    public void shouldBeAbleToLoginWithEmailandPassword()  {
        WebDriver driver = new DriverFactory().initializeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loginFunction();
        String logout =  driver.findElement(By.cssSelector("[href=\"/logout\"]")).getText();
        System.out.println(logout);
        Assert.assertEquals(logout , "Log out");


//        hhhh
    }







}
