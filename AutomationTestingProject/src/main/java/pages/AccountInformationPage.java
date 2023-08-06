package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationPage extends BasePage {

    @FindBy(id = "current_password")
    private WebElement currentPasswordField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement confirmationField;

    @FindBy(css = ".buttons-set button[type='submit']")
    private WebElement passwordChangeButton;

    public AccountInformationPage(WebDriver driver) {
        super(driver);
    }

    public void setCurrentPasswordField(String currentPassword) {
        currentPasswordField.sendKeys(currentPassword);
    }

    public void setPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void setConfirmationField(String confirmation) {
        confirmationField.sendKeys(confirmation);
    }

    public void clickPasswordChangeButton() {
        passwordChangeButton.click();
    }
}
