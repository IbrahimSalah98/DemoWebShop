package com.tricentis.demowebshop.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DriverFactory {




     public WebDriver initializeDriver (){
         WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.manage().window().maximize();
         driver.get();
         return driver;
     }



}


