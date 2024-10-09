package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.factory.DriverFactory;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.ProductA;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{

    @Test (description = "Should be able to add product to cart ",priority = 1)
    public void souldBeAbleToaddToCart () throws InterruptedException {

        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("6");
        productA.addToCart();
        productA.shoppingCart();
        Thread.sleep(1000);
    }
    @Test(description = "Verify_ThatErrorMessage_forProduct_isdisplay",priority = 2)
    public void Verify_ThatErrorMessage_forProduct_isdisplay() throws InterruptedException {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("0");
        productA.addToCart();
        Thread.sleep(10000);
        Assert.assertEquals(productA.ShowProductErrorMessage(),"  Quantity should be positive");
        System.out.println(productA.displayProductErrorMessage());
        System.out.println(productA.ShowProductErrorMessage());
    }
    @Test(description = "Verify_Addtocomparelist_Button",priority = 3)
    public void Verify_Addtocomparelist_Button(){
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.ClickOnAddtocomparelist();
        Assert.assertNotEquals(productA.Showcomparelist(),null);
        System.out.println(productA.displaycomparelist());
        System.out.println(productA.Showcomparelist());
    }
    @Test(description = "Verify_Remove_compareProducts",priority = 4)
    public void Verify_Remove_compareProducts() throws InterruptedException {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.ClickOnAddtocomparelist();
        productA.ClickRemoveBU();
        Thread.sleep(10000);
        Assert.assertEquals(productA.ShowMessagecompare(),"You have no items to compare.");
        System.out.println(productA.ShowMessagecompare());
        System.out.println(productA.displayMessagecompare());
    }



}
