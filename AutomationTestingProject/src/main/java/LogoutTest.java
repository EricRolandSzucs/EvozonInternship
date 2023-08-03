import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {

    public void validLogoutTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("parola123");
        driver.findElement(By.id("send2")).click();

        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Log Out']")).click();

        String message = driver.findElement(By.cssSelector("div.page-title")).getText();

        if(message.equals("YOU ARE NOW LOGGED OUT")) {
            System.out.println("Logout successful");
        }
        else
            System.out.println("Logout unsuccessful");

        driver.close();

    }
}
