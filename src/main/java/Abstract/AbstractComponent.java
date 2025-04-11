package Abstract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponent {

    WebDriver driver;


    public AbstractComponent(WebDriver driver){
        this.driver = driver;
    }

    public void waitVisibilityOfElementLocated(By byLocator,int timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
           }

    public void waitTextToBePresentInElement(WebElement locator, String text ,int timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(locator,text));
    }

    public void waitInvisibilityOfElementLocated(By locator,int timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitElementToBeClickable(WebElement locator ,int timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}
