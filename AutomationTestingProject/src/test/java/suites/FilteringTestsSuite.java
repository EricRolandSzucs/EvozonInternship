package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.SearchTest;
import tests.SortByTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SearchTest.class,
        SortByTest.class,
})
public class FilteringTestsSuite {
}