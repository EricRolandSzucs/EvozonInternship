package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutPage extends BasePage{


    @FindBy(css = "#billing-address-select")
    protected List<WebElement> billingAddressSelect;

    @FindBy(id ="billing:firstname")
    private WebElement firstNameField;

    @FindBy(id = "billing:lastname")
    private WebElement lastNameField;

    @FindBy(id = "billing:street1")
    private WebElement addressField;

    @FindBy(id = "billing:city")
    private WebElement cityField;

    @FindBy(id = "billing:postcode")
    private WebElement postcodeField;

    @FindBy(css = "#billing\\:country_id > option:nth-child(2)")
    private WebElement countryDropDown;

    @FindBy(id = "billing:telephone")
    private WebElement telephoneField;

    @FindBy(id = "billing:use_for_shipping_no")
    private WebElement differentAddressRadioButton;

    @FindBy(css = "#billing-buttons-container button")
    private WebElement billingContinueButton;

    @FindBy(css = "#shipping-buttons-container button")
    private WebElement shippingInformationContinueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElement shippingRadioButton;

    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElement shippingMethodContinueButton;

    @FindBy(css = "#payment-buttons-container button")
    private WebElement paymentContinueButton;

    @FindBy(css = "#review-buttons-container button")
    private WebElement placeOrderButton;

    @FindBy(css = ".page-title h1")
    private WebElement orderConfirmationText;

    @FindBy(id ="shipping:firstname")
    protected WebElement firstNameShippingField;

    @FindBy(id = "shipping:lastname")
    private WebElement lastNameShippingField;

    @FindBy(id = "shipping:street1")
    private WebElement addressShippingField;

    @FindBy(id = "shipping:city")
    private WebElement cityShippingField;

    @FindBy(id = "shipping:postcode")
    private WebElement postcodeShippingField;

    @FindBy(css = "#shipping\\:country_id > option:nth-child(2)")
    private WebElement countryShippingDropDown;

    @FindBy(id = "shipping:telephone")
    private WebElement telephoneShippingField;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkBillingSelectExistence() {return billingAddressSelect.size() > 0; }

    public void setFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setAddressField(String address) {
        addressField.sendKeys(address);
    }

    public void setCityField(String city) {
        cityField.sendKeys(city);
    }

    public void setPostcodeField(String postcode) {
        postcodeField.sendKeys(postcode);
    }

    public void setCountryDropDown() {
        countryDropDown.click();
    }

    public void setTelephoneField(String telephone) {
        telephoneField.sendKeys(telephone);
    }

    public boolean checkFirstNameShippingFieldEnabled() { return firstNameShippingField.isEnabled();}

    public void setFirstNameShippingField(String firstName) {
        firstNameShippingField.sendKeys(firstName);
    }

    public void setLastNameShippingField(String lastName) {
        lastNameShippingField.sendKeys(lastName);
    }

    public void setAddressShippingField(String address) {
        addressShippingField.sendKeys(address);
    }

    public void setCityShippingField(String city) {
        cityShippingField.sendKeys(city);
    }

    public void setPostcodeShippingField(String postcode) {
        postcodeShippingField.sendKeys(postcode);
    }

    public void setCountryShippingDropDown() {
        countryShippingDropDown.click();
    }

    public void setTelephoneShippingField(String telephone) {
        telephoneShippingField.sendKeys(telephone);
    }

    public void setDifferentAddressRadioButton() {
        differentAddressRadioButton.click();
    }
    public void clickBillingContinueButton() {
        billingContinueButton.click();
    }

    public void clickShippingInformationContinueButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(shippingInformationContinueButton));
        shippingInformationContinueButton.click();
    }
    public void clickShippingMethodContinueButton() {
        shippingMethodContinueButton.click();
    }

    public void setShippingRadioButton() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(shippingRadioButton));
        shippingRadioButton.click();
    }

    public void clickPaymentContinueButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(paymentContinueButton));
        paymentContinueButton.click();
    }

    public void clickPlaceOrderButton() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        placeOrderButton.click();
    }

    public String getOrderConfirmationText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text() = 'Your order has been received.']")));
        return orderConfirmationText.getText();
    }

}
