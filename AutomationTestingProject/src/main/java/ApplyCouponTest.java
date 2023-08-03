import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ApplyCouponTest {

    public void validCouponApplyTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(0).click();

        WebElement coupon = driver.findElement(By.id("coupon_code"));
        coupon.sendKeys("TEST12");
        coupon.submit();

        String message = driver.findElement(By.xpath("//td[contains(text(), 'Discount')]")).getText();

        if(message.contains("DISCOUNT")) {
            System.out.println("Discount application successful!");
        }
        else
            System.out.println("Discount application unsuccessful!");

        driver.close();
    }
}
