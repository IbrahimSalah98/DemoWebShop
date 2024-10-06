package com.tricentis.demowebshop.pages;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.devtools.v127.css.model.InheritedPseudoElementMatches;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class LoginPage {

       public LoginPage (WebDriver driver) {

           PageFactory.initElements(driver , this);

       }




        @FindBy(css = "[id=\"Email\"]")
        WebElement emailInput ;

        @FindBy (css = "[id=\"Password\"]")
         WebElement passwordInput ;

        @FindBy (css = "[value=\"Log in\"]")
        WebElement loginBtn ;
        @FindBy (css = "[href=\"/logout\"]")
        WebElement logoutBtn ;

        @FindBy (css = "[class=\"message-error\"]")
        WebElement errorMassage ;




   public void emailInput (String email) {


        emailInput.sendKeys(email);
    }

    public void passwordInput (String pass){

        passwordInput.sendKeys(pass);
    }

    public void loginBtn (){

        loginBtn.click();
    }

    public void logoutBtn(){
       logoutBtn.click();
    }

    public void loginFunction ()  {
        emailInput("ibrahim@salah.com");
        passwordInput("Hima2015");
        loginBtn();

    }

    public void loginFunctionWithValidEmailandInvalidPassword ()  {
        emailInput("ibrahim@salah.com");
        passwordInput("Hima201");
        loginBtn();
        boolean checker =   errorMassage.isDisplayed();
        Assert.assertEquals(checker,true);

    }

    public void loginFunctionWithInValidEmailandvalidPassword ()  {
        emailInput("ibrahi@salah.com");
        passwordInput("Hima2015");
        loginBtn();
        boolean checker =   errorMassage.isDisplayed();
        Assert.assertEquals(checker,true);

    }

    public void checkErrorMessage () {
       loginBtn.click();
     boolean checker =   errorMassage.isDisplayed();
      Assert.assertEquals(checker,true);


    }


}
