package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.Constants;

public class WishlistRemoveTest extends BaseTest {

    @Before
    public void beforeTestOperations() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        homepage.open();

        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();
        productGridPage.clickSimpleProductPageLink();

        productPage.clickAddToWishlistButton();
    }

    @Test
    public void validRemoveFromWishlistTest() {
        wishlistPage.clickRemoveButton();
        driver.switchTo().alert().accept();
        Assert.assertTrue(wishlistPage.checkProductExists());
    }
}
