package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class LogoutTest extends BaseTest {

    @Before
    public void beforeTestLogin() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
    }

    @Test
    public void validLogoutTest() {
        homepage.clickAccountLink();
        homepage.clickLogoutLink();

        Assert.assertEquals("YOU ARE NOW LOGGED OUT", accountPage.getLogoutText());
    }
}
