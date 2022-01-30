package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

import static JeFit.Test.PropertiesTest.*;

@Log4j2
public class ExercisesPage extends BasePage {

    public ExercisesPage(WebDriver driver) {
        super(driver);
    }


    public void clickSearchButton() {
        log.info("Search by name. click search button ");
        driver.findElement(SEARCH_BUTTON_EXERCISE_SEARCH_INPUT).click();
    }

    public void searchText(String text) {
        log.info("Exercise By BodyPart. Enter text");
        driver.findElement(SEARCH_EXERCISE_SEARCH_INPUT).sendKeys(text);
    }

    // Методы (Picture)
    public void clickPictureTriceps() {
        log.info("Search by name. Picture - triceps");
        driver.findElement(TRICEPS_PICTURE_INPUT).click();
    }

    public void clickPictureChest() {
        log.info("Exercise By BodyPart. Picture - chest");
        driver.findElement(CHEST_PICTURE_INPUT).click();
    }

    public void clickPictureAbs() {
        log.info("Exercise By BodyPart. Picture - abs");
        driver.findElement(ABS_PICTURE_INPUT).click();
    }

    public void clickPictureBack() {
        log.info("Exercise By BodyPart. Picture - back");
        driver.findElement(BACK_PICTURE_INPUT).click();
    }

    public void clickPictureLowerLegs() {
        log.info("Exercise By BodyPart. Picture - lower legs");
        driver.findElement(LOWER_LEGS_PICTURE_INPUT).click();
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
    public void clickDataBaseBiceps() {
        log.info("Exercise Database. Select biceps");
        driver.findElement(BICEPS_DATABASE_INPUT).click();
    }

    public void clickDataBaseGlutes() {
        log.info("Exercise Database. Select glutes");
        driver.findElement(GLUTES_DATABASE_INPUT).click();
    }

    public void clickDataBaseShoulders() {
        log.info("Exercise Database. Select shoulders");
        driver.findElement(SHOULDERS_DATABASE_INPUT).click();
    }

    // Проверка что мы на нужной странице
    public String atPage() {
        return driver.getCurrentUrl();
    }

}
