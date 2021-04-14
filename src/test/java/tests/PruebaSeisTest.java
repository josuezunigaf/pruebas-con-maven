package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaSeisTest {
    @Test
    public void webElementsSelenium() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");

        // Creamos un driver de tipo Chrome
        WebDriver driverChrome = new ChromeDriver();

        driverChrome.get("http://the-internet.herokuapp.com/login");

        WebElement loc_txtUsername = driverChrome.findElement(By.id("username"));
        WebElement loc_txtPassword = driverChrome.findElement(By.id("password"));
        WebElement loc_btnLogin = driverChrome.findElement(By.cssSelector("#login > button"));
        
        loc_txtUsername.clear();
        loc_txtUsername.sendKeys("tomsmith");
        loc_txtPassword.clear();
        loc_txtPassword.sendKeys("SuperSecretPassword!");
        
        loc_btnLogin.click();
        
        WebElement loc_lblAuth = driverChrome.findElement(By.id("flash"));
        
        String cleanMsg = loc_lblAuth.getText();
        
        Assert.assertTrue(loc_lblAuth.isDisplayed());
        //Assert.assertEquals("You logged into a secure area!", loc_lblAuth.getText());
        Assert.assertTrue(cleanMsg.contains("You logged into a secure area!"));
        
        Thread.sleep(3000);
    }
}
