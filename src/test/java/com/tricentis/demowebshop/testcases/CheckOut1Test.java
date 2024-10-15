package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.*;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Checkout Feature")
public class CheckOut1Test extends BaseTest {
    @Test(priority = 1)
    public void CheckOutPage1() throws InterruptedException {


        //driver.get("https://demowebshop.tricentis.com/login");
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

    }
    @Test(description = "Verify_Shippingmethod_and_PaymentMethod_Functionality",priority = 2)
    public void Verify_ThatUserCanChooses_DeliveryMethod1_and_PaymentMethod2() throws InterruptedException {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
         loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("4");
        productA.addToCart();
        productA.shoppingCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.termOfService();
        cartPage.checkOut();
        CheckoutPage1 checkoutPage1= new CheckoutPage1(driver);
        checkoutPage1.clickContinue();
        checkoutPage1.continueButton();
        checkoutPage1.getShippingmethodGround();
      //  Thread.sleep(1000);
        checkoutPage1.continueShippingmethod();
      //  Thread.sleep(1000);
        checkoutPage1.getCheckMoneyOrderPay();
        checkoutPage1.continuePayment();
      //  Thread.sleep(2000);
        Assert.assertNotEquals(checkoutPage1.getPaymentInfoMes(),null);
        System.out.println(checkoutPage1.getPaymentInfoMes());

    }
    @Test(description = "Verify_Shippingmethod_and_PaymentMethod_Functionality",priority = 3)
    public void Verify_ThatUserCanChooses_DeliveryMethod2_and_PaymentMethod3() throws InterruptedException {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.Shoppingcart();
        CartPage cartPage = new CartPage(driver);
        cartPage.termOfService();
        cartPage.checkOut();
        CheckoutPage1 checkoutPage1= new CheckoutPage1(driver);
        checkoutPage1.clickContinue();
        checkoutPage1.continueButton();
        checkoutPage1.getShippingmethodNextDayAir();
     //   Thread.sleep(1000);
        checkoutPage1.continueShippingmethod();
      //  Thread.sleep(1000);
        checkoutPage1.getCreditCardPay();
        checkoutPage1.continuePayment();
      //  Thread.sleep(2000);
        Assert.assertNotEquals(checkoutPage1.getPaymentmethod(),null);
        System.out.println(checkoutPage1.getPaymentmethod());

    }
    @Test(description = "Verify_Shippingmethod_and_PaymentMethod_Functionality",priority = 4)
    public void Verify_ThatUserCanChooses_DeliveryMethod3_and_PaymentMethod4() throws InterruptedException {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("8");
        productA.addToCart();
        productA.shoppingCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.termOfService();
        cartPage.checkOut();
        CheckoutPage1 checkoutPage1= new CheckoutPage1(driver);
        checkoutPage1.clickContinue();
        checkoutPage1.continueButton();
        checkoutPage1.getShippingmethod2ndDayAir();
      //  Thread.sleep(1000);
        checkoutPage1.continueShippingmethod();
      //  Thread.sleep(1000);
        checkoutPage1.getPurchaseOrderPay();
        checkoutPage1.continuePayment();
      //  Thread.sleep(2000);
        Assert.assertNotEquals(checkoutPage1.getPaymentmethod(),null);
        System.out.println(checkoutPage1.getPaymentmethod());

    }
//    @Test(description = "Verify_ThatUserCanChooses_CreditCardType",priority = 5)
//    public void Verify_ThatUserCanChooses_CreditCardType() throws InterruptedException {
//        RegisterPage registerPage= new RegisterPage(driver);
//        registerPage.RegisterFN();
//        driver.get("https://demowebshop.tricentis.com/login");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.loginFunction();
//        HomePage homePage = new HomePage(driver);
//        homePage.Shoppingcart();
//        CartPage cartPage = new CartPage(driver);
//        cartPage.termOfService();
//        cartPage.checkOut();
//        CheckoutPage1 checkoutPage1= new CheckoutPage1(driver);
//        checkoutPage1.clickContinue();
//        checkoutPage1.continueButton();
//        checkoutPage1.getShippingmethodNextDayAir();
//        Thread.sleep(1000);
//        checkoutPage1.continueShippingmethod();
//        Thread.sleep(1000);
//        checkoutPage1.getCreditCardPay();
//        checkoutPage1.continuePayment();
//        WebElement dropdownElement = driver.findElement(By.id("CreditCardType"));
//
////   Select class is used to interact with <select> HTML elements.
//        Select creditCardDropdown = new Select(dropdownElement);
////   SelectByValue(" ") selects the option "Visa" from the dropdown.
//        creditCardDropdown.selectByValue("MasterCard");
//        checkoutPage1.CardholderButtons();
//        WebElement Expirationdate = driver.findElement(By.id("id=\"ExpireMonth\""));
//        Select ExpireMonth = new Select(Expirationdate);
//        ExpireMonth.selectByIndex(11);
//        WebElement Expirationdate0 = driver.findElement(By.id("id=\"ExpireYear\""));
//        Select ExpireYear = new Select(Expirationdate0);
//        ExpireYear.selectByIndex(4);
//        Thread.sleep(2000);
////        checkoutPage1.CardCodeField();
//        checkoutPage1.continuePaymentInfo();
//        Thread.sleep(2000);

//    }
@Test(description = "Verify_PurchaseOrderNumber",priority = 5)
public void Verify_ThatUserCan_Enter_PurchaseOrderNumber() throws InterruptedException {
    RegisterPage registerPage= new RegisterPage(driver);
    registerPage.RegisterFN();
    driver.get("https://demowebshop.tricentis.com/login");
    LoginPage loginPage = new LoginPage(driver);
    loginPage.loginFunction();
    HomePage homePage = new HomePage(driver);
    homePage.searchInput();
    homePage.searchBtn();
    driver.findElement(By.partialLinkText("Lap")).click();
    ProductA productA = new ProductA(driver);
    productA.changeQuantity("8");
    productA.addToCart();
    productA.shoppingCart();
    CartPage cartPage = new CartPage(driver);
    cartPage.termOfService();
    cartPage.checkOut();
    CheckoutPage1 checkoutPage1= new CheckoutPage1(driver);
    checkoutPage1.clickContinue();
    checkoutPage1.continueButton();
    checkoutPage1.getShippingmethod2ndDayAir();
  //  Thread.sleep(1000);
    checkoutPage1.continueShippingmethod();
 //   Thread.sleep(1000);
    checkoutPage1.getPurchaseOrderPay();
    checkoutPage1.continuePayment();
 //   Thread.sleep(2000);
    checkoutPage1.PurchaseOrderNumberField("123456");
    checkoutPage1.continuePaymentInfo();
 //   Thread.sleep(1000);

}









}
