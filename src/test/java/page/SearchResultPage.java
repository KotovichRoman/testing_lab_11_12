package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage extends AbstractPage {
    Actions actions;

    static final By filterButtonLocator = By.xpath("//div[@class='ais-filter-select']");

    static final By selectBlackColorButtonLocator = By.xpath("//ul[@class='ais-RefinementList-list']/li[1]");

    static final By selectXLSizeButtonLocator = By.xpath("//div[@class='ais-facet-options.size-container']/div/div/div/div/ul[@class='ais-RefinementList-list']/li[4]");

    static final By orderByButtonLocator = By.xpath("//select[@class='ais-SortBy-select']");
    static final By orderByMostPopularElementLocator = By.xpath("//option[@class='ais-SortBy-option' and @value='shopify_products_recently_ordered_count_desc']");
    
    public SearchResultPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
        actions = new Actions(driver);
    }

    public SearchResultPage filtersButtonClick() {
        WebElement filterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(filterButtonLocator));
        filterButton.click();
        logger.info("Open filters");
        return this;
    }

    public SearchResultPage selectBlackColor() {
        WebElement selectBlackColorButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(selectBlackColorButtonLocator));
        selectBlackColorButton.click();
        logger.info("Select black color");
        return this;        
    }

    public SearchResultPage selectXLSize() {
        WebElement selectXLSizeButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(selectXLSizeButtonLocator));
        selectXLSizeButton.click();
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select XL size");
        return this;        
    }

    public SearchResultPage openOrderByDropdownMenu() {
        WebElement orderByButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(orderByButtonLocator));
        orderByButton.click();
        logger.info("Open order by dropdown menu");
        return this;
    }

    public SearchResultPage selectOrderByMostPopular() {
        WebElement orderByMostPopularElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(orderByMostPopularElementLocator));
        orderByMostPopularElement.click();
        logger.info("Select order by most popular");
        return this;
    }
}
