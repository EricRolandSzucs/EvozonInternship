package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElement productAddedParagraph;

    @FindBy(id = "coupon_code")
    private WebElement couponCodeField;

    @FindBy(xpath = "//td[contains(text(), 'Discount')]")
    private WebElement discountParagraph;

    @FindBy(css = "button[title='Continue Shopping']")
    private WebElement continueShoppingButton;

    @FindBy(css = ".product-cart-total span.price")
    protected List<WebElement> productsInCart;

    @FindBy(css = "#shopping-cart-totals-table > tbody > tr:nth-child(1) > td:nth-child(2)")
    private WebElement cartTotalParagraph;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductAddedText(){
        return productAddedParagraph.getText();
    }

    public void setCouponCodeField(String couponCode){
        couponCodeField.sendKeys(couponCode);
    }

    public void submitCouponCodeField() {
        couponCodeField.submit();
    }

    public String getDiscountText() {
        return discountParagraph.getText();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public double calculateTotalOfProductInCart() {
        double total = 0;
        for(WebElement price: productsInCart) {
            total = total + Double.parseDouble(price.getText().substring(1));
        }
        return total;
    }

    public double getCartTotalText() {
        return Double.parseDouble(cartTotalParagraph.getText().substring(1));
    }

}
