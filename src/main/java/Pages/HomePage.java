package Pages;

import Abstract.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractComponent {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By searchInput = By.xpath("//input[@id='search']");
    By searchedItem = By.xpath("//ul/li[@id='qs-option-2']/span");

    public void itemSearch(String searchTerm) {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(searchInput).sendKeys(searchTerm);
    }

    public void goToCatalogSearchPage() {
        driver.findElement(searchedItem).click();
    }

}
