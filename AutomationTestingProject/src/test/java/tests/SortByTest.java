package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SortByTest extends BaseTest{

    @Test
    public void validSortByTest() {
        homepage.clickVipCategoryLink();
        productGridPage.setFilteringOptionButton();

        Assert.assertTrue(productGridPage.countProductNumberInList() > 0);
    }


}
