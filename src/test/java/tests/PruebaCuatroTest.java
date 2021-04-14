package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaCuatroTest {
    //@Test
    public void webElementsSelenium() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        
        // Creamos un driver de tipo Chrome
        WebDriver driverChrome = new ChromeDriver();
        
        driverChrome.get("https://demoqa.com/text-box");
        
        WebElement loc_txtFullName = driverChrome.findElement(By.id("userName"));
        WebElement loc_txtUserEmail = driverChrome.findElement(By.id("userEmail"));
        WebElement loc_txtCurrentAddress = driverChrome.findElement(By.id("currentAddress"));
        WebElement loc_txtPermanentAddress = driverChrome.findElement(By.id("permanentAddress"));

        // Obtener atributo del webElement
        // System.out.println("El atributo placeholder del input es: " + loc_txtFullName.getAttribute("placeholder"));
        
        // Clear y SendKeys
        loc_txtFullName.clear();
        loc_txtFullName.sendKeys("Josue Z");
        loc_txtUserEmail.clear();
        loc_txtUserEmail.sendKeys("testing@testing.com");
        loc_txtCurrentAddress.clear();
        loc_txtCurrentAddress.sendKeys("Alajuela");
        loc_txtPermanentAddress.clear();
        loc_txtPermanentAddress.sendKeys("San Jose, Calle 2, Avenida 4");
        
        loc_txtFullName.clear();
        
        Thread.sleep(3000);
        
        driverChrome.quit();
    }
}
