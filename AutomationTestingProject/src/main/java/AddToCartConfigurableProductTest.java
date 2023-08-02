import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartConfigurableProductTest {
    public void validAddToCartTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();

        driver.findElement(By.xpath("//a[@title='DUMBO Boyfriend Jean']")).click();

        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click();

        driver.findElement(By.cssSelector("#swatch69 > span.swatch-label")).click();

        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button")).click();

        String message = driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span")).getText();

        if(message.contains("was added to your shopping cart")) {
            System.out.println("Addition to Cart successful!");
        }
        else
            System.err.println("Addition to Cart unsuccessful :(!");

        driver.close();
    }
}
