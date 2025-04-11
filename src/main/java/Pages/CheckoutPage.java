package Pages;

import Abstract.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import Utilities.DropdownUtils;
public class CheckoutPage extends AbstractComponent {


    WebDriver driver;
    public CheckoutPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

        By emailInput = By.xpath("//div[@class='field required']//input[@type='email']");
        By firstNameInput = By.xpath("//div[contains(@name,'firstname')]/child::div/input");
        By lastNameInput = By.xpath("//div[contains(@name,'lastname')]/child::div/input");
        By companyInput = By.xpath("//div[contains(@name,'company')]/child::div/input");
        By cityInput = By.xpath("//div[contains(@name,'city')]/child::div/input");
        By stateDropdown = By.xpath("//div[contains(@name,'region')]//select");
        By postalCodeInput = By.xpath("//div[contains(@name,'postcode')]/child::div/input");
        By phoneNumberInput = By.xpath("//div[contains(@name,'telephone')]/child::div/input");
        By countryDropdown = By.xpath("//div[contains(@name,'region')]//select");
        By shippingMethodRadio = By.xpath("//tr[contains(@data-bind,'selectShippingMethod')][1]//input[@type='radio']");
        By nextButton = By.xpath("//button//*[.='Next']");


        public void fillShippingAddressForm(String email,String firstName,String lastName,String company,String address, String city, String postalcode, String phoneNumber, String state, String country){
            List<WebElement> streetAddresses =  driver.findElements(By.xpath("//div[contains(@name,'street')]/child::div/input"));
            driver.findElement(emailInput).sendKeys(email);
            driver.findElement(firstNameInput).sendKeys(firstName);
            driver.findElement(lastNameInput).sendKeys(lastName);
            driver.findElement(companyInput).sendKeys(company);
            streetAddresses.get(0).sendKeys(address);
            driver.findElement(cityInput).sendKeys(city);
            DropdownUtils.selectByVisibleText(driver,stateDropdown,state);
            driver.findElement(postalCodeInput).sendKeys(postalcode);
            //DropdownUtils.selectByVisibleText(driver,countryDropdown,country);
            driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
            driver.findElement(shippingMethodRadio).click();
        }

        public void goToPlaceOrderPage(){
            driver.findElement(nextButton).click();
        }
}
