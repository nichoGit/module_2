package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class exercise1Locators {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get("https://www.mercadolibre.com.mx/");
        WebElement searchElement = myDriver.findElement(By.className("nav-search-input"));
        Thread.sleep(10000);
        searchElement.sendKeys("Selenium");
        WebElement buttonElement = myDriver.findElement(By.className("nav-search-btn"));
        buttonElement.submit();
        WebElement productElement = myDriver.findElement(By.className("main-title"));
        productElement.click();
        //searchElement.submit();
        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
