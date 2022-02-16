package JeFit.Page;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private static final By ARRAY_LOCATOR = By.cssSelector("span[class='raven-post-meta-item raven-post-categories']");

    @FindBy(xpath = "//a[text()='All']")
    public WebElement ALL_INPUT;
    @FindBy(css = "[data-category='638']")
    private WebElement EXERCISE_TIPS_INPUT;
    @FindBy(css = "[data-category='1244']")
    private WebElement GENERAL_FITNESS_INPUT;
    @FindBy(css = "[data-category='674']")
    private WebElement NUTRITION_TIPS_INPUT;
    @FindBy(how = How.CSS, using = "[data-category='1270']")
    private WebElement PRODUCT_TIPS_AND_FAQ_INPUT;
    @FindBy(how = How.CSS, using = "[data-category='4']")
    private WebElement WHAT_S_NEW_INPUT;
    @FindBy(how = How.CSS, using = "[data-category='673']")
    private WebElement WORKOUT_TIPS_INPUT;
    @FindBy(how = How.CSS, using = "[type='search']")
    private WebElement SEARCH_TOPICS_INPUT;


    public void selectAll() {
        log.info("click on All");
        ALL_INPUT.click();
    }

    public void selectExerciseTips() {
        log.info("click on exercise tips");
        EXERCISE_TIPS_INPUT.click();
    }

    public void selectGeneralFitness() {
        log.info("click on general fitness");
        GENERAL_FITNESS_INPUT.click();
    }

    public void selectNutritionTips() {
        log.info("click on nutrition tips");
        NUTRITION_TIPS_INPUT.click();
    }

    public void selectProductTipsAndFAQ() {
        log.info("click on product tips and FAQ");
        PRODUCT_TIPS_AND_FAQ_INPUT.click();
    }

    public void selectWhatsNew() {
        log.info("click on what`s new");
        WHAT_S_NEW_INPUT.click();
    }

    public void selectWorkoutTips() {
        log.info("click on workout tips");
        WORKOUT_TIPS_INPUT.click();
    }

    public int getTopicSize() {
        log.info("Considers numbers of elements");
        return  driver.findElements(ARRAY_LOCATOR).size();
    }

}
