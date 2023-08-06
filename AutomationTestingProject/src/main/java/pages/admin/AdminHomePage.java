package pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.Constants;

import java.time.Duration;

public class AdminHomePage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "login")
    private WebElement passwordField;

    @FindBy(css = ".form-buttons  input")
    private WebElement loginButton;

    @FindBy(css = "#nav > li:nth-child(3) > a")
    private WebElement catalogLink;

    @FindBy(css = "#nav > li:nth-child(3) > ul > li:nth-child(1) > a")
    private WebElement manageProductsLink;

    @FindBy(css = "#nav > li:nth-child(4) > a")
    private WebElement customersLink;

    @FindBy(css = "#nav > li:nth-child(4) > ul > li:nth-child(1) > a")
    private WebElement manageCustomersLink;

    @FindBy(css = ".message-popup-head a")
    private WebElement popupCloseButton;

    @FindBy(css = ".super")
    private WebElement loginConfirmationText;

    public AdminHomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(Constants.ADMIN_URL);
    }

    public void setUsernameField(String username) {
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickCatalogLink() {
        catalogLink.click();
    }

    public void clickManageProductsLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(manageProductsLink));
        manageProductsLink.click();
    }

    public void clickCustomersLink() {
        customersLink.click();
    }

    public void clickManageCustomersLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(manageCustomersLink));
        manageCustomersLink.click();
    }

    public void clickPopupCloseButton() {
        popupCloseButton.click();
    }

    public String getLoginConfirmationText() {
        return loginConfirmationText.getText();
    }
}
