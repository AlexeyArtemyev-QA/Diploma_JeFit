package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private static final By ARRAY_LOCATOR = By.cssSelector("span[class='raven-post-meta-item raven-post-categories']");

    private static final By EXERCISE_TIPS_INPUT = By.cssSelector("[data-category='638']");
    private static final By ALL_INPUT = By.xpath("//a[text()='All']");
    private static final By GENERAL_FITNESS_INPUT = By.cssSelector("[data-category='1244']");
    private static final By NUTRITION_TIPS_INPUT = By.cssSelector("[data-category='674']");
    private static final By PRODUCT_TIPS_AND_FAQ_INPUT = By.cssSelector("[data-category='1270']");
    private static final By WHAT_S_NEW_INPUT = By.cssSelector("[data-category='4']");
    private static final By WORKOUT_TIPS_INPUT = By.cssSelector("[data-category='673']");


    public void selectAll() {
        log.info("click on All");
        driver.findElement(ALL_INPUT).click();
    }

    public void selectExerciseTips() {
        log.info("click on exercise tips");
        driver.findElement(EXERCISE_TIPS_INPUT).click();
    }

    public void selectGeneralFitness() {
        log.info("click on general fitness");
        driver.findElement(GENERAL_FITNESS_INPUT).click();
    }

    public void selectNutritionTips() {
        log.info("click on nutrition tips");
        driver.findElement(NUTRITION_TIPS_INPUT).click();
    }

    public void selectProductTipsAndFAQ() {
        log.info("click on product tips and FAQ");
        driver.findElement(PRODUCT_TIPS_AND_FAQ_INPUT).click();
    }

    public void selectWhatsNew() {
        log.info("click on what`s new");
        driver.findElement(WHAT_S_NEW_INPUT).click();
    }

    public void selectWorkoutTips() {
        log.info("click on workout tips");
        driver.findElement(WORKOUT_TIPS_INPUT).click();
    }

    public int getTopicSize() {
        log.info("Considers numbers of elements");
        return driver.findElements(ARRAY_LOCATOR).size();
    }

}
