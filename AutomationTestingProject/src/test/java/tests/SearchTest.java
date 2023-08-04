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
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class SearchTest extends BaseTest {

    @Test
    public void validSearchTest() {
        homepage.setSearchField("Pants");
        homepage.submitSearchField();

        Assert.assertTrue(productGridPage.countProductNumberInList() > 0);
    }
}
