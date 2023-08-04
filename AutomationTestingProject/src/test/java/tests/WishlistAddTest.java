package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class WishlistAddTest extends BaseTest{

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
    public void validWishlistTest(){
        homepage.clickProductPageLink();
        productPage.clickAddToWishlistButton();

        Assert.assertTrue(wishlistPage.getConfirmationText().contains("has been added to your wishlist"));
    }
}
