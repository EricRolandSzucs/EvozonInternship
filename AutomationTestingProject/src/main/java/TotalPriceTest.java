import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class TotalPriceTest {
    public void validTotalPriceTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(0).click();
        driver.findElement(By.cssSelector("button[title='Continue Shopping']")).click();
        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(1).click();

        List<WebElement> prices = driver.findElements(By.cssSelector("td.product-cart-total span.price"));

        double total = 0;
        for(WebElement price: prices) {
            total = total + Double.parseDouble(price.getText().substring(1));
        }

        double subtotal = Double.parseDouble(driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr:nth-child(1) > td:nth-child(2)")).getText().substring(1));

        if(total == subtotal) {
            System.out.println("Totals match!");
        }
        else
            System.out.println("Totals do not match!");

        driver.close();

    }
}
