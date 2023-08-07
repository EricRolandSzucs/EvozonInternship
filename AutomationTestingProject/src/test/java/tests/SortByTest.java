package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SortByTest extends BaseTest {

    @Before
    public void beforeSortingNavigation() {
        homepage.clickVipCategoryLink();
    }

    @Test
    public void validSortByPriceAscendingTest() {
        productGridPage.clickSortByPriceOption();
        Assert.assertTrue(productGridPage.priceOfProductsIsAscending());
    }

    @Test
    public void validSortByPriceDescendingTest() {
        productGridPage.clickSortByPriceOption();
        productGridPage.clickSortByDirectionButton();
        Assert.assertTrue(productGridPage.priceOfProductsIsDescending());
    }

    @Test
    public void validSortByLeftPanelTest() {
        productGridPage.setFilteringOptionButton();

        Assert.assertTrue(productGridPage.countProductNumberInList() > 0);
    }


}
