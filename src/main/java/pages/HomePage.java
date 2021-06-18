package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://the-internet.herokuapp.com/");
    }

    public FormAuthPage clickOn(String val) {
        this.driver.findElement(By.linkText(val)).click();
        return new FormAuthPage(this.driver);
    }
}
