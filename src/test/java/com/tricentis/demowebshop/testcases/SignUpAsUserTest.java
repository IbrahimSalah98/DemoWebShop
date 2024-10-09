package com.tricentis.demowebshop.testcases;

import com.github.javafaker.Faker;
import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Register Feature")
public class SignUpAsUserTest extends BaseTest {
   @Test(description = "Verify Main Functionality",priority = 1)
   public void shouldBeAbleToRegister() throws InterruptedException {

       RegisterPage registerPage= new RegisterPage(driver);
       registerPage.RegisterFN();
       registerPage.register_continueBU();
       Thread.sleep(1000);
   }

   @Test(description = "Verify_that_usr_canNot_SignUp_WithEmptyFirstName",priority = 2)
    public void Verify_that_usr_canNot_SignUp_WithEmptyFirstName() throws InterruptedException {
       RegisterPage registerPage=new RegisterPage(driver);
       registerPage.gendermale();
       String lastname=new Faker().name().lastName();
       String Email=new Faker().internet().emailAddress();
       String Password=new Faker().internet().password();
       registerPage.RegisterPage("",lastname,Email,Password);
       registerPage.register();
       Thread.sleep(1000);
       Assert.assertEquals(registerPage.getFirstNameErrorMessage(),"First name:");
   }

    @Test(description = "Verify_that_usr_canNot_SignUp_WithEmptylastName",priority = 3)
    public void Verify_that_usr_canNot_SignUp_WithEmptylastName() throws InterruptedException {
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().firstName();
        String Email=new Faker().internet().emailAddress();
        String Password=new Faker().internet().password();
        registerPage.RegisterPage(firstname,"",Email,Password);
        registerPage.register();
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getlastNameErrorMessage(),"Last name:");
    }

    @Test(description = "Verify_that_usr_canNot_SignUp_WithEmptyEmail",priority = 4)
    public void Verify_that_usr_canNot_SignUp_WithEmptyEmail() throws InterruptedException {
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().lastName();
        String lastname=new Faker().name().lastName();
        String Password=new Faker().internet().password();
        registerPage.RegisterPage(firstname,lastname,"",Password);
        registerPage.register();
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getEmailErrorMessage(),"Email:");
    }

    @Test(description = "Verify_that_usr_canNot_SignUp_WithpasswordLessthan_sixchar",priority = 5)
    public void Verify_that_usr_canNot_SignUp_WithpasswordLessthan_sixchar() throws InterruptedException{
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().firstName();
        String lastname=new Faker().name().lastName();
        String Email=new Faker().internet().emailAddress();
        registerPage.RegisterPage(firstname,lastname,Email,"12345");
        registerPage.register();
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getPasswordErrorMessage(),"Password:");

    }

    @Test(description = "Verify_that_usr_canNot_SignUp_WithThepassword_and_confirmationpassword_donot_match",priority = 6)
    public void Verify_that_usr_canNot_SignUp_WithThepassword_and_confirmationpassword_donot_match() throws InterruptedException{

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().firstName();
        String lastname=new Faker().name().lastName();
        String Email=new Faker().internet().emailAddress();
        String Password=new Faker().internet().password();
        String ConfirmPassword=new Faker().internet().password();
        registerPage.RegisterPage1(firstname,lastname,Email,Password,ConfirmPassword);
        registerPage.register();
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.getPasswordErrorMessage(),"Password:");

    }

    @Test(description = "Verify_that_usr_canNot_SignUp_EmptyData",priority = 7)
    public void Verify_that_usr_canNot_SignUp_EmptyData() throws InterruptedException{
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.register();
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.register1(),"");

    }


}
