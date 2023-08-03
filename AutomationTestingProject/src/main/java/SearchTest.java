import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    public void validSearchTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.id("search")).sendKeys("Pants");
        driver.findElement(By.id("search")).submit();

        int productNumber = driver.findElements(By.cssSelector("div.category-products > ul")).size();

        if(productNumber > 0) {
            System.out.println("Search successful");
        }
        else
            System.out.println("Search unsuccessful");

        driver.close();


    }
}
