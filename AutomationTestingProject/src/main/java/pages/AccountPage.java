package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(css = ".hello strong")
    private WebElement welcomeTextParagraph;

    @FindBy(css = ".page-title")
    private WebElement logoutTextParagraph;

    @FindBy(css = ".box-content a")
    private WebElement changePasswordLink;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }

    public String getLogoutText(){
        return logoutTextParagraph.getText();
    }

    public void clickChangePasswordLink() {
        changePasswordLink.click();
    }
}