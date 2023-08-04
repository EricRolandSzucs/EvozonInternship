package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TotalPriceTest extends BaseTest{

    @Before
    public void beforeTestProductAddition() {

        homepage.clickVipCategoryLink();

        productGridPage.clickAddToCartButton(0);
        cartPage.clickContinueShoppingButton();
        productGridPage.clickAddToCartButton(1);
    }

    @Test
    public void validTotalPriceTest() {
        Assert.assertEquals(cartPage.getCartTotalText(), cartPage.calculateTotalOfProductInCart(),0.00000001);
    }
}
