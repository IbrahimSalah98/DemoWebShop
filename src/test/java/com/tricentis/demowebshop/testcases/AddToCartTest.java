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

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{

    @Test (description = "Should be able to add product to cart ")
    public void souldBeAbleToaddToCart () throws InterruptedException {

        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("3");
        productA.addToCart();

        productA.shoppingCart();
        Thread.sleep(1000);

    }



}
