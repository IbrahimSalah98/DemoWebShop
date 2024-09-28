package com.tricentis.demowebshop.testcases;


import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.factory.DriverFactory;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.ProductA;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{

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

        productA.shoppingCart();
        Thread.sleep(10000);

        Thread.sleep(100000);
    }

    @Test
    public void fjdb() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver() ;
//        Thread.sleep(1000);
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.cssSelector("[id=\"Email\"]")).sendKeys("ibrahim@salah.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[id=\"Password\"]")).sendKeys("Hima2015");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[value=\"Log in\"]")).click();




    }

}
