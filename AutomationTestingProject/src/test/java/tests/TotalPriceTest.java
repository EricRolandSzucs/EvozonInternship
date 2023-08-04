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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@RunWith(JUnit4.class)
public class TotalPriceTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(0).click();
        driver.findElement(By.cssSelector("button[title='Continue Shopping']")).click();
        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(1).click();
    }


    @Test
    public void validTotalPriceTest() {
        List<WebElement> prices = driver.findElements(By.cssSelector("td.product-cart-total span.price"));

        double total = 0;
        for(WebElement price: prices) {
            total = total + Double.parseDouble(price.getText().substring(1));
        }

        double subtotal = Double.parseDouble(driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr:nth-child(1) > td:nth-child(2)")).getText().substring(1));

        Assert.assertEquals(total, subtotal,0.00000001);
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
