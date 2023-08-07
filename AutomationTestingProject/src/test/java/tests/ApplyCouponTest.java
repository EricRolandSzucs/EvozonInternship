package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class ApplyCouponTest extends BaseTest {

    @Before
    public void navigateToProduct() {
        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();
        productGridPage.clickAddToCartButton();
    }

    @Test
    public void validCouponApplyTest() {
        cartPage.setCouponCodeField("TEST12");
        cartPage.submitCouponCodeField();

        Assert.assertTrue(cartPage.getDiscountText().contains("DISCOUNT"));
    }
}
