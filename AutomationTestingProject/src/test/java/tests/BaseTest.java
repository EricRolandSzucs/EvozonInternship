package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

@RunWith(JUnit4.class)
public class BaseTest {
    protected WebDriver driver;
    protected HomePage homepage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;
    protected RegisterPage registerPage;
    protected ProductPage productPage;
    protected WishlistPage wishlistPage;
    protected ProductGridPage productGridPage;
    protected CartPage cartPage;
    protected ProductReviewPage reviewPage;
    protected AccountInformationPage accountInformationPage;
    protected CheckoutPage checkoutPage;

    @Before
    public void initDriver() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        registerPage = new RegisterPage(driver);
        productPage = new ProductPage(driver);
        wishlistPage = new WishlistPage(driver);
        productGridPage = new ProductGridPage(driver);
        cartPage = new CartPage(driver);
        reviewPage = new ProductReviewPage(driver);
        accountInformationPage = new AccountInformationPage(driver);
        checkoutPage = new CheckoutPage(driver);

        homepage.open();
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
