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
    @Test(description = "Verify Main Functionality to cart")
    public void cartPage()  {
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("3");
        productA.addToCart();
        productA.shoppingCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.termOfService();
        cartPage.checkOut();
    }
    @Test(description = "Verify_Error_MessageWhen_ClickOnCheckout_without_Clickoncheckbox",priority = 2)
    public void Verify_Error_MessageWhen_ClickOnCheckout_without_Clickoncheckbox(){
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.Shoppingcart();
        CartPage cartPage = new CartPage(driver);
        cartPage.checkOut();
        Assert.assertEquals(cartPage.ShowErrorMessage(),"Terms of service");
        System.out.println(cartPage.DisplayErrorMes());
        System.out.println(cartPage.getErrorM());
    }
    @Test(description = "Verify_ThatUpdateProductfromcart")
    public void Verify_ThatUpdateProductfromcart() {
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("3");
        productA.addToCart();
        homePage.Shoppingcart();
        CartPage cartPage = new CartPage(driver);
        cartPage.ChangeQuantityCart("6");
        cartPage.CheckUpdateCart();
        Assert.assertEquals(cartPage.changeQuantityCart(),true);
    }
    @Test(description = "Verify_ThatRemoveProductfromcart")
    public void Verify_ThatRemoveProductfromcart(){
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("1");
        productA.addToCart();
        productA.shoppingCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.ClickOnCheckBox();
        cartPage.CheckUpdateCart();
        Assert.assertNotEquals(cartPage.NivagetToCartPage(),"[Your Shopping Cart is empty!]");
        System.out.println(cartPage.NivagetToCartPage1());
        System.out.println(cartPage.NivagetToCartPage());
    }
}
