package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckOut1Test extends BaseTest {
@Test
    public void CheckOutPage1() throws InterruptedException {


        //driver.get("https://demowebshop.tricentis.com/login");
        driver.get("https://demowebshop.tricentis.com/register");
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        //LoginPage loginPage = new LoginPage(driver);
       // loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("1");
        productA.addToCart();
        productA.shoppingCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.termOfService();
        cartPage.checkOut();
        CheckoutPage1 checkoutPage1= new CheckoutPage1(driver);
        checkoutPage1.fillAddressDetails();
        Thread.sleep(1000);


    }



}
