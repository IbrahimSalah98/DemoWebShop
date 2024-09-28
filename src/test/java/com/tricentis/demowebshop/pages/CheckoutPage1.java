package com.tricentis.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage1 {


    @FindBy(css = "[id=\"BillingNewAddress_CountryId\"]")
    WebElement selectCountry;
    @FindBy(css = "[id=\"BillingNewAddress_City\"]")
    WebElement cityInput;
    @FindBy(css = "[id=\"BillingNewAddress_Address1\"]")
    WebElement address1Input;
    @FindBy(css = "[id=\"BillingNewAddress_ZipPostalCode\"]")
    WebElement zipCodeInput;
    @FindBy(css = "[id=\"BillingNewAddress_PhoneNumber\"]")
    WebElement phoneNumberInput;
    @FindBy(css = "[class=\"button-1 new-address-next-step-button\"]")
    WebElement clickContinue;
    @FindBy(css = "[id=\"PickUpInStore\"]")
    WebElement pickUp ;
   /* @FindBy(css = "[class=\"button-1 new-address-next-step-button\"]")
    WebElement continueButton; */




    public CheckoutPage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectCountryByIndex(int index) {
        Select selectCountryDropDown = new Select(selectCountry);
        selectCountryDropDown.selectByIndex(index);
    }

    public void enterCity(String city) {
        cityInput.sendKeys(city);
    }

    public void enterAddress1(String address) {
        address1Input.sendKeys(address);
    }

    public void enterZipCode(String zipCode) {
        zipCodeInput.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
    }

    public void clickContinue() {
        clickContinue.click();
    }
    public void pickUp (){
        pickUp.click();
    }

   /* public void continueButton() {
        continueButton.click();
    }*/

    public void fillAddressDetails() {
        selectCountryByIndex(63);
        enterCity("Qena");
        enterAddress1("Qena Street");
        enterZipCode("12345");
        enterPhoneNumber("0123456789");
        clickContinue();
        pickUp();
       // continueButton();
    }



}
