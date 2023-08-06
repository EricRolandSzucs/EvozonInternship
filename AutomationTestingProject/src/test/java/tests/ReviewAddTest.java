package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class ReviewAddTest extends BaseTest {

    @Before
    public void navigateToProduct() {
        homepage.setSearchField(Constants.CONFIGURABLE_PRODUCT);
        homepage.submitSearchField();
    }

    @Test
    public void validReviewTest() {
        productGridPage.clickConfigurableProductPageLink();
        productPage.clickProductReviewTabButton();

        if (productPage.checkReviewExistence()) {
            productPage.clickAddFirstProductReviewButton();
        } else
            productPage.clickAddProductReviewButton();

        reviewPage.setPriceRadioButton();
        reviewPage.setQualityRadioButton();
        reviewPage.setValueRadioButton();

        reviewPage.setReviewField("This is a review");
        reviewPage.setSummaryField("This is a summary");
        reviewPage.setNicknameField("Tester");

        reviewPage.clickPostReviewButton();

        Assert.assertEquals("Your review has been accepted for moderation.", reviewPage.getSuccessfulReviewText());
    }
}
