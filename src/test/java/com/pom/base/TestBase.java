package com.pom.base;

import com.pom.util.XLS_Reader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

    //Declare testdata file address:
    public static XLS_Reader xls = new XLS_Reader("/Users/shilpa/IdeaProjects/MavenPOMProject/src/test/java/com/pom/testdata/testdata.xls");
    //Declare Webdriver:
    public WebDriver driver;

    //Create Open Browser function:
    public void openBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/shilpa/IdeaProjects/MavenPOMProject/resources/chromedriver");
            driver = new ChromeDriver();
            System.out.println("Opening the browser: "+browser);
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","/Users/shilpa/IdeaProjects/MavenPOMProject/resources/geckodriver");
            driver = new FirefoxDriver();
            System.out.println("Opening the browser: "+browser);
        }else if(browser.equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
            System.out.println("Opening the browser: "+browser);
        }
    }

    //Create CloseBrowser:
    public void closeBrowser(){
        driver.quit();
        System.out.println("Test case execution completed closing the browser");
    }

    //Navigate url: https://www.harrods.com/en-gb
    public void navigateUrl(String url){

        driver.get(url);
    }





}