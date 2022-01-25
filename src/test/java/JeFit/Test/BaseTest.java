package JeFit.Test;

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


    @Parameters({"browser"})
    @BeforeTest(alwaysRun = true)
    @Description("Open browser")
    public void setUp(ITestContext testContext, @Optional("chrome") String browser) {
        driver = DriverFactory.getDriver(browser);

        // Вариант 2
// DriverFactory
//        if (browser.equalsIgnoreCase("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("yandex")) {
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//        }

        // Вариант 3 (Стандартный)
        // WebDriverManager.chromedriver().setup();
        // driver = new ChromeDriver();

        driver.get("https://www.jefit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest(alwaysRun = true)
    @Description("Close browser")
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}



