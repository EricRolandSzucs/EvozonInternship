package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.LoginTest;
import tests.LogoutTest;
import tests.PasswordChangeTest;
import tests.RegisterTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        LogoutTest.class,
        RegisterTest.class,
        PasswordChangeTest.class
})
public class AccountTestsSuite {
}
