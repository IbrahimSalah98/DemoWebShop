package com.tricentis.demowebshop.testcases;
import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.ProductA;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Add To Cart Feature")
public class AddProductToCartTest extends BaseTest{
    @Test (description = "Should be able to add product to cart ")
    public void souldBeAbleToaddToCart ()  {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("6");
        productA.addToCart();
        productA.shoppingCart();
    }
    @Test(description = "Verify_ThatErrorMessage_forProduct_isdisplay")
    public void Verify_ThatErrorMessage_forProduct_isdisplay()  {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.changeQuantity("0");
        productA.addToCart();
        Assert.assertEquals(productA.ShowProductErrorMessage(),"");
        System.out.println(productA.displayProductErrorMessage());
        System.out.println(productA.ShowProductErrorMessage());
    }
    @Test(description = "Verify_Addtocomparelist_Button")
    public void Verify_Addtocomparelist_Button(){
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.ClickOnAddtocomparelist();
        Assert.assertNotEquals(productA.Showcomparelist(),null);
        System.out.println(productA.displaycomparelist());
        System.out.println(productA.Showcomparelist());
    }
    @Test(description = "Verify_Remove_compareProducts")
    public void Verify_Remove_compareProducts()  {
        RegisterPage registerPage= new RegisterPage(driver);
        registerPage.RegisterFN();
        registerPage.register_continueBU();
        HomePage homePage = new HomePage(driver);
        homePage.searchInput();
        homePage.searchBtn();
        driver.findElement(By.partialLinkText("Lap")).click();
        ProductA productA = new ProductA(driver);
        productA.ClickOnAddtocomparelist();
        productA.ClickRemoveBU();
        Assert.assertEquals(productA.ShowMessagecompare(),"You have no items to compare.");
        System.out.println(productA.ShowMessagecompare());
        System.out.println(productA.displayMessagecompare());
    }
}
