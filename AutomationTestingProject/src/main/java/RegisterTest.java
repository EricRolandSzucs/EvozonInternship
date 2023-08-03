import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void validRegisterTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("a[data-target-element='#header-account'")).click();
        driver.findElement(By.cssSelector("a[title='Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("Testor");
        driver.findElement(By.id("middlename")).sendKeys("T");
        driver.findElement(By.id("lastname")).sendKeys("Testoringer");
        RandomEmailGenerator rt = new RandomEmailGenerator();
        driver.findElement(By.id("email_address")).sendKeys(rt.getSaltString());
        driver.findElement(By.id("password")).sendKeys("parola123");
        driver.findElement(By.id("confirmation")).sendKeys("parola123");
        driver.findElement(By.cssSelector("button[title='Register']")).click();

        String dashboard = driver.findElement(By.cssSelector("div.page-title")).getText();

        if (dashboard.equalsIgnoreCase("MY DASHBOARD"))
            System.out.println("Register successful!");
        else
            System.err.println("Register unsuccessful :(!");

        driver.close();
    }
}
