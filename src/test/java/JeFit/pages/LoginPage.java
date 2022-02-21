package JeFit.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class LoginPage extends BasePage {

    private final String LOGIN_PAGE_URL = "https://www.jefit.com/login/";
    private final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    private final By PASSWORD_INPUT = By.id("navbar_password");
    private final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");
    private final By ERROR_MESSAGE = By.id("invalidpassworderrormessage");
    private final By BUTTON_SIGN_OUT = By.xpath("//a[text()='Sign out']");
    private final By APP_MENU = By.cssSelector("#my-jefit-app-menu");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    // Методы
    public void login(String userName, String password) {
        openPage();
        enterUserName(userName);
        enterPassword(password);
        selectLoginButton();
    }

    private void enterUserName(String userName) {
        log.info("Enter User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    private void enterPassword(String password) {
        log.info("Enter password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    private void selectLoginButton() {
        log.info("Click login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessageText() {
        log.info("Get error massage");
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public void logOut() {
        moveToElementMenu();
        waitAppMenu();
        waitSignOutButton();
        clickButtonSignOut();
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public void moveToElementMenu() {
        log.info("Move to Menu");
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(APP_MENU);
        actions.moveToElement(menuOption).perform();
    }

    public void clickButtonSignOut() {
        log.info("Click on login button");
        driver.findElement(BUTTON_SIGN_OUT).click();
    }

    public void waitAppMenu() {
        log.info("Wait app menu");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(APP_MENU));
    }

    public void waitSignOutButton() {
        log.info("Wait sign out buttom");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_SIGN_OUT));
    }
}
