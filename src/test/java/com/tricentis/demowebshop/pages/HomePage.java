package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

   @FindBy (css = "[id=\"small-searchterms\"]")
   private WebElement searchInput ;
   @FindBy (css = "[value=\"Search\"]")
   private WebElement searchBtn ;

    public HomePage(WebDriver driver) {
        super(driver);
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





}
