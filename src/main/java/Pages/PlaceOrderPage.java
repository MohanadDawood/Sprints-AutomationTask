package Pages;

import Abstract.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends AbstractComponent {

    WebDriver driver;
    public PlaceOrderPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

        By placeOrderBtnLocator = By.xpath("//div[@class='actions-toolbar']//*[contains(@class,'checkout')]");
        By loadingSpinner = By.cssSelector(".loading-mask");



        public void placeOrder(){
        waitVisibilityOfElementLocated(placeOrderBtnLocator,5);
        waitElementToBeClickable(driver.findElement(placeOrderBtnLocator),5);
        waitInvisibilityOfElementLocated(loadingSpinner,5);
        }

        public void goToSuccessOrderPage(){
            driver.findElement(placeOrderBtnLocator).click();
        }

}
