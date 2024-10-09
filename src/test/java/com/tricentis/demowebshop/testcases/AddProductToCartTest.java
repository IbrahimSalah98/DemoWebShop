package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.ProductA;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
@Feature("Add To Cart Feature")
public class AddProductToCartTest extends BaseTest{

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
