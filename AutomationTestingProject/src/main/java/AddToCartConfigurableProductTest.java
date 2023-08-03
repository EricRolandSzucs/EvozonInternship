import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartConfigurableProductTest {
    public void validAddToCartTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElement(By.xpath("//a[@title='DUMBO Boyfriend Jean']")).click();

        driver.findElement(By.cssSelector("#swatch27")).click();

        driver.findElement(By.cssSelector("#swatch69")).click();

        driver.findElement(By.cssSelector("div.add-to-cart-buttons button")).click();

        String message = driver.findElement(By.cssSelector("li.success-msg")).getText();

        if(message.contains("was added to your shopping cart")) {
            System.out.println("Addition to Cart successful!");
        }
        else
            System.err.println("Addition to Cart unsuccessful :(!");

        driver.close();
    }
}
