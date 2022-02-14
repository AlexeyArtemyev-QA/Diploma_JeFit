package JeFit.Test;

import JeFit.Page.LoginPage;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.AllureUtils;

import static JeFit.Page.LoginPage.URL_MY_JIFIT;

public class LoginTest extends JeFit.Test.BaseTest {

    public final static String USERNAME = "User_1QA";
    public final static String PASSWORD = "Test_pass0";
    public final static String ERROR_TEXT = "Invalid username/email or password";
    public final static String URL_LOGIN = "https://www.jefit.com/login/";
    public final static String USERNAME_DEFAULT = "Test_123";
    public final static String PASSWORD_DEFAULT = "Password_123";

    @BeforeTest(alwaysRun = true)
    public void navigateToLoginPage() {
        loginPage = new LoginPage(driver);
        driver.get(URL_LOGIN);
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Negative] Login. Unregistered user.")
    public void validateLoginNegativeUnregisteredUserTest() {
        loginPage.enterUserName(USERNAME_DEFAULT);
        loginPage.enterPassword(PASSWORD_DEFAULT);
        loginPage.selectCheckBox();
        loginPage.selectLogin();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getErrorMessageText(), ERROR_TEXT,
                "ERROR:Unregistered user successfully logged in");
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Negative] Login. The field User name is empty")
    public void validateLoginNegativeEmptyUserNameTest() {
        loginPage.enterUserName("");
        loginPage.enterPassword(PASSWORD_DEFAULT);
        loginPage.selectCheckBox();
        loginPage.selectLogin();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getErrorMessageText(), ERROR_TEXT,
                "ERROR:User without UserName successfully logged in");
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Negative] Login. The field Password is empty", retryAnalyzer = JeFit.Test.Retry2.class)
    public void validateLoginNegativeEmptyPasswordTest() {
        loginPage.enterUserName(USERNAME_DEFAULT);
        loginPage.enterPassword("");
        loginPage.selectCheckBox();
        loginPage.selectLogin();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.getErrorMessageText(), ERROR_TEXT,
                "ERROR:User without password successfully logged in");
    }

    @Link("https://www.jefit.com/login/")
    @Test(alwaysRun = true, description = "[Positive] Login.", retryAnalyzer = JeFit.Test.Retry.class)
    public void validateLoginPositiveCaseTest() {
        loginPage.enterUserName(USERNAME);
        loginPage.enterPassword(PASSWORD);
        loginPage.checkBoxIsSelected();
        loginPage.selectLogin();
        AllureUtils.attachScreenshot(driver);
        Assert.assertEquals(loginPage.atPage(), URL_MY_JIFIT, "ERROR:Positive test was failed");
    }

    @Link("https://www.jefit.com/login/")
    @Step("Username {username}, password {password}")
    @Test(alwaysRun = true, description = "[Negative] Login. Negative login tests by using annotation DataProvider", dataProvider = "Negative Login Tests")
    public void validateLoginNegativeCaseTest(String username, String password, String expectedErrorMessage1) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.checkBoxIsSelected();
        loginPage.selectLogin();

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
        };
    }
}
