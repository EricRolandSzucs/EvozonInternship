package tests.admin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class AdminLoginTest extends AdminBaseTest {

    @Test
    public void validLoginTest() {
        homepage.setUsernameField(Constants.ADMIN_USERNAME);
        homepage.setPasswordField(Constants.ADMIN_PASSWORD);
        homepage.clickLoginButton();
        homepage.clickPopupCloseButton();

        Assert.assertTrue(homepage.getLoginConfirmationText().contains("Logged in as " + Constants.ADMIN_USERNAME));
    }
}
