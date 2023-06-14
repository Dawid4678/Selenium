package org.example.testcase;

import org.example.pages.DashboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


public class Main {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\daw-s\\Desktop\\repozytoria\\Selenium\\ChromeDriver\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        homePage.loginClick();
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        loginPage.enterUserName("gunjankaushik");
        loginPage.enterPassword("Password@123");
        loginPage.clickLogin();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dashboardPage.isCurrentUserCorrect("gunjankaushik");

        }
    }
