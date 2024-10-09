package com.tricentis.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(css = "[id=\"termsofservice\"]")
    WebElement termOfService ;
    @FindBy(css = "[id=\"checkout\"]")
    WebElement checkOut ;
    @FindBy(css = "[id=\"ui-id-2\"]")
    WebElement clickonCheckout;
    @FindBy (css = "[id=\"terms-of-service-warning-box\"]")
    WebElement ErrorMes;
    @FindBy(css = "[class=\"remove-from-cart\"]")
    WebElement RemoveProductfromcart;
    @FindBy(css = "[class=\"button-2 update-cart-button\"]")
    WebElement Updatecart;
    @FindBy(css = "[class=\"order-summary-content\"]")
    WebElement CardPage;
    @FindBy(css = "[class=\"qty-input\"]")
    WebElement changeQuantityCart;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void termOfService (){
        termOfService.click();
    }
    public void checkOut(){checkOut.click();}


    public String ShowErrorMessage(){
        checkOut();
        return clickonCheckout.getText();
    }
    public String getErrorM(){
      return ErrorMes.getText();
    }

    public boolean DisplayErrorMes(){
       return ErrorMes.isDisplayed();

    }
    public void ClickOnCheckBox(){
        RemoveProductfromcart.click();
    }
    public String ClickOnCheckBox1(){
       return RemoveProductfromcart.getText();
    }
    public void CheckUpdateCart(){
        Updatecart.click();
    }
    public String NivagetToCartPage(){
       return CardPage.getText();
    }
    public boolean NivagetToCartPage1(){
        return CardPage.isDisplayed();
    }
    public void ChangeQuantityCart(String quantity){
        changeQuantityCart.clear();
        changeQuantityCart.sendKeys(quantity);
    }
    public boolean changeQuantityCart(){
        return changeQuantityCart.isDisplayed();
    }
}
