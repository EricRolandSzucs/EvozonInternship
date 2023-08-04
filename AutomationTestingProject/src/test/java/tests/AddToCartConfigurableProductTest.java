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
public class AddToCartConfigurableProductTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validAddToCartTest() {
        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElement(By.xpath("//a[@title='DUMBO Boyfriend Jean']")).click();

        driver.findElement(By.cssSelector("#swatch27")).click();

        driver.findElement(By.cssSelector("#swatch69")).click();

        driver.findElement(By.cssSelector("div.add-to-cart-buttons button")).click();

        String message = driver.findElement(By.cssSelector("li.success-msg")).getText();

        Assert.assertTrue(message.contains("was added to your shopping cart"));
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
