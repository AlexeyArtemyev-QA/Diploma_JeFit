package JeFit.Test;

import JeFit.Page.LoginPage;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.AllureUtils;
import static JeFit.Page.LoginPage.*;

public class LoginTest extends JeFit.Test.BaseTest {

    // LoginPage
    public static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    public static final By PASSWORD_INPUT = By.id("navbar_password");
    public static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    public static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");
    public static final By ERROR_MESSAGE = By.id("invalidpassworderrormessage");
    public final static String USERNAME = "User_1QA";
    public final static String PASSWORD = "Test_pass0";
    public final static String ERROR_TEXT = "Invalid username/email or password";
    public final static String URL_LOGIN = "https://www.jefit.com/login/";

    // Log out
    public static final By MY_JEFIT_BUTTON = By.cssSelector("#my-jefit-app-menu > a");
    public static final By SIGNOUT_BUTTON = By.xpath("//a[text()='Sign out']");

    @BeforeTest(alwaysRun = true)
    public void navigateToLoginPage() {
        loginPage = new LoginPage(driver);
        driver.get(URL_LOGIN);
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Negative] Login. Unregistered user.", invocationCount = 1, threadPoolSize = 1)
    public void loginNegativeUnregisteredUserTest() {
        loginPage.enterUserName("Test_123");
        loginPage.enterPassword("Password_123");
        loginPage.checkBoxClick();
        loginPage.loginButton();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getErrorMessageText(), ERROR_TEXT,
                "ERROR:Unregistered user successfully logged in");
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Negative] Login. The field User name is empty", invocationCount = 1, threadPoolSize = 1)
    public void loginNegativeEmptyUserNameTest() {
        loginPage.enterUserName("");
        loginPage.enterPassword("Password_123");
        loginPage.checkBoxClick();
        loginPage.loginButton();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getErrorMessageText(), ERROR_TEXT,
                "ERROR:User without UserName successfully logged in");
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Negative] Login. The field Password is empty", retryAnalyzer = JeFit.Test.Retry2.class, invocationCount = 1, threadPoolSize = 1)
    public void loginNegativeEmptyPasswordTest() {
        loginPage.enterUserName("Test_123");
        loginPage.enterPassword("");
        loginPage.checkBoxClick();
        loginPage.loginButton();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getErrorMessageText(), ERROR_TEXT,
                "ERROR:User without password successfully logged in");
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Positive] Login.", retryAnalyzer = JeFit.Test.Retry.class, invocationCount = 1, threadPoolSize = 1)
    public void loginPositiveTest() {
        loginPage.enterUserName(USERNAME);
        loginPage.enterPassword(PASSWORD);
        loginPage.checkBoxIsSelected();
        loginPage.loginButton();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.atPage(), URL_MY_JIFIT, "ERROR:Positive test was failed");
    }

    @Link("https://www.jefit.com/login/")
    @Step("Username {username}, password {password}")
    @Test(alwaysRun = true, description = "[Negative] Login. Negative login tests by using annotation DataProvider", dataProvider = "Negative Login Test", invocationCount = 1, threadPoolSize = 1)
    public void loginNegativeTests(String username, String password, String expectedErrorMessage1) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.checkBoxIsSelected();
        loginPage.loginButton();

        // Скриншот
        AllureUtils.attachScreenshot(driver);
        String actualErrorMessageText = loginPage.getErrorMessageText();
        Assert.assertEquals(actualErrorMessageText, expectedErrorMessage1);

    }

    @DataProvider(name = "Negative Login Test")
    public Object[][] getNegativeLogin() {
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
        };
    }
}
