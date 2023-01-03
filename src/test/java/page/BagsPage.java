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

public class BagsPage extends AbstractPage {
    private Actions actions;

    static final By openBagsItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[1]");

    static final By colorMenuButtonLocator = By.xpath("//div[@class='facets__wrapper']/details[1]/summary");
    static final By blackColorElementLocator = By.xpath("//ul[@class=' facets__list list-unstyled no-js-hidden sd']/li[1]");

    static final By sortByDropdownMenuLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']");
    static final By bestSellingElementLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']/option[@value='best-selling']");
    
    public BagsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        actions = new Actions(driver);
    }

    public ItemPage openBagsItem() {
        WebElement openBagsItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openBagsItemButtonLocator));
        openBagsItemButton.click();
        logger.info("Open bag item");
        return new ItemPage(driver);
    }

    public BagsPage clickToColorFilter() {
        WebElement ColorMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(colorMenuButtonLocator));
        ColorMenuButton.click();
        logger.info("Open color filter");
        return new BagsPage(driver);
    }

    public BagsPage selectBlackColor() {
        WebElement blackColorElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(blackColorElementLocator));
        blackColorElement.click();
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select black color");
        return new BagsPage(driver);
    }

    public BagsPage clickToSortByDropdownMenu() {
        WebElement sortByDropdownMenu = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortByDropdownMenuLocator));
        sortByDropdownMenu.click();
        logger.info("Open sort dropdown menu");
        return new BagsPage(driver);
    }

    public BagsPage selectBestSellingElement() {
        WebElement bestSellingElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(bestSellingElementLocator));
        bestSellingElement.click();
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select best selling element in dropdown menu");
        return new BagsPage(driver);
    }
}
