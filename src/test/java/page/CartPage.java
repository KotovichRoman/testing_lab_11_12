package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends AbstractPage {
    private Actions actions;

    static final By removeItemInCartLocator = By.xpath("//a[@href='https://www.alphaindustries.com/cart/change?line=1&quantity=0']");

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        actions = new Actions(driver);
    }

    public CartPage deleteItemInCart() {
        driver.get("https://www.alphaindustries.com/cart/change?line=1&quantity=0");
        logger.info("Delete item in cart");
        return this;
    }
    
}
