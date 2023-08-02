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
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();

        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > button")).click();
        driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > button")).click();

        List<WebElement> prices = driver.findElements(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-total > span > span"));

        double total = 0;
        for(WebElement price: prices) {
            total = total + Double.parseDouble(price.getText().substring(1));
        }

        double subtotal = Double.parseDouble(driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr:nth-child(1) > td:nth-child(2) > span")).getText().substring(1));

        if(total == subtotal) {
            System.out.println("Totals match!");
        }
        else
            System.out.println("Totals do not match!");

    }
}
