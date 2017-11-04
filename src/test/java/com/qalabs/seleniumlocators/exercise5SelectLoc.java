package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class exercise5SelectLoc {


    public static void main(String[] args) throws InterruptedException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        // Get google home page
        myDriver.get("http://www.amazon.com.mx/");
        WebElement navElement = myDriver.findElement(By.id("searchDropdownBox"));
        Select selectElement = new Select(navElement);
        System.out.println(selectElement.getOptions() + " ");
        for (WebElement element: selectElement.getOptions()){
            System.out.println(element.getText());
        }
        System.out.println(selectElement.isMultiple() + " mutiple");

        System.out.println(selectElement.getFirstSelectedOption().getText() + " First selected ");

        selectElement.selectByIndex(0);
        System.out.println(selectElement.getFirstSelectedOption().getText());
        selectElement.selectByVisibleText("Auto");
        System.out.println(selectElement.getFirstSelectedOption().getText());
        myDriver.quit();





    }
}
