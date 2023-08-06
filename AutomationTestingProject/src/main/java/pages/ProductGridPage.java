package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

import java.util.List;

public class ProductGridPage extends BasePage {

    @FindBy(xpath = "//div[h2[a[@title = '" + Constants.SIMPLE_PRODUCT + "']]]")
    private WebElement predefinedSimpleProductLink;

    @FindBy(xpath = "//a[@title='" + Constants.CONFIGURABLE_PRODUCT + "']")
    private WebElement predefinedConfigurableProductPageLink;

    @FindBy(css = ".category-products > ul")
    protected List<WebElement> productList;

    @FindBy(css = ".odd:first-of-type ol li:first-of-type a")
    private WebElement filteringOptionButton;

    @FindBy(css = ".toolbar-bottom select[title='Sort By'] option:last-of-type")
    private WebElement sortByPriceOption;

    @FindBy(css = ".category-products .price")
    protected List<WebElement> priceOfProductsList;

    @FindBy(css = ".toolbar-bottom .sort-by-switcher")
    private WebElement sortByDirectionButton;

    public ProductGridPage(WebDriver driver) {
        super(driver);
    }

    public void clickSimpleProductPageLink() {
        predefinedSimpleProductLink.findElement(By.cssSelector("a[title = 'Cotton Socks']")).click();
    }

    public void clickAddToCartButton() {
        predefinedSimpleProductLink.findElement(By.cssSelector("button[title='Add to Cart']")).click();
    }

    public void clickConfigurableProductPageLink() {
        predefinedConfigurableProductPageLink.click();
    }

    public int countProductNumberInList() {
        return productList.size();
    }

    public void setFilteringOptionButton() {
        filteringOptionButton.click();
    }

    public void clickSortByPriceOption() {
        sortByPriceOption.click();
    }

    public boolean priceOfProductsIsAscending() {
        double previous = -1;
        for (WebElement price : priceOfProductsList) {
            double current = Double.parseDouble(price.getText().replaceAll("[^0-9.]", ""));
            if (current < previous)
                return false;
            previous = current;
        }
        return true;
    }

    public boolean priceOfProductsIsDescending() {
        double previous = Double.parseDouble(priceOfProductsList.get(0).getText().replaceAll("[$,]", ""));
        for (WebElement price : priceOfProductsList) {
            double current = Double.parseDouble(price.getText().replaceAll("[^0-9.]", ""));
            if (current > previous)
                return false;
            previous = current;
        }
        return true;
    }

    public void clickSortByDirectionButton() {
        sortByDirectionButton.click();
    }


}
