package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends BasePage{

    @FindBy(css = ".messages span")
    private WebElement successfulReviewParagraph;

    @FindBy(id ="Quality_5")
    private WebElement qualityRadioButton;

    @FindBy(id = "Price_5")
    private WebElement priceRadioButton;

    @FindBy(id = "Value_5")
    private WebElement valueRadioButton;

    @FindBy(id = "review_field")
    private WebElement reviewField;

    @FindBy(id = "summary_field")
    private WebElement summaryField;

    @FindBy(id = "nickname_field")
    private WebElement nicknameField;

    @FindBy(css = ".buttons-set button")
    private WebElement postReviewButton;

    public ProductReviewPage(WebDriver driver) {
        super(driver);
    }

    public void setQualityRadioButton(){
        qualityRadioButton.click();
    }

    public void setPriceRadioButton(){
        priceRadioButton.click();
    }

    public void setValueRadioButton() {
        valueRadioButton.click();
    }

    public void setReviewField(String review) {
        reviewField.sendKeys(review);
    }

    public void setSummaryField(String summary) {
        summaryField.sendKeys(summary);
    }

    public void setNicknameField(String nickname) {
        nicknameField.sendKeys(nickname);
    }

    public void clickPostReviewButton() {
        postReviewButton.click();
    }

    public String getSuccessfulReviewText() {
        return successfulReviewParagraph.getText();
    }
}
