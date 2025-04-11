package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtils{


    public static void selectByVisibleText(WebDriver driver, By locator, String text){
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }




}
