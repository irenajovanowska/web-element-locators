package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DuckDuckGoHomePage {

    private WebDriver driver;
    private By searchInputForm = By.id("search_form_input_homepage");
    private By searchButton = By.id("search_button_homepage");

    public DuckDuckGoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DuckDuckGoResultsPage search(String text) {
        driver.findElement(searchInputForm).sendKeys(text);
        driver.findElement(searchButton).click();
        return new DuckDuckGoResultsPage(driver);
    }
}
