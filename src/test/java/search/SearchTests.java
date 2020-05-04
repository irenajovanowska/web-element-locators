package search;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class SearchTests extends BaseTests {

    @Test
    public void testSearchResultsContainSearchPhrase() {
        String searchPhrase = "selenium";
        var resultPage = homePage.search(searchPhrase);

        List<String> linkTexts = resultPage.getResultLinksText();
        resultPage.printResultLinksText();

        for (String text : linkTexts) {
            assertTrue(text.matches("(?i).*selenium.*"));
        }
    }
}
