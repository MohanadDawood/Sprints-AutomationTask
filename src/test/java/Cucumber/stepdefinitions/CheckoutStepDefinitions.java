package Cucumber.stepdefinitions;

import Pages.CatalogSearchPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.PlaceOrderPage;
import Utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckoutStepDefinitions {

    WebDriver driver = DriverManager.getDriver();
    HomePage homePage = new HomePage(driver);
    CatalogSearchPage catalogSearchPage = new CatalogSearchPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @When("the user searches for a product {string}")
    public void the_user_searches_for_a_product(String searchItem) {
        homePage.itemSearch(searchItem);
        homePage.goToCatalogSearchPage();
    }

    @When("the user adds the product to the cart")
    public void the_user_adds_the_product_to_the_cart() {
        catalogSearchPage.addToCart("Adding...", "Added", "Add to Cart");
    }

    @When("the user fills in the shipping address with email {string}")
    public void the_user_fills_in_the_shipping_address_with_email(String email) {
        checkoutPage.fillShippingAddressForm(email, "Mohanad", "Dawood", "Sprints", "test", "test", "test", "321313131", "Texas", "United States");
    }

    @When("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        checkoutPage.goToPlaceOrderPage();
    }

    @Then("the user should be able to place an order successfully")
    public void the_user_should_be_able_to_place_an_order_successfully() {
        placeOrderPage.placeOrder();
        placeOrderPage.goToSuccessOrderPage();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
