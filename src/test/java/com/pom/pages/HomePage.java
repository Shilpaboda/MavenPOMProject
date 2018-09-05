package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public WebDriver driver;

    //Create constructor for webdriver
    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    @FindBy(xpath="(//*[@href='https://secure.harrods.com/account/en-gb/signin'])[2]")WebElement signInlink;
    public void clickSigninLink(){
        signInlink.click();
    }

     @FindBy(xpath ="(//*[@id='EmailAddress'])" )WebElement username;
      public void typeusername(String uname){
          username.sendKeys(uname);
      }

      @FindBy(xpath = "(//*[@id='Password'])")WebElement password;
       public void typepasswordmethod(String pass){
           password.sendKeys(pass);
       }
       @FindBy(xpath = "(//*[@value='Sign In'])")WebElement signinButton;
       public void clicksigninButton(){
           signinButton.click();

    }
}
