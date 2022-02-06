package JeFit.Test;

import JeFit.Page.BlogPage;
import JeFit.Page.ExercisesPage;
import JeFit.Page.LoginPage;
import JeFit.Page.ProfilePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;
    protected ExercisesPage exercisesPage;
    protected BlogPage blogPage;

    @Parameters({"browser"})
    @BeforeTest(alwaysRun = true)
    @Description("Open browser")
    public void setUp(ITestContext testContext, @Optional("chrome") String browser) {
        driver = DriverFactory.getDriver(browser);
        driver.get("https://www.jefit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest(alwaysRun = true)
    @Description("Close browser")
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}



