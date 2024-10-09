package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.base.BaseTest;

import com.tricentis.demowebshop.pages.LoginPage;

import io.qameta.allure.Feature;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Login Feature")
public class LoginTest extends BaseTest {



    @Test (description = "Test the login function with valid email and password")
    public void shouldBeAbleToLoginWithEmailandPassword()  {

        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loginFunction();
        String logout =  driver.findElement(By.cssSelector("[href=\"/logout\"]")).getText();
        System.out.println(logout);
        Assert.assertEquals(logout , "Log out");
        loginPage.logoutBtn();
    }


    @Test
    public void shouldNotBeAbleToLoginWhenEmailandPasswordAreBlank(){
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.checkErrorMessage();
    }

    @Test
    public void shouldNotBeAbleToLoginWithValidEmailandInvalidPassword (){
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loginFunctionWithInValidEmailandvalidPassword();

    }


    @Test
    public void shouldNotBeAbleToLoginWithInvalidEmailandvalidPassword (){
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loginFunctionWithInValidEmailandvalidPassword();

    }









}
