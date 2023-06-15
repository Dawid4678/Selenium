package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {
    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\daw-s\\Desktop\\repozytoria\\Selenium\\ChromeDriver\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
    }
}
