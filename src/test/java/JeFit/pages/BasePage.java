package JeFit.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    protected void wainUntilElementWillBeHiddenOnPageByLocator(By locator, int timeOut) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void acceptConfirmationAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public abstract void openPage();

}
