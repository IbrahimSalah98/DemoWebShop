package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpAsUser extends BaseTest {
   @Test
   public void shouldBeAbleToRegister() throws InterruptedException {
       driver.get("https://demowebshop.tricentis.com/register");
       RegisterPage registerPage= new RegisterPage(driver);
       registerPage.RegisterFN();
       Thread.sleep(1000);
   }
}
