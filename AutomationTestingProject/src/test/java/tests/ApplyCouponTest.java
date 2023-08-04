package tests;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class ApplyCouponTest extends BaseTest {

    @Test
    public void validCouponApplyTest() {
        homepage.clickVipCategoryLink();

        productGridPage.clickAddToCartButton(0);

        cartPage.setCouponCodeField("TEST12");
        cartPage.submitCouponCodeField();

        Assert.assertTrue(cartPage.getDiscountText().contains("DISCOUNT"));
    }
}
