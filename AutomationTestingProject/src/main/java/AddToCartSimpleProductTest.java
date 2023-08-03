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
        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElements(By.cssSelector("div.actions button[title='Add to Cart']")).get(0).click();

        String message = driver.findElement(By.cssSelector("li.success-msg")).getText();

        if(message.contains("was added to your shopping cart")) {
            System.out.println("Addition to Cart successful!");
        }
        else
            System.err.println("Addition to Cart unsuccessful :(!");

        driver.close();
    }
}
