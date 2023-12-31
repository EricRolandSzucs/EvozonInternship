package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class WishlistAddTest extends BaseTest {

    @Before
    public void beforeTestLogin() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        homepage.open();
    }

    @Test
    public void validAddToWishlistTest() {
        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();
        productGridPage.clickSimpleProductPageLink();

        productPage.clickAddToWishlistButton();

        Assert.assertEquals(Constants.SIMPLE_PRODUCT + " has been added to your wishlist. Click here to continue shopping.", wishlistPage.getConfirmationText());
    }
}
