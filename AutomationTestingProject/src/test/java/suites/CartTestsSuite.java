package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.AddToCartTest;
import tests.ApplyCouponTest;
import tests.TotalPriceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddToCartTest.class,
        ApplyCouponTest.class,
        TotalPriceTest.class

})
public class CartTestsSuite {
}
