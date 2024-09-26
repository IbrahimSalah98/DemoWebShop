package com.tricentis.demowebshop.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="[id=\"gender-male\"]")
    private WebElement gendermale;
    @FindBy(css="[id=\"gender-female\"]")
    private WebElement genderfemale;
    @FindBy(css = "[id=\"FirstName\"]")
    private WebElement firstName;
    @FindBy(css="[id=\"LastName\"]")
    private WebElement lastName;
    @FindBy(css="[id=\"Email\"]")
    private WebElement email;
    @FindBy(css="[id=\"Password\"]")
    private WebElement password;
   @FindBy(css="[id=\"ConfirmPassword\"]")
   private WebElement confirmPassword;
   @FindBy(css="[id=\"register-button\"]")
   private WebElement register;
   @FindBy(css="[class=\"button-1 register-continue-button\"]")
   private WebElement register_continueBU;


   public void gendermale(){
       gendermale.click();
   }

    public void genderfemale(){
        genderfemale.click();
    }
    public void firstName(String FirstName){
        firstName.sendKeys(FirstName);
    }
    public void lastName(String LastName){
        lastName.sendKeys(LastName);
    }
    public void email(String Email){
        email.sendKeys(Email);
    }
    public void password(String Password){
        password.sendKeys(Password);
    }

    public void confirmPassword(String ConfirmPassword){
        confirmPassword.sendKeys(ConfirmPassword);
    }
    public void register(){
        register.click();
    }
    public void register_continueBU(){
        register_continueBU.click();
    }

    //    String firstname=new Faker().name().firstName();
//    String lastname=new Faker().name().lastName();
    String Email=new Faker().internet().emailAddress();
    String Password=new Faker().internet().password();
    public void RegisterFN(){
        gendermale();
        firstName("ibrahim");
        lastName("salah");
        email(Email);
        password(Password);
        confirmPassword(Password);
        register();

    }
//    public String Email(){
//        return Email;
//    }
//    public String password(){
//        return Email;
//    }




}
