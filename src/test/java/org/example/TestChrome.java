package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestChrome {

    public static void main(String[] args) {

        WebDriver driver = null;
        String browser = "chrome";


        if (browser.equalsIgnoreCase("edge")) {

            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");

            System.setProperty("webdriver.edge.driver", "C:\\automation\\webdrivers\\msedgedriver.exe");
            driver = new EdgeDriver(options);

        }
        if (browser.equalsIgnoreCase("chrome")) {

            // Configurar las opciones de Chrome
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            // Configurar la ubicación del ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\automation\\webdrivers\\chromedriver.exe");

            // Crear una instancia de ChromeDriver con las opciones configuradas
            driver = new ChromeDriver(options);

        }

        // Ejemplo de uso del WebDriver
        driver.get("https://www.google.com");

        // Cerrar el navegador al finalizar
        driver.quit();
    }
}
