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

public class SalePage extends AbstractPage {
    private Actions actions;

    static final By colorMenuButtonLocator = By.xpath("//div[@class='facets__wrapper']/details[1]/summary");
    static final By blackColorElementLocator = By.xpath("//ul[@class=' facets__list list-unstyled no-js-hidden sd']/li[1]");

    static final By sortByDropdownMenuLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']");
    static final By newestElementLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']/option[@value='created-descending']");
    
    public SalePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        actions = new Actions(driver);
    }

    public SalePage clickToColorFilter() {
        WebElement ColorMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(colorMenuButtonLocator));
        ColorMenuButton.click();
        logger.info("Open color filter");
        return new SalePage(driver);
    }

    public SalePage selectBlackColor() {
        WebElement blackColorElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(blackColorElementLocator));
        blackColorElement.click();
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select black color");
        return new SalePage(driver);
    }

    public SalePage clickToSortByDropdownMenu() {
        WebElement sortByDropdownMenu = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortByDropdownMenuLocator));
        sortByDropdownMenu.click();
        logger.info("Open sort dropdown menu");
        return new SalePage(driver);
    }

    public SalePage selectNewestElement() {
        WebElement newestElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(newestElementLocator));
        newestElement.click();
        CustomDelay(5);
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select newest element in dropdown menu");
        return new SalePage(driver);
    }
}
