import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortByTest {
    public void validSortByTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://qa1magento.dev.evozon.com/");

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6 > a")).click();

        driver.findElement(By.cssSelector("#narrow-by-list > dd:nth-child(1) > ol > li:nth-child(1) > a")).click();

        int productNumber = driver.findElements(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul")).size();

        if(productNumber > 0) {
            System.out.println("Sort successful");
        }
        else
            System.out.println("Sort unsuccessful");

        driver.close();
    }

}
