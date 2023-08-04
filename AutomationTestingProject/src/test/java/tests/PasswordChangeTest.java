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
public class PasswordChangeTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("parola123");
        driver.findElement(By.id("send2")).click();
    }

    @Test
    public void validPasswordChangeTest(){
        driver.findElement(By.cssSelector(".box-content a")).click();
        driver.findElement(By.id("current_password")).sendKeys("parola123");
        driver.findElement(By.id("password")).sendKeys("parola124");
        driver.findElement(By.id("confirmation")).sendKeys("parola124");
        driver.findElement(By.cssSelector("div.buttons-set button[type='submit']")).click();

        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log Out']")).click();

        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("parola124");
        driver.findElement(By.id("send2")).click();

        String dashboard = driver.findElement(By.cssSelector("div.page-title")).getText();

        Assert.assertEquals(dashboard, "MY DASHBOARD");

    }

    @After
    public void afterTestMethod() {
        driver.findElement(By.cssSelector(".box-content a")).click();
        driver.findElement(By.id("current_password")).sendKeys("parola124");
        driver.findElement(By.id("password")).sendKeys("parola123");
        driver.findElement(By.id("confirmation")).sendKeys("parola123");
        driver.findElement(By.cssSelector("div.buttons-set button[type='submit']")).click();
        driver.close();
    }
}
