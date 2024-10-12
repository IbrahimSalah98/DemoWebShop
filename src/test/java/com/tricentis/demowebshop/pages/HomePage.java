package com.tricentis.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

   @FindBy (css = "[id=\"small-searchterms\"]")
   private WebElement searchInput ;
   @FindBy (css = "[value=\"Search\"]")
   private WebElement searchBtn ;
    @FindBy(css = "[class=\"cart-label\"]")
    WebElement clickonShoppingcart;
    @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
    WebElement changetobook;
    @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
    WebElement checkBook ;
    @FindBy (xpath = "//*[@id=\"products-viewmode\"]")
    WebElement dropdownElement ;

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

    public void changeToBooks (){
        changetobook.click();
    }

    public boolean checkBook (){
        boolean checker = checkBook.isDisplayed();
        return checker;
    }

    public void changeView(){
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(1);
    }





}
