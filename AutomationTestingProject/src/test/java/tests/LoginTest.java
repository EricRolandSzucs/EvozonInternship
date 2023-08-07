package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, " + Constants.USER_NAME + "!", accountPage.getWelcomeText());

    }

    @Test
    public void invalidLoginTest() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField("parola");
        loginPage.clickLoginButton();

        Assert.assertEquals(loginPage.getErrorText(), "Invalid login or password.");
    }
}
