package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class exercise3Links {
    public static void main(String[] args) throws InterruptedException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        // Get google home page
        myDriver.get("https://www.nasa.gov/");
        //WebElement textMission = myDriver.findElement(By.linkText("Missions"));
        //System.out.println(textMission.getAttribute("href"));
        System.out.println(myDriver.findElement(By.linkText("Missions")).getAttribute("href"));
        System.out.println(myDriver.findElement(By.linkText("NASA TV")).getAttribute("href"));
        System.out.println(myDriver.findElement(By.partialLinkText("Mars")).getAttribute("href"));
        List<WebElement> tagList = myDriver.findElements(By.tagName("input"));

        for(int i =0; i < tagList.size(); i++){
            System.out.println(tagList.get(i).getAttribute("Name"));
        }

        myDriver.quit();
    }
}
