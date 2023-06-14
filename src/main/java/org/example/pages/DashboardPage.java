package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//label[@id=\"userName-value\"]")
    WebElement currentUser;

    public void isCurrentUserCorrect(String user) {
        if (currentUser.getText().equalsIgnoreCase(user)) {
            System.out.println("Użytkownik poprawnie zalogowany! = " + currentUser.getText());
        } else {
            System.out.println("Błędny użytkownik");
        }

    }
}