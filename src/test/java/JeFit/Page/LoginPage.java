package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

import static JeFit.Test.LoginTest.*;


@Log4j2
public class LoginPage extends BasePage {

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

   public void checkBoxClick() {
        log.info("Click check box Remember me");
        driver.findElement(CHECKBOX_INPUT).click();
    }

   public void loginButton() {
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
