package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ReviewAddTest extends BaseTest{

    @Test
    public void validReviewTest() {
        homepage.clickProductPageLink();
        productPage.clickProductReviewTabButton();

        if(productPage.checkReviewExistence()) {
            productPage.clickAddFirstProductReviewButton();
        }
        else
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
