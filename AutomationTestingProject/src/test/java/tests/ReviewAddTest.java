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
public class ReviewAddTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validReviewTest() {
        driver.findElement(By.cssSelector("ul.products-grid > li:first-child > a")).click();
        driver.findElement(By.cssSelector("ul.toggle-tabs li.last")).click();

        if(driver.findElements(By.cssSelector("p.no-rating a")).size() != 0) {
            driver.findElement(By.cssSelector("p.no-rating a")).click();
        }
        else
            driver.findElement(By.cssSelector("p.rating-links a:last-of-type")).click();

        driver.findElement(By.id("Quality_5")).click();
        driver.findElement(By.id("Price_5")).click();
        driver.findElement(By.id("Value_5")).click();
        driver.findElement(By.id("review_field")).sendKeys("Test review");
        driver.findElement(By.id("summary_field")).sendKeys("Test");
        driver.findElement(By.id("nickname_field")).sendKeys("Tester");
        driver.findElement(By.cssSelector("div.buttons-set button")).click();
        String message = driver.findElement(By.cssSelector("ul.messages span")).getText();

        Assert.assertEquals(message, "Your review has been accepted for moderation.");
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
