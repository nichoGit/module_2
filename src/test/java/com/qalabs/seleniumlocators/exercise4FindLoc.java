package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class exercise4FindLoc {
    public static void main(String[] args) throws InterruptedException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        // Get google home page
        myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        System.out.println(myDriver.findElement(By.linkText("Portada")).getAttribute("href"));
        //System.out.print(myDriver.findElement(By.partialLinkText("Página")).getAttribute("href"));
        List<WebElement> paginaList = myDriver.findElements(By.partialLinkText("Página"));

        for(int i =0; i < paginaList.size(); i++){
            System.out.println(paginaList.get(i).getAttribute("href") + "Pagina " + i);
        }
        //List<WebElement> buttonList = myDriver.findElements(By.tagName("button"));

        for(WebElement element: myDriver.findElements(By.tagName("button"))){
            System.out.println(element.getText() + "\n");
        }
        myDriver.quit();
    }
}
