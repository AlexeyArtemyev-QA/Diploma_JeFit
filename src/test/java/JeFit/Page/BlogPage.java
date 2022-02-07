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


    public final static int RESULT = 9;
    public static final By ARRAY_LOCATOR = By.cssSelector("span[class='raven-post-meta-item raven-post-categories']");

    @FindBy(xpath = "//a[text()='All']")
    public static WebElement ALL_INPUT;
    @FindBy(css = "[data-category='638']")
    private static WebElement EXERCISE_TIPS_INPUT;
    @FindBy(css = "[data-category='1244']")
    private static WebElement GENERAL_FITNESS_INPUT;
    @FindBy(css = "[data-category='674']")
    private static WebElement NUTRITION_TIPS_INPUT;
    @FindBy(how = How.CSS, using = "[data-category='1270']")
    private static WebElement PRODUCT_TIPS_AND_FAQ_INPUT;
    @FindBy(how = How.CSS, using = "[data-category='4']")
    private static WebElement WHAT_S_NEW_INPUT;
    @FindBy(how = How.CSS, using = "[data-category='673']")
    private static WebElement WORKOUT_TIPS_INPUT;
    @FindBy(how = How.CSS, using = "[type='search']")
    private static WebElement SEARCH_TOPICS_INPUT;


    public void selectAll() {
        log.info("click on All");
        ALL_INPUT.click();
    }

    public void selectExerciseTips() {
        log.info("click on exercise tips");
        EXERCISE_TIPS_INPUT.click();

    }

    public static void selectGeneralFitness() {
        log.info("click on general fitness");
        GENERAL_FITNESS_INPUT.click();
    }

    public static void selectNutritionTips() {
        log.info("click on nutrition tips");
        NUTRITION_TIPS_INPUT.click();
    }

    public static void selectProductTipsAndFAQ() {
        log.info("click on product tips and FAQ");
        PRODUCT_TIPS_AND_FAQ_INPUT.click();
    }

    public static void selectWhatsNew() {
        log.info("click on what`s new");
        WHAT_S_NEW_INPUT.click();
    }

    public static void selectWorkoutTips() {
        log.info("click on workout tips");
        WORKOUT_TIPS_INPUT.click();
    }

    public static void seachByText() {
        log.info("Search by text");
        SEARCH_TOPICS_INPUT.click();
    }

    public static int resultArray() {
        log.info("Considers numbers of elements");
        int a = driver.findElements(ARRAY_LOCATOR).size();
        return a;
    }

}
