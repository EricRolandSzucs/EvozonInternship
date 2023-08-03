package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class LoginTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validLoginTest(){
        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("parola123");
        driver.findElement(By.id("send2")).click();

        String dashboard = driver.findElement(By.cssSelector("div.page-title")).getText();

        Assert.assertEquals(dashboard, "MY DASHBOARD");
    }

    @Test
    public void invalidLoginTest() {
        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("parola");
        driver.findElement(By.id("send2")).click();

        String error = driver.findElement(By.cssSelector("li.error-msg")).getText();
        Assert.assertEquals(error, "Invalid login or password.");
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }

}
