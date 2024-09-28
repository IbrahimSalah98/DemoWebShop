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
    @FindBy(css = "[onclick=\"Shipping.save()\"]")
    WebElement continueButton;
    @FindBy(css = "[class=\"button-1 payment-method-next-step-button\"]")
    WebElement continuePayment;
    @FindBy(css = "[onclick=\"PaymentInfo.save()\"]")
    WebElement continuePaymentInfo;
    @FindBy(css = "[onclick=\"ConfirmOrder.save()\"]")
    WebElement confirmOrder;
    @FindBy(css = "[onclick=\"setLocation('/')\"]")
    WebElement lastContinue;




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

   public void continueButton() {
        continueButton.click();
    }
    public void continuePayment() {
        continuePayment.click();
    }
    public void continuePaymentInfo() {
        continuePaymentInfo.click();
    }
    public void confirmOrder() {
        confirmOrder.click();
    }
    public void lastContinue() {
        lastContinue.click();
    }

    public void fillAddressDetails() throws InterruptedException {
        selectCountryByIndex(63);
        enterCity("Qena");
        enterAddress1("Qena Street");
        enterZipCode("12345");
        enterPhoneNumber("0123456789");
        clickContinue();
        pickUp();
       // Thread.sleep(1000);
        continueButton();
       // Thread.sleep(1000);
        continuePayment();
        continuePaymentInfo();
        confirmOrder();
        Thread.sleep(500);
        lastContinue();
    }



}
