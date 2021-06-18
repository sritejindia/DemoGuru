package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormAuthPage {

    private final WebDriver driver;

    public FormAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public FormAuthPage enterUsername(String val) {

        WebElement foo = new WebDriverWait(this.driver, 10)
                .until(driver -> driver.findElement(By.id("username")));
        foo.sendKeys(val);
        return this;
    }

    public FormAuthPage enterPassword(String val) {
        this.driver.findElement((By.id("password"))).sendKeys(val);
        return this;
    }

    public void clickOnLoginButton() {
        this.driver.findElement((By.tagName("button"))).click();
    }

}
