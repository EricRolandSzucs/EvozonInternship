package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.Constants;

public class CatalogPage extends BasePage {

    @FindBy(xpath = "//tr[td[contains(text(), '" + Constants.SIMPLE_PRODUCT_ID + "')]]")
    private WebElement simpleProductRow;

    @FindBy(xpath = "//tr[td[contains(text(), '" + Constants.CONFIGURABLE_PRODUCT_ID + "')]]")
    private WebElement configurableProductRow;

    @FindBy(id = "productGrid_product_filter_entity_id_to")
    private WebElement toField;

    @FindBy(css = "button[title=\"Search\"]")
    private WebElement searchButton;


    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void setToField(String code) {
        toField.sendKeys(code);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public WebElement getSimpleProductRow() {
        return simpleProductRow;
    }

    public WebElement getConfigurableProductRow() {
        return configurableProductRow;
    }

    public String getNameColumnText(WebElement productRow) {
        return productRow.findElement(By.cssSelector("td:nth-of-type(3)")).getText();
    }

    public int getQuantityColumnText(WebElement productRow) {
        return Integer.parseInt(productRow.findElement(By.cssSelector("td:nth-of-type(8)")).getText());
    }

    public String getVisibilityColumnText(WebElement productRow) {
        return productRow.findElement(By.cssSelector("td:nth-of-type(9)")).getText();
    }

    public String getStatusColumnText(WebElement productRow) {
        return productRow.findElement(By.cssSelector("td:nth-of-type(10)")).getText();
    }
}
