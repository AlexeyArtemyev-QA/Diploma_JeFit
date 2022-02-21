package JeFit.pages;

import JeFit.pages.contants.ExercisesPageConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class ExercisesPage extends BasePage {

    public ExercisesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnWorkoutPlansButton() {
        log.info("Click workout plans button");
        driver.findElement(ExercisesPageConstants.WORKOUT_PLANS_BUTTON).click();
    }

    public void sentTextExercises(String exerciseInputText) {
        log.info("Send text exercises");
        driver.findElement(ExercisesPageConstants.SEARCH_INPUT).sendKeys(exerciseInputText);
    }

    public void clickSearchExercisesButton() {
        log.info("Click search button");
        driver.findElement(ExercisesPageConstants.SEARCH_BUTTON).click();
    }

    public void clickOnExercises() {
        log.info("Click on exercises");
        WebElement element = driver.findElement(ExercisesPageConstants.EXERCISES);
        scrollToElement(element);
        element.click();
    }

    public void clickOnSaveOnMyWorkouts() {
        log.info("Click on save to my workouts");
        WebElement element = driver.findElement(ExercisesPageConstants.SAVE_TO_MY_WORKOUTS);
        scrollToElement(element);
        element.click();
    }

    public void clickOnMyJefit() {
        driver.findElement(ExercisesPageConstants.MY_JEFIT).click();
    }

    public String getTextMessage() {
        log.info("Get text message");
        WebElement element = driver.findElement(ExercisesPageConstants.MESSAGE);
        scrollToElement(element);
        return element.getText();
    }

    public void clickOnMyRoutines() {
        log.info("Click on the button My routines");
        driver.findElement(ExercisesPageConstants.MY_ROUTINES).click();
    }

    public String getTextWorkout() {
        log.info("Get text message workout");
        WebElement element = driver.findElement(ExercisesPageConstants.NAME_WORKOUT);
        scrollToElement(element);
        return element.getText();
    }

    public void clickSearchButton() {
        log.info("Search by name. Click search button");
        WebElement button = driver.findElement(ExercisesPageConstants.SEARCH_BUTTON_EXERCISE_SEARCH_INPUT);
        scrollToElement(button);
        button.click();
    }

    // Методы (Picture)
    public String getTextPictureTriceps() {
        log.info("Get text Triceps");
        driver.findElement(ExercisesPageConstants.TRICEPS_PICTURE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.PICTURE_RESULT).getText();
    }

    public String getTextResult() {
        log.info("Get text result exercise");
        return driver.findElement(ExercisesPageConstants.EXERCISE_RESULT).getText();
    }

    public String getTextPictureChest() {
        log.info("Get txt Chest");
        driver.findElement(ExercisesPageConstants.CHEST_PICTURE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.PICTURE_RESULT).getText();
    }

    public String getTextPictureAbs() {
        log.info("Get text Abc");
        driver.findElement(ExercisesPageConstants.ABS_PICTURE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.PICTURE_RESULT).getText();
    }

    public String getTextPictureBack() {
        log.info("Get text Back");
        driver.findElement(ExercisesPageConstants.BACK_PICTURE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.PICTURE_RESULT).getText();
    }

    public String getTextPictureLowerLegs() {
        log.info("Get text Lower Legs");
        driver.findElement(ExercisesPageConstants.LOWER_LEGS_PICTURE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.PICTURE_RESULT).getText();
    }

    // Методы (Search, Equipment)
    public void selectCheckBoxAllPage() {
        log.info("Select check-box Strength");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.ALL_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxMachineCardio() {
        log.info("Select check-box Machine Cardio");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.MACHINE_CARDIO_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxWeightPlate() {
        log.info("Select check-box Weight Plate");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.WEIGHT_PLATE_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    // Методы (Search, Type)
    public void selectCheckBoxStrength() {
        log.info("Select check-box - Strength");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.STRENGTH_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxBodyOnly() {
        log.info("Select check-box - Strength");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.BODY_ONLY_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxStretching() {
        log.info("Select check-box - Stretching");
        driver.findElement(ExercisesPageConstants.STRETCHING_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectCheckBoxPowerlifting() {
        log.info("Select check-box - Powerlifting");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.POWERLIFTING_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxOlympic() {
        log.info("Select check-box - Olympic");
        WebElement ckeckbox = driver.findElement(ExercisesPageConstants.OLYMPIC_EXERCISE_SEARCH_INPUT);
        scrollToElement(ckeckbox);
        ckeckbox.click();
    }

    // Методы (Search, Difficulty)
    public void selectCheckBoxBeginner() {
        log.info("Select check-box - Beginner");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.BEGINNER_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxIntermediate() {
        log.info("Select check-box - Intermediate");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.INTERMEDIATE_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxExpert() {
        log.info("Select check-box - Expert");
        WebElement checkbox = driver.findElement(ExercisesPageConstants.EXPERT_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    // Методы (Database)
    public String getTextDataBaseBiceps() {
        log.info("Get text Biceps");
        driver.findElement(ExercisesPageConstants.BICEPS_DATABASE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.BICEPS_DATABASE_RESULT).getText();
    }

    public String getTextDataBaseGlutes() {
        log.info("Get text Glutes");
        driver.findElement(ExercisesPageConstants.GLUTES_DATABASE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.GLUTES_DATABASE_RESULT).getText();
    }

    public String getTextDataBaseShoulders() {
        log.info("Get text Shoulders");
        driver.findElement(ExercisesPageConstants.SHOULDERS_DATABASE_INPUT).click();
        return driver.findElement(ExercisesPageConstants.SHOULDERS_DATABASE_RESULT).getText();
    }

    public int getSizeArrayBodyOnly() {
        log.info("Considers numbers of elements Body Only");
        return driver.findElements(ExercisesPageConstants.RESULT_BODY_ONLY).size();
    }

    public int getSizeArrayStrength() {
        log.info("Considers numbers of elements Strength");
        return driver.findElements(ExercisesPageConstants.RESULT_STRENGTH).size();
    }

    public int getSizeArrayStretching() {
        log.info("Considers numbers of elements Stretching");
        return driver.findElements(ExercisesPageConstants.RESULT_STRETCHING).size();
    }
}
