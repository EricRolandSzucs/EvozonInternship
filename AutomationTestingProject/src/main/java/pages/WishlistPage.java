package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage{

    @FindBy(css = ".success-msg")
    private WebElement confirmationTextParagraph;

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationText(){
        return confirmationTextParagraph.getText();
    }


}
