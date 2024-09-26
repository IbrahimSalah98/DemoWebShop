package com.tricentis.demowebshop.pages;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage   {

       public LoginPage (WebDriver driver) {

           PageFactory.initElements(driver , this);

       }




        @FindBy(css = "[id=\"Email\"]")
        WebElement emailInput ;

        @FindBy (css = "[id=\"Password\"]")
         WebElement passwordInput ;

        @FindBy (css = "[value=\"Log in\"]")
        WebElement loginBtn ;




   public void emailInput (String email) {


        emailInput.sendKeys(email);
    }

    public void passwordInput (String pass){
        passwordInput.sendKeys(pass);
    }

    public void loginBtn (){
        loginBtn.click();
    }

    public void loginFunction (){
        emailInput("ibrahim@salah.com");
        passwordInput("Hima2015");
        loginBtn();
    }

}
