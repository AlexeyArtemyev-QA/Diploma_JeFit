package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    private static final By PASSWORD_INPUT = By.id("navbar_password");
    private static final By COOKIE_CHECKBOX = By.id("cb_cookieuser_navbar");
    private static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");
    private static final By ERROR_MESSAGE = By.id("invalidpassworderrormessage");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Методы
    public void enterUserName(String userName) {
        log.info("Enter User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void selectLoginButton() {
        log.info("Click login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessageText() {
        log.info("Get error massage");
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public boolean isCookieCheckboxSelected() {
        log.info("Check-box Remember me selected");
        return driver.findElement(COOKIE_CHECKBOX).isSelected();
    }

    // Проверка что мы на нужной странице
    public String atPage() {
        return driver.getCurrentUrl();
    }

}
