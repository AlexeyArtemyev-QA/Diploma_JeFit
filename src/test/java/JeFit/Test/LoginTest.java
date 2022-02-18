package JeFit.Test;

import JeFit.Page.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.AllureUtils;

public class LoginTest extends JeFit.Test.BaseTest {

    private final static String URL_MY_JIFIT = "https://www.jefit.com/my-jefit/";
    private final static String USERNAME = "User_1QA";
    private final static String PASSWORD = "Test_pass0";
    private final static String ERROR_TEXT = "Invalid username/email or password";
    private final static String URL_LOGIN = "https://www.jefit.com/login/";
    private final static String USERNAME_DEFAULT = "Test_123";
    private final static String PASSWORD_DEFAULT = "Password_123";

    @BeforeTest(alwaysRun = true)
    public void navigateToLoginPage() {
        loginPage = new LoginPage(driver);
        driver.get(URL_LOGIN);
    }

    @Test(description = "[Positive] Login.", retryAnalyzer = JeFit.Test.Retry.class)
    public void validateLoginPositiveCaseTest() {
        loginPage.enterUserName(USERNAME);
        loginPage.enterPassword(PASSWORD);
        loginPage.checkBoxIsSelected();
        loginPage.selectLoginButton();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.atPage(), URL_MY_JIFIT, "ERROR:Positive test was failed");
    }

    @Step("Username {username}, password {password}")
    @Test(description = "[Negative] Login. Negative login tests by using annotation DataProvider", dataProvider = "Negative Login Tests")
    public void validateLoginNegativeCaseTest(String username, String password, String expectedErrorMessage1) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.checkBoxIsSelected();
        loginPage.selectLoginButton();

        // Скриншот
        AllureUtils.attachScreenshot(driver);
        String actualErrorMessageText = loginPage.getErrorMessageText();
        Assert.assertEquals(actualErrorMessageText, expectedErrorMessage1);
    }

    @DataProvider(name = "Negative Login Tests")
    public Object[][] getNegativeLoginData() {
        return new Object[][]{
                {"Пользователь1", "Пароль", ERROR_TEXT},
                {"User", "Password", ERROR_TEXT},
                {"U", "P", ERROR_TEXT},
                {"#@?!", "_*@#", ERROR_TEXT},
                {"123Iv", "12345A", ERROR_TEXT},
                {"drop table", "drop table", ERROR_TEXT},
                {"", "PASSWORD", ERROR_TEXT},
                {"USERNAME", "", ERROR_TEXT},
                {" U s e r ", "PASSWORD", ERROR_TEXT},
                {"User", " P A S S W O R D ", ERROR_TEXT},
                {USERNAME_DEFAULT, PASSWORD_DEFAULT, ERROR_TEXT},
                {"", PASSWORD_DEFAULT, ERROR_TEXT},
                {USERNAME_DEFAULT, "", ERROR_TEXT},
        };
    }
}
