package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.admin.AdminLoginTest;
import tests.admin.AdminProductExistenceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdminLoginTest.class,
        AdminProductExistenceTest.class
})
public class AdminTestsSuite {
}
