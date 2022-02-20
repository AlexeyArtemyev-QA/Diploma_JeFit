package JeFit.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public abstract class BasePage {

    static WebDriver driver;
    private Instant wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    protected void wainUntilElementWillBePresentOnPageByLocator(By locator, int timeOut) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

}
