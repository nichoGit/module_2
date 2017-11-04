package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class exercise2Waits {
    public static void main(String[] args) throws InterruptedException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Get google home page
        myDriver.get("https://www.google.com/");
        myDriver.findElement(By.id("no-id"));
        myDriver.quit();
    }
}
