package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.factory.DriverFactory;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.ProductA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
            public void souldBeAbleToaddToCart () throws InterruptedException {



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
        Thread.sleep(10000);


    }

}
