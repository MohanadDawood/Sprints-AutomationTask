package Pages;

import Abstract.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.JavaScriptUtils;
public class CatalogSearchPage extends AbstractComponent {

    WebDriver driver;

    public CatalogSearchPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    By productSize = By.xpath("//div[@option-label='XS']");
    By productColor = By.xpath("//div[@option-label='Gray']");
    By cartBtn = By.xpath("//a[contains(@class,'showcart')]");
    By checkoutBtn = By.xpath("//button[contains(@class,'checkout')]");


    public void addToCart(String Text1,String Text2,String Text3){
        JavaScriptUtils.scrollBy(driver,0,500);
        WebElement productCard = driver.findElement(By.xpath("//a[normalize-space()='Argus All-Weather Tank']//parent::strong//following-sibling::div[@class='swatch-opt-694']"));
        WebElement addToCartBtn = driver.findElement(By.cssSelector(".action.tocart.primary"));
        productCard.findElement(productSize).click();
        productCard.findElement(productColor).click();
        addToCartBtn.click();
        waitTextToBePresentInElement(addToCartBtn,Text1,5);
        waitTextToBePresentInElement(addToCartBtn,Text2,5);
        waitTextToBePresentInElement(addToCartBtn,Text3,5);
        JavaScriptUtils.scrollTo(driver,0,0);
        driver.findElement(cartBtn).click();
        driver.findElement(checkoutBtn).click();
    }

}
