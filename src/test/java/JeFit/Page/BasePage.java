package JeFit.Page;

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
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollToElement(true);", element);
    }

    protected void scrollPageToBottom() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    protected void scrollPageToCoordinates(int x, int y) {
        ((JavascriptExecutor) driver).executeScript(String.format("scroll(%,%)", x, y));
    }

    protected void wainUntil (WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
