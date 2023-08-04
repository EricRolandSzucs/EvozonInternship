package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AddToCartSimpleProductTest extends BaseTest {

    @Test
    public void validAddToCartTest() {
        homepage.clickVipCategoryLink();

        productGridPage.clickAddToCartButton(0);

        Assert.assertTrue(cartPage.getProductAddedText().contains("was added to your shopping cart"));

    }
}
