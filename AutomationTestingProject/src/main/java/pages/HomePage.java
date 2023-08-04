package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class HomePage extends BasePage{

    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElement loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElement registerLink;

    @FindBy(css = "a[title='Log Out']")
    private WebElement logoutLink;

    @FindBy(css = ".products-grid > li:first-child > a")
    private WebElement productLink;

    @FindBy(css = ".nav-6")
    private WebElement vipCategoryLink;

    @FindBy(id = "search")
    private WebElement searchField;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void open(){
        driver.get(Constants.BASE_URL);
    }

    public void clickAccountLink() {
        accountLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }

    public void clickRegisterLink(){
        registerLink.click();
    }

    public void clickLogoutLink(){
        logoutLink.click();
    }

    public void clickProductPageLink() {
        productLink.click();
    }

    public void clickVipCategoryLink() {
        vipCategoryLink.click();
    }

    public void setSearchField(String field) {
        searchField.sendKeys(field);
    }

    public void submitSearchField() {
        searchField.submit();
    }


}
