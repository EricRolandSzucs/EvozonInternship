package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SortByPriceTest extends BaseTest{

    @Test
    public void validSortByPriceAscendingTest() {
        homepage.clickVipCategoryLink();
        productGridPage.clickSortByPriceOption();
        Assert.assertTrue(productGridPage.priceOfProductsIsAscending());
    }

    @Test
    public void validSortByPriceDescendingTest() {
        homepage.clickVipCategoryLink();
        productGridPage.clickSortByPriceOption();
        productGridPage.clickSortByDirectionButton();
        Assert.assertTrue(productGridPage.priceOfProductsIsDescending());
    }
}
