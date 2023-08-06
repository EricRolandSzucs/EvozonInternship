package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegisterTest.class,
        LoginTest.class,
        AddToCartTest.class,
        CheckoutTest.class,
})
public class SmokeTestsSuite {
}
