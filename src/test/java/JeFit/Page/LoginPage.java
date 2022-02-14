package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    public static final By PASSWORD_INPUT = By.id("navbar_password");
    public static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    public static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");
    public static final By ERROR_MESSAGE = By.id("invalidpassworderrormessage");

    public final static String URL_MY_JIFIT = "https://www.jefit.com/my-jefit/";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Методы
   public void enterUserName(String userName) {
        log.info("Enter the User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    public void enterPassword(String password) {
        log.info("Enter the password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

   public void selectCheckBox() {
        log.info("Click check box Remember me");
        driver.findElement(CHECKBOX_INPUT).click();
    }

   public void selectLogin() {
        log.info("Click login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessageText() {
        log.info("Get error massage");
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public boolean checkBoxIsSelected() {
        log.info("Check-box Remember me selected");
        return driver.findElement(CHECKBOX_INPUT).isSelected();
    }

    // Проверка что мы на нужной странице
    public String atPage() {
        return driver.getCurrentUrl();
    }

}
