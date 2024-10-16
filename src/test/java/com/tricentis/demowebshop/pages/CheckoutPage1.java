package com.tricentis.demowebshop.pages;
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
    @FindBy(css = "[id=\"checkout-step-payment-method\"]")
    WebElement Paymentmethod;
    @FindBy(css = "[class=\"button-1 payment-method-next-step-button\"]")
    WebElement continuePayment;
    @FindBy(css = "[id=\"paymentmethod_1\"]")
    WebElement CheckMoneyOrderPay;
    @FindBy(css = "[id=\"paymentmethod_2\"]")
    WebElement  CreditCardPay;
    @FindBy(css = "[id=\"paymentmethod_3\"]")
    WebElement PurchaseOrderPay;
    @FindBy(css = "[class=\"info\"]")
    WebElement PaymentInfoMes;
    @FindBy(css = "[onclick=\"PaymentInfo.save()\"]")
    WebElement continuePaymentInfo;
    @FindBy(css = "[onclick=\"ConfirmOrder.save()\"]")
    WebElement confirmOrder;
    @FindBy(css = "[onclick=\"setLocation('/')\"]")
    WebElement lastContinue;
    @FindBy(css = "[id=\"shippingoption_0\"]")
    WebElement ShippingmethodGround;
    @FindBy(css = "[id=\"shippingoption_1\"]")
    WebElement ShippingmethodNextDayAir;
    @FindBy(css = "[id=\"shippingoption_2\"]")
    WebElement Shippingmethod2ndDayAir;
    @FindBy(css = "[onclick=\"ShippingMethod.save()\"]")
    WebElement continueShippingmethod;

// CreditCardType
    @FindBy(css = "[id=\"CardholderName\"]")
    WebElement CardholderNameField;
    @FindBy(css = "[id=\"CardNumber\"]")
    WebElement CardNumberField;
    @FindBy(css = "[id=\"CardCode\"]")
    WebElement CardCodeField;

    @FindBy(css = "[id=\"PurchaseOrderNumber\"]")
    WebElement PurchaseOrderNumberField;

    @FindBy(xpath = "//*[@id=\"ExpireYear\"]")
    WebElement expireYear;


    @FindBy(xpath = "//*[@id=\"ExpireMonth\"]")
    WebElement expireMonth;



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
        continueButton();
        continuePayment();
        continuePaymentInfo();
        confirmOrder();
        Thread.sleep(500);
        lastContinue();
    }
    public void getShippingmethodGround(){
        ShippingmethodGround.click();
    }
    public void continueShippingmethod(){
        continueShippingmethod.click();
    }
    public String getPaymentmethod(){
        return Paymentmethod.getText();
    }
    public void getShippingmethodNextDayAir(){
        ShippingmethodNextDayAir.click();
    }
    public void getShippingmethod2ndDayAir(){
        Shippingmethod2ndDayAir.click();
    }
    public void getCheckMoneyOrderPay(){
        CheckMoneyOrderPay.click();
    }
    public void getCreditCardPay(){
        CreditCardPay.click();
    }
    public void getPurchaseOrderPay(){
        PurchaseOrderPay.click();
    }
    public String getPaymentInfoMes(){
        return PaymentInfoMes.getText();
    }
    public void CardholderNameField(String CardholderName) {
        CardholderNameField.sendKeys(CardholderName);
    }
    public void CardNumberField(String CardNumber) {
        CardNumberField.sendKeys(CardNumber);
    }
    public void CardCodeField(String CardCode) {
        CardCodeField.sendKeys(CardCode);
    }
    public void CardholderButtons(){
        CardholderNameField("ibrahim salah");
        CardNumberField("12344");
        CardCodeField("1234");
    }
    public void CardCodeField(){
      CardCodeField("1234");
   }
public void PurchaseOrderNumberField(String PurchaseOrderNumber) {
    PurchaseOrderNumberField.sendKeys(PurchaseOrderNumber);
}
public void changeMonth(){
    Select month = new Select(expireMonth);
    month.selectByIndex(5);
}
    public void changeYear(){
        Select year = new Select(expireYear);
        year.selectByIndex(5);
    }
}

