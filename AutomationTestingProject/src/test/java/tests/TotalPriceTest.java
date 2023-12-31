package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class TotalPriceTest extends BaseTest {

    @Before
    public void beforeTestProductAddition() {
        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();
        productGridPage.clickAddToCartButton();

        homepage.setSearchField(Constants.CONFIGURABLE_PRODUCT);
        homepage.submitSearchField();
        productGridPage.clickConfigurableProductPageLink();
        productPage.clickColorOptionButton();
        productPage.clickSizeOptionButton();
        productPage.clickAddToCartButton();
    }

    @Test
    public void validTotalPriceTest() {
        Assert.assertEquals(cartPage.getCartTotalText(), cartPage.calculateTotalOfProductInCart(), 0.00000001);
    }
}
