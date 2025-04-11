package Utilities;

import Abstract.AbstractComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtils extends AbstractComponent {

    static WebDriver driver;

    public JavaScriptUtils(WebDriver driver){
        super(driver);
        JavaScriptUtils.driver = driver;
    }

    public static void scrollBy(WebDriver driver,int x, int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }

    public static void scrollTo(WebDriver driver,int x, int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }
}
