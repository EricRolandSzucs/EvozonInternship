import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortByTest {
    public void validSortByTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("li.nav-6")).click();

        driver.findElement(By.cssSelector("dd.odd:first-of-type ol li:first-of-type a")).click();

        int productNumber = driver.findElements(By.cssSelector("div.category-products > ul")).size();

        if(productNumber > 0) {
            System.out.println("Sort successful");
        }
        else
            System.out.println("Sort unsuccessful");

        driver.close();
    }

}
