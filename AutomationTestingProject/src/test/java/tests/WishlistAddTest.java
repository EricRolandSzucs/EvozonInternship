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
public class WishlistAddTest {

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
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validWishlistTest(){
        driver.findElement(By.cssSelector("ul.products-grid > li:first-child > a")).click();
        driver.findElement(By.cssSelector("a.link-wishlist")).click();

        String message = driver.findElement(By.cssSelector("li.success-msg")).getText();

        Assert.assertTrue(message.contains("has been added to your wishlist"));
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
