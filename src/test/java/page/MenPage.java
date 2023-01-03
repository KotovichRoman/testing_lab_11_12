package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenPage extends AbstractPage {
    
    static final By openFirstMenItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[1]");
    static final By openSecondMenItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[2]");
    static final By openThirdMenItemButtonLocator = By.xpath("//ul[@id='product-grid']/li[3]");
    
    static final By selectOuterwearButtonLocator = By.xpath("//a[@href='https://www.alphaindustries.com/collections/mens-shop-all-outerwear']");


    public MenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public ItemPage openFirstMenItem() {
        WebElement openFirstMenItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openFirstMenItemButtonLocator));
        openFirstMenItemButton.click();
        logger.info("Open first men item");
        return new ItemPage(driver);
    }

    public ItemPage openSecondMenItem() {
        WebElement openSecondMenItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openSecondMenItemButtonLocator));
        openSecondMenItemButton.click();
        logger.info("Open second men item");
        return new ItemPage(driver);
    }

    public ItemPage openThirdMenItem() {
        WebElement openThirdMenItemButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(openThirdMenItemButtonLocator));
        openThirdMenItemButton.click();
        logger.info("Open third men item");
        return new ItemPage(driver);
    }

    public MensOuterwearPage openMensOuterwearPage() {
        WebElement selectOuterwearButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(selectOuterwearButtonLocator));
        selectOuterwearButton.click();
        CustomDelay(5);
        logger.info("Open men's outerwear");
        return new MensOuterwearPage(driver);
    }
}
