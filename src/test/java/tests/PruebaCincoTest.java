package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaCincoTest {

    //@Test
    public void webElementsSelenium() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");

        // Creamos un driver de tipo Chrome
        WebDriver driverChrome = new ChromeDriver();

        driverChrome.get("http://the-internet.herokuapp.com/dropdown");

        Select loc_ddList = new Select(driverChrome.findElement(By.id("dropdown")));
        
        loc_ddList.selectByValue("1");
        Thread.sleep(3000);
        
        loc_ddList.selectByIndex(2);
        Thread.sleep(3000);
        
        loc_ddList.selectByVisibleText("Option 1");
        Thread.sleep(3000);

        driverChrome.quit();
    }
}
