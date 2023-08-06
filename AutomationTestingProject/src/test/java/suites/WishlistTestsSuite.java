package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.WishlistAddTest;
import tests.WishlistRemoveTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WishlistAddTest.class,
        WishlistRemoveTest.class,
})
public class WishlistTestsSuite {
}
