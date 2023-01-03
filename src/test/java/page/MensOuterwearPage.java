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

public class MensOuterwearPage extends AbstractPage {
    private Actions actions;

    static final By openOuterwearFirstItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[1]");
    static final By openOuterwearSecondItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[2]");
    static final By openOuterwearThirdItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[3]");

    static final By colorMenuButtonLocator = By.xpath("//div[@class='facets__wrapper']/details[1]/summary");
    static final By whiteColorElementLocator = By.xpath("//ul[@class=' facets__list list-unstyled no-js-hidden sd']/li[1]");

    static final By sizeMenuButtonLocator = By.xpath("//div[@class='facets__wrapper']/details[2]/summary");
    static final By twoXLSizeElementLocator = By.xpath("//details[@id='Details-2-template--14452193853495__product-grid']/div/fieldset/ul[1]/li[7]");

    static final By productTypeMenuButtonLocator = By.xpath("//div[@class='facets__wrapper']/details[3]/summary");
    static final By outerwearProductTypeLocator = By.xpath("//details[@id='Details-3-template--14452193853495__product-grid']/div/fieldset/ul[1]/li[1]/label");

    static final By sortByDropdownMenuLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']");
    static final By priceLowToHeghElementLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']/option[@value='price-ascending']");
    static final By bestSellingElementLocator = By.xpath("//select[@class='facet-filters__sort select__select caption-large facet-filters__select']/option[@value='best-selling']");

    public MensOuterwearPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        actions = new Actions(driver);
    }

    public ItemPage openOuterwearFirstItem() {
        WebElement openOuterwearItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openOuterwearFirstItemButtonLocator));
        openOuterwearItemButton.click();
        logger.info("Open outerwear item");
        return new ItemPage(driver);
    }

    public ItemPage openOuterwearSecondItem() {
        WebElement openOuterwearItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openOuterwearSecondItemButtonLocator));
        openOuterwearItemButton.click();
        logger.info("Open outerwear item");
        return new ItemPage(driver);
    }

    public ItemPage openOuterwearThirdItem() {
        WebElement openOuterwearItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openOuterwearThirdItemButtonLocator));
        openOuterwearItemButton.click();
        logger.info("Open outerwear item");
        return new ItemPage(driver);
    }


    public MensOuterwearPage clickToColorFilter() {
        WebElement colorMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(colorMenuButtonLocator));
        colorMenuButton.click();
        logger.info("Open color filter");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage selectWhiteColor() {
        WebElement whiteColorElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(whiteColorElementLocator));
        whiteColorElement.click();
        CustomDelay(5);
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select white color");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage clickToSizeFilter() {
        WebElement sizeMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sizeMenuButtonLocator));
        sizeMenuButton.click();
        logger.info("Open size filter");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage selectTwoXLSize() {
        WebElement twoXLSizeElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(twoXLSizeElementLocator));
        twoXLSizeElement.click();
        CustomDelay(5);
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select 2XL size");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage clickToProductTypeFilter() {
        WebElement productTypeMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(productTypeMenuButtonLocator));
        productTypeMenuButton.click();
        logger.info("Open product type filter");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage selectOuterwearProductType() {
        WebElement outerwearProductType = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(outerwearProductTypeLocator));
        outerwearProductType.click();
        CustomDelay(5);
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select outerwear product type");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage clickToSortByDropdownMenu() {
        WebElement sortByDropdownMenu = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortByDropdownMenuLocator));
        sortByDropdownMenu.click();
        logger.info("Open sort dropdown menu");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage selectPriceLowToHighElement() {
        WebElement priceLowToHeghElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(priceLowToHeghElementLocator));
        priceLowToHeghElement.click();
        CustomDelay(5);
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select price, low to high element in dropdown menu");
        return new MensOuterwearPage(driver);
    }

    public MensOuterwearPage selectBestSellingElement() {
        WebElement bestSellingElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(bestSellingElementLocator));
        bestSellingElement.click();
        CustomDelay(5);
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();
        logger.info("Select best selling element in dropdown menu");
        return new MensOuterwearPage(driver);
    }
}
