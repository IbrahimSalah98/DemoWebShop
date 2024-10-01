package com.tricentis.demowebshop.testcases;

import com.tricentis.demowebshop.base.BaseTest;
import com.tricentis.demowebshop.pages.RegisterPage;
import org.testng.annotations.Test;

public class SignUpAsUserTest extends BaseTest {
   @Test
   public void shouldBeAbleToRegister() throws InterruptedException {

       RegisterPage registerPage= new RegisterPage(driver);
       registerPage.RegisterFN();
       registerPage.register_continueBU();
       Thread.sleep(1000);
   }
}
