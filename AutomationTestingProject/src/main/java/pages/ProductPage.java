package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(css = ".link-wishlist")
    private WebElement addToWishlistButton;

    @FindBy(css = ".add-to-cart-buttons button")
    private WebElement addToCartButton;

    @FindBy(css = "#swatch27")
    private WebElement colorOptionButton;

    @FindBy(css = "#swatch69")
    private WebElement sizeOptionButton;

    @FindBy(css = ".toggle-tabs li.last")
    private WebElement productReviewTabButton;

    @FindBy(css = ".no-rating a")
    protected List<WebElement> addFirstReviewButton;

    @FindBy(css = ".rating-links a:last-of-type")
    private WebElement addReviewButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToWishlistButton() {
        addToWishlistButton.click();
    }

    public void clickColorOptionButton() {
        colorOptionButton.click();
    }

    public void clickSizeOptionButton() {
        sizeOptionButton.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickProductReviewTabButton() { productReviewTabButton.click(); }

    public boolean checkReviewExistence() {
        return addFirstReviewButton.size() > 0;
    }

    public void clickAddFirstProductReviewButton() {
        addFirstReviewButton.get(0).click();
    }

    public void clickAddProductReviewButton() {
        addReviewButton.click();
    }


}
