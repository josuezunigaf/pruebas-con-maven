package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaTresTest {
    //@Test
    public void webElementsSelenium() {

        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        
        // Creamos un driver de tipo Chrome
        WebDriver driverChrome = new ChromeDriver();
        
        driverChrome.get("https://demoqa.com/buttons");
        
        WebElement loc_btnRightC = driverChrome.findElement(By.id("rightClickBtn"));
        //WebElement loc_name = driverChrome.findElement(By.name("name"));
        //WebElement loc_className = driverChrome.findElement(By.className("nombre_clase"));
        //WebElement loc_tagName = driverChrome.findElement(By.tagName("tag_elemento"));
        //WebElement loc_linkText = driverChrome.findElement(By.linkText("link_del_texto"));
        //WebElement loc_partialLinkText = driverChrome.findElement(By.partialLinkText("partial_link_texto"));
        //WebElement loc_cssSelector = driverChrome.findElement(By.cssSelector("#rightClickBtn"));
        WebElement loc_xpath = driverChrome.findElement(By.xpath("//*[@id='rightClickBtn']"));
        
        System.out.println("El texto del boton By.id es: " + loc_btnRightC.getText());
        System.out.println("\nEl texto del boton By.xpath es: " + loc_xpath.getText());
        System.out.println("El atributo class del boton es: " + loc_btnRightC.getAttribute("class"));
        
        driverChrome.quit();
    }
}
