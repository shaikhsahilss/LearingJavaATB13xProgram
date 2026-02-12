package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://exmaple.com");

    }
    @Test
    public void testfailureScreenshot(){
        System.out.println("Running failing test...");
        Assert.fail("forcing to check screenshot");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
