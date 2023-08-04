package tests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import utils.Constants;

@RunWith(JUnit4.class)
public class RegisterTest extends BaseTest{

    @Test
    public void validRegisterTest(){
        homepage.clickAccountLink();
        homepage.clickRegisterLink();

        registerPage.setFirstNameField("Testor");
        registerPage.setMiddleNameField("TT");
        registerPage.setLastNameField("Testing");
        registerPage.setEmailAddressField();
        registerPage.setPasswordField("parola123");
        registerPage.setConfirmationField("parola123");

        registerPage.clickRegisterButton();

        Assert.assertEquals("Hello, " + Constants.USER_NAME + "!", accountPage.getWelcomeText());
    }
}
