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
    @FindBy(css = "[id=\"bar-notification\"]")
    WebElement ProductErrorMessage;
    @FindBy(css = "[onclick=\"setLocation('/compareproducts/add/31')\"]")
    WebElement Addtocomparelist;
    @FindBy(css = "[class=\"page compare-products-page\"]")
    WebElement compareproducts;
    @FindBy(css = "[onclick=\"setLocation('/compareproducts/remove/31')\"]")
    WebElement Removecompareproducts;
    @FindBy(css = "[class=\"page-body\"]")
    WebElement display_Amessage;


    public ProductA(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void addToCart (){
    addToCart.click();
}

public void changeQuantity(String quantity){
    changeQuantity.clear();
            changeQuantity.sendKeys(quantity);
}

    public void shoppingCart (){
        shoppingCart.click();
    }

    public String ShowProductErrorMessage(){
        return ProductErrorMessage.getText();
    }
    public boolean displayProductErrorMessage(){
        return ProductErrorMessage.isDisplayed();
    }
    public void ClickOnAddtocomparelist(){
        Addtocomparelist.click();
    }

    public String Showcomparelist(){
        return compareproducts.getText();
    }
    public boolean displaycomparelist(){
        return compareproducts.isDisplayed();
    }
    public void ClickRemoveBU(){
        Removecompareproducts.click();
    }
    public String ShowMessagecompare(){
        return display_Amessage.getText();
    }
    public boolean displayMessagecompare(){
        return display_Amessage.isDisplayed();
    }





}
