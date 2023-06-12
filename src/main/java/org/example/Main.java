package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\daw-s\\Desktop\\repozytoria\\Selenium\\ChromeDriver\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://www.w3schools.com/xml/xpath_syntax.asp");
        //*[@id="accept-choices"]
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
    }
}