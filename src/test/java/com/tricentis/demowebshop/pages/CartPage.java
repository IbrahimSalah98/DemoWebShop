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
    @FindBy (css = "name=\"itemquantity4638022\"")
    WebElement removeItem;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void termOfService (){
        termOfService.click();
    }
    public void checkOut(){checkOut.click();}
    public void removeItemFromCart (){
        removeItem.clear();
        removeItem.sendKeys("\n");
    }
}

