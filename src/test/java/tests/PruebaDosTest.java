package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PruebaDosTest {
    //@Test
    public void imprimirTitulo() {
        // Setear en el sistema la ruta y el driver que vamos a utilizar
        
        //Windows
        //System.setProperty("webdriver.gecko.driver", "webdrivers\\geckodriver.exe");
        
        //Mac
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        
        // Creamos un driver de tipo Firefox
        WebDriver driverFirefox = new FirefoxDriver();
        
        // Comando para abrir una URL en el browser
        driverFirefox.get("http://facebook.com");
        
        // Comando para imprimir en consola
        System.out.println("El titulo de la pagina es: " + driverFirefox.getTitle());
        
        // Comando para finalizar y cerrar la instancia del driver
        driverFirefox.quit();
    }
}
