package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends AbstractPage {

    static final By searchInputLocator = By.xpath("//input[@class='mc_search_field']");
    
    public SearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public SearchResultPage openSearchResultPage(String text) {
        WebElement searchInput = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(searchInputLocator));
        searchInput.sendKeys(text);
        searchInput.sendKeys(Keys.ENTER);
        logger.info("Search query set");
        return new SearchResultPage(driver);
    }
}
