public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        LoginTest loginTest = new LoginTest();
        loginTest.validLoginTest();

        RegisterTest registerTest = new RegisterTest();
        registerTest.validRegisterTest();

        WishlistAddTest wish = new WishlistAddTest();
        wish.validWishlistTest();

        LogoutTest logoutTest = new LogoutTest();
        logoutTest.validLogoutTest();

        AddToCartSimpleProductTest addition = new AddToCartSimpleProductTest();
        addition.validAddToCartTest();

         ApplyCouponTest apply = new ApplyCouponTest();
         apply.validCouponApplyTest();

        AddToCartConfigurableProductTest configurableProduct = new AddToCartConfigurableProductTest();
        configurableProduct.validAddToCartTest();

        SearchTest searchTest = new SearchTest();
        searchTest.validSearchTest();

        SortByTest sortTest = new SortByTest();
        sortTest.validSortByTest();

        TotalPriceTest totalPrice = new TotalPriceTest();
        totalPrice.validTotalPriceTest();
    }
}