package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.CartPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.ProductA;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Feature("Cart Page")
public class CartPageTest extends BaseTest {
    @Test
    public void cartPage() throws InterruptedException {


        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.searchInput();
        Thread.sleep(1000);
        homePage.searchBtn();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Lap")).click();
        Thread.sleep(1000);
        ProductA productA = new ProductA(driver);
        Thread.sleep(1000);
        productA.changeQuantity("3");
        Thread.sleep(1000);
        productA.addToCart();
        Thread.sleep(1000);
        productA.shoppingCart();
        Thread.sleep(1000);
        CartPage cartPage = new CartPage(driver);
        Thread.sleep(1000);
        cartPage.termOfService();
        Thread.sleep(1000);
        cartPage.checkOut();
        Thread.sleep(1000);


    }
  /*  @Test
    public void removeItemFromCart(

    )*/
}
