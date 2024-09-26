package com.tricentis.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductA {



@FindBy (css = "[id=\"add-to-cart-button-31\"]")
    WebElement addToCart ;

@FindBy (css = "[id=\"addtocart_31_EnteredQuantity\"]")
WebElement changeQuantity ;

    @FindBy(linkText = "shopping cart")
    WebElement shoppingCart;

    public ProductA(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void addToCart (){
    addToCart.click();
}

public void changeQuantity(String quantity){
    changeQuantity.sendKeys(quantity);
}

    public void shoppingCart (){
        shoppingCart.click();
    }



}
