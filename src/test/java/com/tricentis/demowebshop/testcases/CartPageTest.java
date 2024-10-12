package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.CartPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.ProductA;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Cart Feature")
public class CartPageTest extends BaseTest {
    @Test(description = "Verify Main Functionality to cart", priority = 1)
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
    @Test(description = "Verify_Error_MessageWhen_ClickOnCheckout_without_Clickoncheckbox",priority = 2)
    public void Verify_Error_MessageWhen_ClickOnCheckout_without_Clickoncheckbox() throws InterruptedException {
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.Shoppingcart();
        CartPage cartPage = new CartPage(driver);
        cartPage.checkOut();
        Thread.sleep(1000);
        Assert.assertEquals(cartPage.ShowErrorMessage(),"Terms of service");
        System.out.println(cartPage.DisplayErrorMes());
        System.out.println(cartPage.getErrorM());
        Thread.sleep(1000);
    }
    @Test(description = "Verify_ThatUpdateProductfromcart",priority = 3)
    public void Verify_ThatUpdateProductfromcart() throws InterruptedException {
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.Shoppingcart();
        CartPage cartPage = new CartPage(driver);
        cartPage.ChangeQuantityCart("6");
        Thread.sleep(1000);
        cartPage.CheckUpdateCart();
        Thread.sleep(10000);
        Assert.assertEquals(cartPage.changeQuantityCart(),true);
        System.out.println(cartPage.NivagetToCartPage1());
        System.out.println(cartPage.NivagetToCartPage());
    }
    @Test(description = "Verify_ThatRemoveProductfromcart",priority = 4)
    public void Verify_ThatRemoveProductfromcart() throws InterruptedException {
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
        productA.changeQuantity("1");
        productA.addToCart();
        Thread.sleep(1000);
        productA.shoppingCart();
        Thread.sleep(1000);
        CartPage cartPage = new CartPage(driver);
        cartPage.ClickOnCheckBox();
        Thread.sleep(10000);
        cartPage.CheckUpdateCart();
        Thread.sleep(10000);
        Assert.assertNotEquals(cartPage.NivagetToCartPage(),"[Your Shopping Cart is empty!]");
        System.out.println(cartPage.NivagetToCartPage1());
        System.out.println(cartPage.NivagetToCartPage());
    }


}
