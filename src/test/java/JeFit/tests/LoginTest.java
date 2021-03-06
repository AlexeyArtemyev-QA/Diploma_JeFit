package JeFit.tests;

import JeFit.pages.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.AllureUtils;

public class LoginTest extends BaseTest {

    private final static String MY_JEFIT_URL = "https://www.jefit.com/my-jefit/";
    private final static String ERROR_MESSAGE_TEXT = "Invalid username/email or password";
    private final static String USERNAME_DEFAULT = "Test_123";
    private final static String PASSWORD_DEFAULT = "Password_123";

    @BeforeClass(alwaysRun = true)
    public void initLoginPage() {
        loginPage = new LoginPage(driver);
    }

    @Test(groups = {"smoke","regression"}, description = "[Positive] Login.", retryAnalyzer = JeFit.tests.Retry.class)
    public void validateLoginPositiveCaseTest() {
        loginPage.login(USERNAME, PASSWORD);

        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getCurrentPageUrl(), MY_JEFIT_URL, "ERROR:Positive test was failed");
    }

    @Step("Username {username}, password {password}")
    @Test(groups = {"negative"}, description = "[Negative] Login. Negative login tests by using annotation DataProvider", dataProvider = "Negative Login Tests")
    public void validateLoginNegativeCaseTest(String username, String password, String expectedErrorMessageText) {
        loginPage.login(username, password);

        AllureUtils.attachScreenshot(driver);
        String actualErrorMessageText = loginPage.getErrorMessageText();
        Assert.assertEquals(actualErrorMessageText, expectedErrorMessageText);
    }

    @DataProvider(name = "Negative Login Tests")
    public Object[][] getNegativeLoginData() {
        return new Object[][]{
                {"Пользователь1", "Пароль", ERROR_MESSAGE_TEXT},
                {"User", "Password", ERROR_MESSAGE_TEXT},
                {"U", "P", ERROR_MESSAGE_TEXT},
                {"#@?!", "_*@#", ERROR_MESSAGE_TEXT},
                {"123Iv", "12345A", ERROR_MESSAGE_TEXT},
                {"drop table", "drop table", ERROR_MESSAGE_TEXT},
                {"", "PASSWORD", ERROR_MESSAGE_TEXT},
                {"USERNAME", "", ERROR_MESSAGE_TEXT},
                {" U s e r ", "PASSWORD", ERROR_MESSAGE_TEXT},
                {"User", " P A S S W O R D ", ERROR_MESSAGE_TEXT},
                {USERNAME_DEFAULT, PASSWORD_DEFAULT, ERROR_MESSAGE_TEXT},
                {"", PASSWORD_DEFAULT, ERROR_MESSAGE_TEXT},
                {USERNAME_DEFAULT, "", ERROR_MESSAGE_TEXT},
        };
    }
}
