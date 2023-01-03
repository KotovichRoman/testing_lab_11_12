package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage extends AbstractPage {

    static final By addItemToCartButtonLocator = By.xpath("//button[@id='AddToCart-product-template']");

    static final By blackColorElementLocator = By.xpath("//div[@class='product-v2--color-swatches']/div[2]");
    static final By greenColorElementLocator = By.xpath("//div[@class='product-v2--color-swatches']/div[3]");

    static final By sSizeElementLocator = By.xpath("//div[@id='39915047223351']");
    static final By xSSizeElementLocator = By.xpath("//div[@id='39915047223351']");
    static final By twoXLSizeElementLocator = By.xpath("//div[@class='product-v2--size-swatches']/div[5]");

    static final By openQuantityDropdownMenuButtonLocator = By.xpath("//select[@id='Quantity-template--14452194410551__main']");
    static final By selectQuantityLocator = By.xpath("//select[@id='Quantity-template--14452194410551__main']/option[@value='2']");

    static final By homePageButtonLocator = By.xpath("//a[@href='https://www.alphaindustries.com']");
    static final By menPageButtonLocator = By.xpath("//a[@href='https://www.alphaindustries.com/collections/mens-shop-all']");

    static final By closeCartButtonLocator = By.xpath("//button[@class='close-floating_cart']");
    static final By cartPageButtonLocator = By.xpath("//a[@href='https://www.alphaindustries.com/cart']");
    

    public ItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public ItemPage addItemToCart() {
        WebElement addItemToCartButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(addItemToCartButtonLocator));
        addItemToCartButton.click();
        CustomDelay(5);
        logger.info("Add item to cart");
        return new ItemPage(driver);
    }

    public ItemPage selectBlackColor() {
        WebElement blackColorElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(blackColorElementLocator));
        blackColorElement.click();
        CustomDelay(5);
        logger.info("Select black color");
        return new ItemPage(driver);
    }

    public ItemPage selectGreenColor() {
        WebElement greenColorElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(greenColorElementLocator));
        greenColorElement.click();
        CustomDelay(5);
        logger.info("Select green color");
        return new ItemPage(driver);
    }
    
    public ItemPage selectSSize() {
        WebElement xSSizeElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(xSSizeElementLocator));
        xSSizeElement.click();
        CustomDelay(5);
        logger.info("Select XS size");
        return new ItemPage(driver);
    }

    public ItemPage selectXSSize() {
        WebElement xSSizeElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(xSSizeElementLocator));
        xSSizeElement.click();
        CustomDelay(5);
        logger.info("Select XS size");
        return new ItemPage(driver);
    }

    public ItemPage select2XLSize() {
        WebElement twoXLSizeElement = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(twoXLSizeElementLocator));
        twoXLSizeElement.click();
        CustomDelay(5);
        logger.info("Select 2XL size");
        return new ItemPage(driver);
    }

    public ItemPage openQuantityDropdownMenu() {
        WebElement openQuantityDropdownMenuButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openQuantityDropdownMenuButtonLocator));
        openQuantityDropdownMenuButton.click();
        logger.info("Open dropdown menu");
        return new ItemPage(driver);
    }

    public ItemPage selectQuantity() {
        WebElement selectQuantity = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(selectQuantityLocator));
        selectQuantity.click();
        logger.info("Select quantity");
        return new ItemPage(driver);
    }

    public HomePage openHomePage() {
        WebElement homePageButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(homePageButtonLocator));
        homePageButton.click();
        logger.info("Open home page");
        return new HomePage(driver);
    }

    public MenPage openMenPage() {
        WebElement menPageButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menPageButtonLocator));
        menPageButton.click();
        logger.info("Open men page");
        return new MenPage(driver);
    }

    public MensOuterwearPage openMensOuterwearPage() {
        WebElement menPageButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menPageButtonLocator));
        menPageButton.click();
        logger.info("Open mens outerwear page");
        return new MensOuterwearPage(driver);
    }

    public ItemPage closeCart() {
        WebElement closeCartButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(closeCartButtonLocator));
        closeCartButton.click();
        logger.info("Close cart");
        return new ItemPage(driver);
    }

    public CartPage openCartPage() {
        driver.get("https://www.alphaindustries.com/cart");
        logger.info("Open sale page");
        return new CartPage(driver);
    }
}
