import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class RegisterTest {

    WebDriver driver;

    @Before
    public void beforeTestMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
    }

    @Test
    public void validRegisterTest(){
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

        Assert.assertEquals(dashboard, "MY DASHBOARD");
    }

    @After
    public void afterTestMethod() {
        driver.close();
    }
}
