package Tests;

import Pages.CatalogSearchPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.PlaceOrderPage;
import Utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest {



    WebDriver driver;
    String searchItem = "arg";


    @BeforeMethod
    public void setup(){
        driver = DriverManager.getDriver();
    }


    @Test
    public void test1 (){
    HomePage homePage = new HomePage(driver);
    CatalogSearchPage catalogSearchPage = new CatalogSearchPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);

    homePage.itemSearch(searchItem);
    homePage.goToCatalogSearchPage();
    catalogSearchPage.addToCart("Adding...","Added","Add to Cart");
    catalogSearchPage.goToCheckoutPage();
    checkoutPage.fillShippingAddressForm("mohaneddawood990@gmail.com","Mohanad","Dawood","Sprints","test","test","test","321313131","Texas","United States");
    checkoutPage.goToPlaceOrderPage();
    placeOrderPage.placeOrder();
    placeOrderPage.goToSuccessOrderPage();
    driver.close();
    }


}
