package com.tricentis.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

   @FindBy (css = "[id=\"small-searchterms\"]")
   private WebElement searchInput ;
   @FindBy (css = "[value=\"Search\"]")
   private WebElement searchBtn ;
    @FindBy(css = "[class=\"cart-label\"]")
    WebElement clickonShoppingcart;

    public HomePage(WebDriver driver) {
       PageFactory.initElements(driver,this);
    }

    public void searchInput (){
        searchInput.sendKeys("laptop");
    }

    public void searchBtn (){
        searchBtn.click();
    }

    public void doSearch(){
        searchInput();
        searchBtn();
    }
    public void Shoppingcart(){
        clickonShoppingcart.click();
    }





}
