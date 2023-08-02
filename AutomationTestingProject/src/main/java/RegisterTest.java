import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class RegisterTest {

    public void validRegisterTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa1magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Testor");
        driver.findElement(By.id("middlename")).sendKeys("T");
        driver.findElement(By.id("lastname")).sendKeys("Testoringer");
        RandomEmailGenerator rt = new RandomEmailGenerator();
        driver.findElement(By.id("email_address")).sendKeys(rt.getSaltString());
        driver.findElement(By.id("password")).sendKeys("parola123");
        driver.findElement(By.id("confirmation")).sendKeys("parola123");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        String dashboard = driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.page-title > h1")).getText();

        if (dashboard.equalsIgnoreCase("MY DASHBOARD"))
            System.out.println("Register successful!");
        else
            System.err.println("Register unsuccessful :(!");

        driver.close();
    }
}
