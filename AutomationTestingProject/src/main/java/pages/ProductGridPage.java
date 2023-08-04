package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductGridPage extends BasePage{

    @FindBy(css = ".actions button[title='Add to Cart']")
    protected List<WebElement> addToCartButtons;

    @FindBy(xpath = "//a[@title='DUMBO Boyfriend Jean']")
    private WebElement configurableProductPageLink;

    @FindBy(css = ".category-products > ul")
    protected List<WebElement> productList;

    @FindBy(css = ".odd:first-of-type ol li:first-of-type a")
    private WebElement filteringOptionButton;

    public ProductGridPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton(int index) {
        addToCartButtons.get(index).click();
    }

    public void clickConfigurableProductPageLink() {
        configurableProductPageLink.click();
    }

    public int countProductNumberInList() {
        return productList.size();
    }

    public void setFilteringOptionButton() {
        filteringOptionButton.click();
    }
}
