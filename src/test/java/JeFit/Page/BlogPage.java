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

    private final By ARRAY_LOCATOR = By.cssSelector("span[class='raven-post-meta-item raven-post-categories']");
    private final By EXERCISE_TIPS_INPUT = By.cssSelector("[data-category='638']");
    private final By ALL_INPUT = By.xpath("//a[text()='All']");
    private final By GENERAL_FITNESS_INPUT = By.cssSelector("[data-category='1244']");
    private final By NUTRITION_TIPS_INPUT = By.cssSelector("[data-category='674']");
    private final By PRODUCT_TIPS_AND_FAQ_INPUT = By.cssSelector("[data-category='1270']");
    private final By WHAT_S_NEW_INPUT = By.cssSelector("[data-category='4']");
    private final By WORKOUT_TIPS_INPUT = By.cssSelector("[data-category='673']");


    private void selectBlogNews() {
        log.info("click on All");
        driver.findElement(ALL_INPUT).click();
    }

    private int getTopicSize() {
        log.info("Considers numbers of elements");
        return driver.findElements(ARRAY_LOCATOR).size();
    }

    private void selectExerciseTips() {
        log.info("click on exercise tips");
        driver.findElement(EXERCISE_TIPS_INPUT).click();
    }

    private void selectGeneralFitnessTips() {
        log.info("click on general fitness");
        driver.findElement(GENERAL_FITNESS_INPUT).click();
    }

    private void selectNutritionTips() {
        log.info("click on nutrition tips");
        driver.findElement(NUTRITION_TIPS_INPUT).click();
    }

    private void selectProductTipsAndFAQ() {
        log.info("click on product tips and FAQ");
        driver.findElement(PRODUCT_TIPS_AND_FAQ_INPUT).click();
    }

    private void selectWhatsNew() {
        log.info("click on what`s new");
        driver.findElement(WHAT_S_NEW_INPUT).click();
    }

    private void selectWorkoutTips() {
        log.info("click on workout tips");
        driver.findElement(WORKOUT_TIPS_INPUT).click();
    }

    public int getBlogNewsLength() {
        selectBlogNews();
        return getTopicSize();
    }

    public int getExerciseTipsLength() {
        selectExerciseTips();
        return getTopicSize();
    }

    public int getGeneralFitnessTipsLength() {
        selectGeneralFitnessTips();
        return getTopicSize();
    }

    public int getNutritionTipsLength() {
        selectNutritionTips();
        return getTopicSize();
    }

    public int getProductTipsAndFAQLength() {
        selectProductTipsAndFAQ();
        return getTopicSize();
    }

    public int getWhatsNewLength() {
        selectWhatsNew();
        return getTopicSize();
    }

    public int getWorkoutTipsLength() {
        selectWorkoutTips();
        return getTopicSize();
    }

}
