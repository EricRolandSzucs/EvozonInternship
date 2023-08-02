import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddToCartSimpleProductTest {
    public void validAddToCartTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();
        List<WebElement> products = driver.findElements(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > button"));

        for(WebElement product: products) {
            if(product.getText().equalsIgnoreCase("Add to cart")) {
                product.click();
                break;
            }
        }

        String message = driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span")).getText();

        if(message.contains("was added to your shopping cart")) {
            System.out.println("Addition to Cart successful!");
        }
        else
            System.err.println("Addition to Cart unsuccessful :(!");

        driver.close();
    }
}
