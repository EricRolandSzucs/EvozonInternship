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
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();
        List<WebElement> products = driver.findElements(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > button"));

        for (WebElement product : products) {
            if (product.getText().equalsIgnoreCase("Add to cart")) {
                product.click();
                break;
            }
        }


        WebElement coupon = driver.findElement(By.id("coupon_code"));
        coupon.sendKeys("TEST12");
        coupon.submit();

        String message = driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr:nth-child(2) > td:nth-child(1)")).getText();

        if(message.contains("DISCOUNT")) {
            System.out.println("Discount application successful!");
        }
        else
            System.out.println("Discount application unsuccessful!");
    }
}
