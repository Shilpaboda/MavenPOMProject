package com.pom.testcases;

import com.pom.base.TestBase;
import com.pom.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignIn extends TestBase {
    @Test
    public void signintestcase(){
        openBrowser("chrome");
        navigateUrl("https://www.harrods.com/en-gb");
        //Create object for home page or to call home page objects
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickSigninLink();
        home.typeusername("Shilpa");
        home.typepasswordmethod("testing123");
        home.clicksigninButton();
    }
}
