package JeFit.Test;

import JeFit.Page.ExercisesPage;
import JeFit.Page.LoginPage;
import JeFit.Page.ProfilePage;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
@Log4j2
public abstract class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;
    protected ExercisesPage exercisesPage;

    @Parameters({"browser"})
    @BeforeTest(alwaysRun = true)
    @Description("Open browser")
    public void setUp(ITestContext testContext, @Optional("chrome") String browser) {
        driver = DriverFactory.getDriver(browser);
        driver.get("https://www.jefit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);
    }

    @AfterTest(alwaysRun = true)
    @Description("Close browser")
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}



