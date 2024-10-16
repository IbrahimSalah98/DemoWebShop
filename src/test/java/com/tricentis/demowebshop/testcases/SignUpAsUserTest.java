package com.tricentis.demowebshop.testcases;

import com.github.javafaker.Faker;
import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Register Feature")
public class SignUpAsUserTest extends BaseTest {
   @Test(description = "Verify Main Functionality")
   public void shouldBeAbleToRegister()  {

       RegisterPage registerPage= new RegisterPage(driver);
       registerPage.RegisterFN();
       registerPage.register_continueBU();
   }

   @Test(description = "Verify_that_usr_canNot_SignUp_WithEmptyFirstName")
    public void Verify_that_usr_canNot_SignUp_WithEmptyFirstName(){
       RegisterPage registerPage=new RegisterPage(driver);
       registerPage.gendermale();
       String lastname=new Faker().name().lastName();
       String Email=new Faker().internet().emailAddress();
       String Password=new Faker().internet().password();
       registerPage.RegisterPage("",lastname,Email,Password);
       registerPage.register();
       Assert.assertEquals(registerPage.getFirstNameErrorMessage(),"First name:");
   }
    @Test(description = "Verify_that_usr_canNot_SignUp_WithEmptylastName")
    public void Verify_that_usr_canNot_SignUp_WithEmptylastName() {
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().firstName();
        String Email=new Faker().internet().emailAddress();
        String Password=new Faker().internet().password();
        registerPage.RegisterPage(firstname,"",Email,Password);
        registerPage.register();
        Assert.assertEquals(registerPage.getlastNameErrorMessage(),"Last name:");
    }
    @Test(description = "Verify_that_usr_canNot_SignUp_WithEmptyEmail")
    public void Verify_that_usr_canNot_SignUp_WithEmptyEmail()  {
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().lastName();
        String lastname=new Faker().name().lastName();
        String Password=new Faker().internet().password();
        registerPage.RegisterPage(firstname,lastname,"",Password);
        registerPage.register();
        Assert.assertEquals(registerPage.getEmailErrorMessage(),"Email:");
    }
    @Test(description = "Verify_that_usr_canNot_SignUp_WithpasswordLessthan_sixchar")
    public void Verify_that_usr_canNot_SignUp_WithpasswordLessthan_sixchar(){
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().firstName();
        String lastname=new Faker().name().lastName();
        String Email=new Faker().internet().emailAddress();
        registerPage.RegisterPage(firstname,lastname,Email,"12345");
        registerPage.register();
        Assert.assertEquals(registerPage.getPasswordErrorMessage(),"Password:");
    }
    @Test(description = "Verify_that_usr_canNot_SignUp_WithThepassword_and_confirmationpassword_donot_match")
    public void Verify_that_usr_canNot_SignUp_WithThepassword_and_confirmationpassword_donot_match() {
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.gendermale();
        String firstname=new Faker().name().firstName();
        String lastname=new Faker().name().lastName();
        String Email=new Faker().internet().emailAddress();
        String Password=new Faker().internet().password();
        String ConfirmPassword=new Faker().internet().password();
        registerPage.RegisterPage1(firstname,lastname,Email,Password,ConfirmPassword);
        registerPage.register();
        Assert.assertEquals(registerPage.getPasswordErrorMessage(),"Password:");
    }
    @Test(description = "Verify_that_usr_canNot_SignUp_EmptyData")
    public void Verify_that_usr_canNot_SignUp_EmptyData() {
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.register();
        Assert.assertEquals(registerPage.register1(),"");
    }
}
