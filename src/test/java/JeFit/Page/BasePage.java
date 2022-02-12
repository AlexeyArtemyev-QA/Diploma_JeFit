package JeFit.Page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    static WebDriver driver;

     protected static final Logger log = LogManager.getLogger(BasePage.class.getName());

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }


}
