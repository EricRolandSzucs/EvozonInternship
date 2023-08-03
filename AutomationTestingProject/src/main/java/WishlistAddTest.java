import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistAddTest {

    public void validWishlistTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("parola123");
        driver.findElement(By.id("send2")).click();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("ul.products-grid > li:first-child > a")).click();
        driver.findElement(By.cssSelector("a.link-wishlist")).click();

        String message = driver.findElement(By.cssSelector("li.success-msg")).getText();

        if(message.contains("has been added to your wishlist")) {
            System.out.println("Wishlist addition successful!");
        }
        else
            System.err.println("Wishlist addition unsuccessful :(!");

        driver.close();

    }
}
