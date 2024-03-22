package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestChrome {

    public static void main(String[] args) {
        // Configurar las opciones de Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=0.0.0.0");
        options.addArguments("--no-sandbox");

        // Configurar la ubicación del ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Crear una instancia de ChromeDriver con las opciones configuradas
        WebDriver driver = new ChromeDriver(options);

        // Ejemplo de uso del WebDriver
        driver.get("https://www.google.com");

        // Cerrar el navegador al finalizar
        driver.quit();
    }
}
