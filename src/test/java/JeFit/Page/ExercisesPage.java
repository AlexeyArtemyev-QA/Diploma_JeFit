package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


@Log4j2
public class ExercisesPage extends BasePage {

    // ExercisesPage
    // Лскаторы Picture
    public static final By TRICEPS_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=7&exercises=Triceps']");
    public static final By CHEST_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=3&exercises=Chest']");
    public static final By BACK_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=1&exercises=Back']");
    public static final By ABS_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=0&exercises=Abs']");
    public static final By LOWER_LEGS_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=9&exercises=Lower-Legs']");
    public static final By VIEW_ALL_EXERCISES_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=11&exercises=All']");

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

    // Поиск по имени
    public static final By SEARCH_EXERCISE_SEARCH_INPUT = By.id("searchText");

    // Кнопка поиска
    public static final By SEARCH_BUTTON_EXERCISE_SEARCH_INPUT = By.cssSelector("[class='statusblueButton']");

    // DataBase
    public static final By BICEPS_DATABASE_INPUT = By.cssSelector("[href='http://www.jefit.com/exercises/bodypart.php?id=2&exercises=Biceps']");
    public static final By BICEPS_DATABASE_RESULT = By.xpath("//strong[text()='Biceps Exercise Database']");
    public static final By GLUTES_DATABASE_INPUT = By.cssSelector("[href='http://www.jefit.com/exercises/bodypart.php?id=5&exercises=Glutes']");
    public static final By GLUTES_DATABASE_RESULT = By.xpath("//strong[text()='Glutes Exercise Database']");
    public static final By SHOULDERS_DATABASE_INPUT = By.cssSelector("[href='http://www.jefit.com/exercises/bodypart.php?id=6&exercises=Shoulders']");
    public static final By SHOULDERS_DATABASE_RESULT = By.xpath("//strong[text()='Shoulders Exercise Database']");

    public ExercisesPage(WebDriver driver) {
        super(driver);
    }

    public static final int EXERCISE_RESULT_ARRAY = 10;

    public final static String GLUTES = "Glutes Exercise Database";
    public final static String BICEPS = "Biceps Exercise Database";
    public final static String SHOULDERS = "Shoulders Exercise Database";
    public final static String TRICEPS = "Triceps Exercise Database";
    public final static String CHEST = "Chest Exercise Database";
    public final static String ABS = "Abs Exercise Database";
    public final static String BACK = "Back Exercise Database";
    public final static String LOWER_LEGS_RESULT = "Lower-Legs Exercise Database";

    public void clickSearchButton() {
        log.info("Search by name. click search button ");
        driver.findElement(SEARCH_BUTTON_EXERCISE_SEARCH_INPUT).click();
    }

    public void searchText(String text) {
        log.info("Exercise By BodyPart. Enter text");
        driver.findElement(SEARCH_EXERCISE_SEARCH_INPUT).sendKeys(text);
    }

    // Методы (Picture)
    public String clickPictureTriceps() {
        log.info("Search by name. Picture - triceps");
        driver.findElement(TRICEPS_PICTURE_INPUT).click();
        String result = driver.findElement(PICTURE_RESULT).getText();
        return result;
    }

    public String clickPictureChest() {
        log.info("Exercise By BodyPart. Picture - chest");
        driver.findElement(CHEST_PICTURE_INPUT).click();
        String result = driver.findElement(PICTURE_RESULT).getText();
        return result;
    }

    public String clickPictureAbs() {
        log.info("Exercise By BodyPart. Picture - abs");
        driver.findElement(ABS_PICTURE_INPUT).click();
        String result = driver.findElement(PICTURE_RESULT).getText();
        return  result;
    }

    public String  clickPictureBack() {
        log.info("Exercise By BodyPart. Picture - back");
        driver.findElement(BACK_PICTURE_INPUT).click();
        String result = driver.findElement(PICTURE_RESULT).getText();
        return result;
    }

