package tests.admin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.admin.AdminHomePage;
import pages.admin.CatalogPage;

@RunWith(JUnit4.class)
public class AdminBaseTest {
    protected WebDriver driver;
    protected AdminHomePage homepage;
    protected CatalogPage catalogPage;

    @Before
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new AdminHomePage(driver);
        catalogPage = new CatalogPage(driver);

        homepage.open();
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}