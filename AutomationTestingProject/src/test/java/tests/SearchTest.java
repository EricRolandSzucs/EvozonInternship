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
public class SearchTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validSearchTest() {
        driver.findElement(By.id("search")).sendKeys("Pants");
        driver.findElement(By.id("search")).submit();

        int productNumber = driver.findElements(By.cssSelector("div.category-products > ul")).size();

        Assert.assertTrue(productNumber > 0);
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
