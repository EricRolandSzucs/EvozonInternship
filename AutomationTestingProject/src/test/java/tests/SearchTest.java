package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class SearchTest extends BaseTest {

    @Test
    public void validSearchTest() {
        homepage.setSearchField(Constants.SIMPLE_PRODUCT);
        homepage.submitSearchField();

        Assert.assertTrue(productGridPage.countProductNumberInList() > 0);
    }
}
