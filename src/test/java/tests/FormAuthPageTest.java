package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import pages.HomePage;

public class FormAuthPageTest {

    public WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testLogin() {
        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickOn("Form Authentication")
                    .enterUsername("tomsmith")
                    .enterPassword("SuperSecretPassword!")
                    .clickOnLoginButton();
        } finally {
            driver.close();
            driver.quit();
        }
    }

    @After
    public void after() {

    }
}