    public String clickPictureLowerLegs() {
        log.info("Exercise By BodyPart. Picture - lower legs");
        driver.findElement(LOWER_LEGS_PICTURE_INPUT).click();
        String result = driver.findElement(PICTURE_RESULT).getText();
        return result;
    }

    public void clickPictureAllExercises() {
        log.info("Exercise By BodyPart. Picture - all exercises");
        driver.findElement(VIEW_ALL_EXERCISES_PICTURE_INPUT).click();
    }

    // Методы (Search, Equipment)
    public void checkBoxSearchAll() {
        log.info("Exercise Search. Equipment - All");
        driver.findElement(ALL_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchBodyOnly() {
        log.info("Exercise Search. Equipment - Body Only");
        driver.findElement(BODY_ONLY_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchMachineCardio() {
        log.info("Exercise Search. Equipment - Machine Cardio");
        driver.findElement(MACHINE_CARDIO_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchWeightPlate() {
        log.info("Exercise Search. Equipment - Weight Plate");
        driver.findElement(WEIGHT_PLATE_EXERCISE_SEARCH_INPUT).click();
    }

    // Методы (Search, Type)
    public void checkBoxSearchStrength() {
        log.info("Exercise Search. Type - Strength");
        driver.findElement(STRENGTH_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchStretching() {
        log.info("Exercise Search. Type - Stretching");
        driver.findElement(STRETCHING_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchPowerlifting() {
        log.info("Exercise Search. Type - Powerlifting");
        driver.findElement(POWERLIFTING_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchOlympic() {
        log.info("Exercise Search. Type - Olympic");
        driver.findElement(OLYMPIC_EXERCISE_SEARCH_INPUT).click();
    }

    // Методы (Search, Difficulty)
    public void checkBoxSearchBeginner() {
        log.info("Exercise Search. Difficulty - Beginner");
        driver.findElement(BEGINNER_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchIntermediate() {
        log.info("Exercise Search. Difficulty - Intermediate");
        driver.findElement(INTERMEDIATE_EXERCISE_SEARCH_INPUT).click();
    }

    public void checkBoxSearchExpert() {
        log.info("Exercise Search. Difficulty - Expert");
        driver.findElement(EXPERT_EXERCISE_SEARCH_INPUT).click();
    }

    // Методы (Database)
    public String clickDataBaseBiceps() {
        log.info("Exercise Database. Select biceps");
        driver.findElement(BICEPS_DATABASE_INPUT).click();
        String result = driver.findElement(BICEPS_DATABASE_RESULT).getText();
        return result;
    }

    public String clickDataBaseGlutes() {
        log.info("Exercise Database. Select glutes");
        driver.findElement(GLUTES_DATABASE_INPUT).click();
        String result = driver.findElement(GLUTES_DATABASE_RESULT).getText();
        return result;
    }

    public String clickDataBaseShoulders() {
        log.info("Exercise Database. Select shoulders");
        driver.findElement(SHOULDERS_DATABASE_INPUT).click();
        String result = driver.findElement(SHOULDERS_DATABASE_RESULT).getText();
        return result;
    }

    // Проверка что мы на нужной странице
    public String atPage() {
        return driver.getCurrentUrl();
    }

    public static int resultArrayBodyOnly() {
        log.info("Considers numbers of elements");
        int a = driver.findElements(RESULT_BODY_ONLY).size();
        return a;
    }

    public static int resultArrayStrength() {
        log.info("Considers numbers of elements");
        int a = driver.findElements(RESULT_STRENGTH).size();
        return a;
    }

    public static int resultArrayStretching() {
        log.info("Considers numbers of elements");
        int a = driver.findElements(RESULT_STRETCHING).size();
        return a;
    }

    public void scrollPage() {
        log.info("Scroll page");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void scrollPageTwo() {
        log.info("Scroll page");
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
    }
}
