package tests.admin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebElement;
import utils.Constants;

@RunWith(JUnit4.class)
public class AdminProductExistenceTest extends AdminBaseTest{

    @Before
    public void navigateToProducts(){
        homepage.setUsernameField(Constants.ADMIN_USERNAME);
        homepage.setPasswordField(Constants.ADMIN_PASSWORD);
        homepage.clickLoginButton();
        homepage.clickPopupCloseButton();
        homepage.clickCatalogLink();
        homepage.clickManageProductsLink();
    }

    @Test
    public void validExistenceTestSimpleProduct(){
        catalogPage.setToField(Constants.SIMPLE_PRODUCT_ID);
        catalogPage.clickSearchButton();

        WebElement row = catalogPage.getSimpleProductRow();

        Assert.assertEquals(Constants.SIMPLE_PRODUCT, catalogPage.getNameColumnText(row));
        Assert.assertTrue(catalogPage.getQuantityColumnText(row) > 0);
        Assert.assertEquals("Catalog, Search", catalogPage.getVisibilityColumnText(row));
        Assert.assertEquals("Enabled", catalogPage.getStatusColumnText(row));
    }

    @Test
    public void validExistenceTestConfigurableProduct() {
        catalogPage.setToField(Constants.CONFIGURABLE_PRODUCT_ID);
        catalogPage.clickSearchButton();

        WebElement row = catalogPage.getConfigurableProductRow();

        Assert.assertEquals("Flip Flops-Blue-10", catalogPage.getNameColumnText(row));
        Assert.assertTrue(catalogPage.getQuantityColumnText(row) > 0);
        Assert.assertEquals("Enabled", catalogPage.getStatusColumnText(row));
    }
}
