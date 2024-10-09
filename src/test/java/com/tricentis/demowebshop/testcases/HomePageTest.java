package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.factory.DriverFactory;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Home Page ")
public class HomePageTest extends BaseTest {
    @Test
    public void shouldBeAbleToSearchForItems(){

        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        boolean lap = driver.findElement(By.linkText("14.1-inch Laptop")).isDisplayed();
       Assert.assertEquals(lap , true);
    }

    @Test
    public void changeTheCategoriyToBooks ()  {

        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.changeToBooks();
        Assert.assertEquals(homePage.checkBook(), true);
    }

    @Test
    public void changeFromGridtoListView () throws InterruptedException {

        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.changeToBooks();
        Assert.assertEquals(homePage.checkBook(), true);
        homePage.changeView();
        Thread.sleep(5000);
    }






}


