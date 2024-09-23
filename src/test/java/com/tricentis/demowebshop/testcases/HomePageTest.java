package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.factory.DriverFactory;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    @Test
    public void shouldBeAbleToSearchForItems(){
        WebDriver driver = new DriverFactory().initializeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        boolean lap = driver.findElement(By.linkText("14.1-inch Laptop")).isDisplayed();
       Assert.assertEquals(lap , true);
        driver.quit();
        
    }
}
