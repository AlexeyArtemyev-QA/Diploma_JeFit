package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;

@Log4j2
public class ExercisesPage extends BasePage {

    public final static String URL_EXERCISES = "https://www.jefit.com/exercises/";
    public static final By EXERCISE_RESULT = By.id("hor-minimalist_3");

    // ExercisesPage
    // Лскаторы Picture
    public static final By TRICEPS_PICTURE_INPUT = By.xpath("//ul[@class='buttonTableLeft']//a[text()='Triceps']");
    public static final By CHEST_PICTURE_INPUT = By.xpath("//li[@id='exercisechest']//descendant::a");
    public static final By BACK_PICTURE_INPUT = By.xpath("//a[@class='exerciseblueButton' and text()='Back']");
    public static final By ABS_PICTURE_INPUT = By.xpath("//li[@id='exerciseabs']//descendant::a");
    public static final By LOWER_LEGS_PICTURE_INPUT = By.xpath("//li[@id='exerciselowerlegs']//descendant::a");

    public static final By PICTURE_RESULT = By.id("bodyparttext");

    public static final By RESULT_BODY_ONLY = By.xpath("//p[text()='Equipment : Body Only ']");
    public static final By RESULT_STRENGTH = By.xpath("//p[text()='Type : Strength ']");
    public static final By RESULT_STRETCHING = By.xpath("//p[text()='Type : Stretching ']");

    // Локаторы Exercise Search
    // Equipment
    public static final By ALL_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='All']");
    public static final By BODY_ONLY_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='BodyOnly']");
    public static final By MACHINE_CARDIO_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='MachineCardio']");
    public static final By WEIGHT_PLATE_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='WeightPlate']");

    //Type
    public static final By STRENGTH_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Strength']");
    public static final By STRETCHING_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Stretching']");
    public static final By POWERLIFTING_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Powerlifting']");
    public static final By OLYMPIC_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='OlympicWeightLifting']");

    // Difficulty
    public static final By BEGINNER_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Beginner']");
    public static final By INTERMEDIATE_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Intermediate']");
    public static final By EXPERT_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Expert']");

    // Кнопка поиска
    public static final By SEARCH_BUTTON_EXERCISE_SEARCH_INPUT = By.cssSelector("[class='statusblueButton']");

    // DataBase
    public static final By BICEPS_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Biceps']");
    public static final By BICEPS_DATABASE_RESULT = By.xpath("//strong[text()='Biceps Exercise Database']");
    public static final By GLUTES_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Glutes']");
    public static final By GLUTES_DATABASE_RESULT = By.xpath("//strong[text()='Glutes Exercise Database']");
    public static final By SHOULDERS_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Shoulders']");
    public static final By SHOULDERS_DATABASE_RESULT = By.xpath("//strong[text()='Shoulders Exercise Database']");

    public ExercisesPage(WebDriver driver) {
        super(driver);
    }


    public void clickSearchButton() {
        log.info("Search by name. click search button ");
        driver.findElement(SEARCH_BUTTON_EXERCISE_SEARCH_INPUT).click();
    }

    // Методы (Picture)
    public String getTextPictureTriceps() {
        log.info("Search by name. Picture - triceps");
        driver.findElement(TRICEPS_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextResult() {
        log.info("Get text result");
        return driver.findElement(EXERCISE_RESULT).getText();
    }

    public String getTextPictureChest() {
        log.info("Exercise By BodyPart. Picture - chest");
        driver.findElement(CHEST_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextPictureAbs() {
        log.info("Exercise By BodyPart. Picture - abs");
        driver.findElement(ABS_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextPictureBack() {
        log.info("Exercise By BodyPart. Picture - back");
        driver.findElement(BACK_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextPictureLowerLegs() {
        log.info("Exercise By BodyPart. Picture - lower legs");
        driver.findElement(LOWER_LEGS_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    // Методы (Search, Equipment)
    public WebElement getExerciseSearchInputFromAllPage() {
        log.info("Exercise Search. Equipment - All");
        return driver.findElement(ALL_EXERCISE_SEARCH_INPUT);
    }

    public WebElement getExerciseSearchInputFromBody() {
        log.info("Exercise Search. Equipment - Body Only");
        return driver.findElement(BODY_ONLY_EXERCISE_SEARCH_INPUT);
    }

    public WebElement getExerciseSearchMachineCardio() {
        log.info("Exercise Search. Equipment - Machine Cardio");
        return driver.findElement(MACHINE_CARDIO_EXERCISE_SEARCH_INPUT);
    }

    public WebElement findButtonExerciseWeightPlate() {
        log.info("Exercise Search. Equipment - Weight Plate");
        return driver.findElement(WEIGHT_PLATE_EXERCISE_SEARCH_INPUT);
    }

    // Методы (Search, Type)
    public void selectStrength() {
        log.info("Exercise Search. Type - Strength");
        driver.findElement(STRENGTH_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectStretching() {
        log.info("Exercise Search. Type - Stretching");
        driver.findElement(STRETCHING_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectPowerlifting() {
        log.info("Exercise Search. Type - Powerlifting");
        driver.findElement(POWERLIFTING_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectOlympic() {
        log.info("Exercise Search. Type - Olympic");
        driver.findElement(OLYMPIC_EXERCISE_SEARCH_INPUT).click();
    }

    // Методы (Search, Difficulty)
    public void selectBeginner() {
        log.info("Exercise Search. Difficulty - Beginner");
        driver.findElement(BEGINNER_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectIntermediate() {
        log.info("Exercise Search. Difficulty - Intermediate");
        driver.findElement(INTERMEDIATE_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectExpert() {
        log.info("Exercise Search. Difficulty - Expert");
        driver.findElement(EXPERT_EXERCISE_SEARCH_INPUT).click();
    }

    // Методы (Database)
    public String getTextDataBaseBiceps() {
        log.info("Exercise Database. Select biceps");
        driver.findElement(BICEPS_DATABASE_INPUT).click();
        return driver.findElement(BICEPS_DATABASE_RESULT).getText();
    }

    public String getTextDataBaseGlutes() {
        log.info("Exercise Database. Select glutes");
        driver.findElement(GLUTES_DATABASE_INPUT).click();
        return driver.findElement(GLUTES_DATABASE_RESULT).getText();
    }

    public String getTextDataBaseShoulders() {
        log.info("Exercise Database. Select shoulders");
        driver.findElement(SHOULDERS_DATABASE_INPUT).click();
        return driver.findElement(SHOULDERS_DATABASE_RESULT).getText();
    }

    public int getSizeArrayBodyOnly() {
        log.info("Considers numbers of elements");
        return driver.findElements(RESULT_BODY_ONLY).size();
    }

    public int getSizeArrayStrength() {
        log.info("Considers numbers of elements");
        return driver.findElements(RESULT_STRENGTH).size();
    }

    public int getSizeArrayStretching() {
        log.info("Considers numbers of elements");
        return driver.findElements(RESULT_STRETCHING).size();
    }

    public void scrollPageToBottom() {
        log.info("Scroll page");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void scrollPageTo(int x, int y) {
        log.info("Scroll page");
        ((JavascriptExecutor) driver).executeScript(String.format("scroll(%,%)", x, y));
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
