import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.AddToCartConfigurableProductTest;
import tests.AddToCartSimpleProductTest;
import tests.ApplyCouponTest;
import tests.TotalPriceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddToCartSimpleProductTest.class,
        AddToCartConfigurableProductTest.class,
        ApplyCouponTest.class,
        TotalPriceTest.class

})
public class CartTestsSuite {
}
