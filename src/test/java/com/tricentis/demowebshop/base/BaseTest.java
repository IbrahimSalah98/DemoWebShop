package com.tricentis.demowebshop.base;

import com.tricentis.demowebshop.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
     protected   WebDriver driver;

     @BeforeMethod
    public void setDriver() {
         driver = new DriverFactory().initializeDriver();
         driver.get("https://demowebshop.tricentis.com/register");

    }



    @AfterMethod

    public void quit (){

         driver.quit();
    }



}
