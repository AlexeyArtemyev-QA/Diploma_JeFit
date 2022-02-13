package JeFit.Page;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
