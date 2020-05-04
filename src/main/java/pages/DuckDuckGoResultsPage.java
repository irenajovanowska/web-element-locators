package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class DuckDuckGoResultsPage {

    private WebDriver driver;
    private By resultLinksTitle = By.cssSelector("div.results_links_deep a.result__a");

    public DuckDuckGoResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getResultLinksText() {
        List<WebElement> resultLinks = driver.findElements(resultLinksTitle);
        return resultLinks.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void printResultLinksText() {
        List<String> linkTexts = getResultLinksText();
        for (String text : linkTexts) {
            System.out.println("Result link " + (linkTexts.indexOf(text) + 1) + " title: " + text);
        }
    }
}
