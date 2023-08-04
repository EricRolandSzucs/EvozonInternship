package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.WishlistAddTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    WishlistAddTest.class
})
public class WishlistTestsSuite {
}
