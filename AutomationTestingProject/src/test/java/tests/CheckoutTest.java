package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class CheckoutTest extends BaseTest{

    @Before
    public void addProduct() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();

        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();
        productGridPage.clickAddToCartButton();
        productPage.clickCheckoutButton();
    }

    @Test
    public void validCheckoutTest(){
//        if(!checkoutPage.checkBillingSelectExistence()) {
//            checkoutPage.setFirstNameField("Test");
//            checkoutPage.setLastNameField("Test");
//            checkoutPage.setAddressField("Address");
//            checkoutPage.setCityField("City");
//            checkoutPage.setPostcodeField("0000");
//            checkoutPage.setCountryDropDown();
//            checkoutPage.setTelephoneField("0777777");
//        }
        checkoutPage.setDifferentAddressRadioButton();

        checkoutPage.clickBillingContinueButton();

//        if(!checkoutPage.checkFirstNameShippingFieldEnabled()) {
//            checkoutPage.setFirstNameShippingField("Test");
//            checkoutPage.setLastNameShippingField("Test");
//            checkoutPage.setAddressShippingField("Address");
//            checkoutPage.setCityShippingField("City");
//            checkoutPage.setPostcodeShippingField("0000");
//            checkoutPage.setCountryShippingDropDown();
//            checkoutPage.setTelephoneShippingField("0777777");
//        }

        checkoutPage.clickShippingInformationContinueButton();

        checkoutPage.setShippingRadioButton();

        checkoutPage.clickShippingMethodContinueButton();

        checkoutPage.clickPaymentContinueButton();

        checkoutPage.clickPlaceOrderButton();

        Assert.assertEquals("YOUR ORDER HAS BEEN RECEIVED.", checkoutPage.getOrderConfirmationText());
    }
}
