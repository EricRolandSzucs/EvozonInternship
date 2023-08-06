package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class PasswordChangeTest extends BaseTest {

    @Before
    public void beforeTestLogin() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
    }

    @Test
    public void validPasswordChangeTest() {
        accountPage.clickChangePasswordLink();

        accountInformationPage.setCurrentPasswordField(Constants.USER_PASSWORD);
        accountInformationPage.setPasswordField("parola124");
        accountInformationPage.setConfirmationField("parola124");

        accountInformationPage.clickPasswordChangeButton();

        homepage.clickAccountLink();
        homepage.clickLogoutLink();

        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField("parola124");
        loginPage.clickLoginButton();

        Assert.assertEquals("Hello, " + Constants.USER_NAME + "!", accountPage.getWelcomeText());

    }

    @After
    public void afterTestPasswordChange() {
        accountPage.clickChangePasswordLink();

        accountInformationPage.setCurrentPasswordField("parola124");
        accountInformationPage.setPasswordField(Constants.USER_PASSWORD);
        accountInformationPage.setConfirmationField(Constants.USER_PASSWORD);

        accountInformationPage.clickPasswordChangeButton();
    }
}
