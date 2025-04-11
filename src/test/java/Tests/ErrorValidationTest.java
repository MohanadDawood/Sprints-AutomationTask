package Tests;

import Abstract.AbstractComponent;
import Pages.CatalogSearchPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.PlaceOrderPage;
import Utilities.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ErrorValidationTest {


    WebDriver driver;
    String searchItem = "arg";

    @BeforeMethod
    public void setup(){
        driver = DriverManager.getDriver();
    }

//    @Test
//    public void addToCartSuccessValidationMessage() {
//        HomePage homePage = new HomePage(driver);
//        CatalogSearchPage catalogSearchPage = new CatalogSearchPage(driver);
//        homePage.itemSearch(searchItem);
//        homePage.goToCatalogSearchPage();
//        catalogSearchPage.addToCart("Adding...", "Added", "Add to Cart");
//        String productName  = driver.findElement(By.xpath("//a[@title='Argus All-Weather Tank']")).getText();
//        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@data-bind,'html: $parent.prepareMessageForHtml(message.text)')]")).getText().trim(), "You added "+productName+" to your shopping cart.".trim());
//    }


    @Test
    public void successPurchaseMessageValidation() throws InterruptedException {
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
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//h1//span[@data-ui-id='page-title-wrapper']")).getText().trim(),"Thank you for your purchase!".trim());
    }

}