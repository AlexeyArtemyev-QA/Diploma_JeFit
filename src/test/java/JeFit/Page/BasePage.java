package JeFit.Page;

import org.openqa.selenium.*;

public abstract class BasePage {

    static WebDriver driver;

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

}
