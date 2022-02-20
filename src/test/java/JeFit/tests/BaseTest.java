package JeFit.tests;

import JeFit.pages.ExercisesPage;
import JeFit.pages.LoginPage;
import JeFit.pages.ProfilePage;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.openqa.selenium.Dimension;

import java.awt.*;
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
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int width = (int) toolkit.getScreenSize().getWidth();
        int height = (int) toolkit.getScreenSize().getHeight();
        driver.manage().window().setSize(new Dimension(width, height));
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



