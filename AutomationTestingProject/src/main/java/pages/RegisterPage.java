package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.RandomEmailGenerator;

public class RegisterPage extends BasePage {

    @FindBy(id ="firstname")
    private WebElement firstNameField;

    @FindBy(id = "middlename")
    private WebElement middleNameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "email_address")
    private WebElement emailAddressField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement confirmationField;

    @FindBy(css = "button[title='Register']")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void setMiddleNameField(String middleName) {
        middleNameField.sendKeys(middleName);
    }

    public void setLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setEmailAddressField() {
        RandomEmailGenerator rt = new RandomEmailGenerator();
        emailAddressField.sendKeys(rt.getSaltString());
    }

    public void setPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void setConfirmationField(String confirmation) {
        confirmationField.sendKeys(confirmation);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
