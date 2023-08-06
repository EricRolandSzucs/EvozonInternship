package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishlistPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElement confirmationTextParagraph;

    @FindBy(xpath = "//tr[td[h3[a[text() = 'Cotton Socks']]]]")
    protected List<WebElement> removableItemRow;

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationText() {
        return confirmationTextParagraph.getText();
    }

    public void clickRemoveButton() {
        removableItemRow.get(0).findElement(By.cssSelector(".btn-remove2")).click();
    }

    public boolean checkProductExists() {
        return !(removableItemRow.size() > 0);
    }


}
