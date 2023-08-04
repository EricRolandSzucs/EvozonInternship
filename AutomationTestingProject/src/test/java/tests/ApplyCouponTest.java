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

@RunWith(JUnit4.class)
public class ApplyCouponTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validCouponApplyTest() {
        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(0).click();

        WebElement coupon = driver.findElement(By.id("coupon_code"));
        coupon.sendKeys("TEST12");
        coupon.submit();

        String message = driver.findElement(By.xpath("//td[contains(text(), 'Discount')]")).getText();

        Assert.assertTrue(message.contains("DISCOUNT"));
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
