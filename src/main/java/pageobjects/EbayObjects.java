package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayObjects {
    WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/ibook/IdeaProjects/BDD1/Driver/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://www.ebay.com");
    }
    public String getTitle(){
        System.out.println("The Title is: "+ driver.getTitle());
        return(driver.getTitle());
    }
    public void close(){
        driver.close();
        driver.quit();
    }
}
