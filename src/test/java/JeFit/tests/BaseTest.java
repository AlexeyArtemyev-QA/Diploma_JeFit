package JeFit.tests;

import JeFit.pages.ExercisesPage;
import JeFit.pages.LoginPage;
import JeFit.pages.ProfilePage;
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
    protected final String USERNAME = "User_1QA";
    protected final String PASSWORD = "Test_pass0";

    @Parameters({"browser"})
    @BeforeClass(alwaysRun = true)
    @Description("Open browser")
    public void setUp(ITestContext testContext, @Optional("chrome") String browser) {
        driver = DriverFactory.getDriver(browser);
        driver.get("https://www.jefit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);
    }

    @AfterClass(alwaysRun = true)
    @Description("Close browser")
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}



