package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class AddToCartTest extends BaseTest {

    @Test
    public void validAddToCartSimpleProductTest() {
        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();

        productGridPage.clickAddToCartButton();

        Assert.assertEquals(Constants.SIMPLE_PRODUCT + " was added to your shopping cart.", cartPage.getProductAddedText());

    }

    @Test
    public void validAddToCartConfigurableProductTest() {
        homepage.setSearchField(Constants.CONFIGURABLE_PRODUCT);
        homepage.submitSearchField();

        productGridPage.clickConfigurableProductPageLink();

        productPage.clickColorOptionButton();

        productPage.clickSizeOptionButton();

        productPage.clickAddToCartButton();

        Assert.assertEquals(Constants.CONFIGURABLE_PRODUCT + " was added to your shopping cart.", cartPage.getProductAddedText());
    }
}
