package JeFit.Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    public final static String URL_MY_JIFIT = "https://www.jefit.com/my-jefit/";
    public final static String URL_LOGIN = "https://www.jefit.com/login/";
    public final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";
    public final static String URL_EXERCISES = "https://www.jefit.com/exercises/";
    public final static String URL_BLOG = "https://www.jefit.com/blog";

    static WebDriver driver;

     protected static final Logger log = LogManager.getLogger(BasePage.class.getName());

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }


}
