package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class ExercisesPage extends BasePage {

    private static final By EXERCISE_RESULT = By.id("hor-minimalist_3");
    private static final By BUTTON_SIGN_OUT = By.xpath("//a[text()='Sign out']");

    private static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    private static final By PASSWORD_INPUT = By.id("navbar_password");
    private static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    private static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");
    private static final By APP_MENU = By.cssSelector("#my-jefit-app-menu");

    // ExercisesPage
    // Лскаторы Picture
    private static final By TRICEPS_PICTURE_INPUT = By.xpath("//ul[@class='buttonTableLeft']//a[text()='Triceps']");
    private static final By CHEST_PICTURE_INPUT = By.xpath("//li[@id='exercisechest']//descendant::a");
    private static final By BACK_PICTURE_INPUT = By.xpath("//a[@class='exerciseblueButton' and text()='Back']");
    private static final By ABS_PICTURE_INPUT = By.xpath("//li[@id='exerciseabs']//descendant::a");
    private static final By LOWER_LEGS_PICTURE_INPUT = By.xpath("//li[@id='exerciselowerlegs']//descendant::a");

    private static final By PICTURE_RESULT = By.id("bodyparttext");

    private static final By RESULT_BODY_ONLY = By.xpath("//p[text()='Equipment : Body Only ']");
    private static final By RESULT_STRENGTH = By.xpath("//p[text()='Type : Strength ']");
    private static final By RESULT_STRETCHING = By.xpath("//p[text()='Type : Stretching ']");

    // Локаторы Exercise Search
    // Equipment
    private static final By ALL_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='All']");
    private static final By BODY_ONLY_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='BodyOnly']");
    private static final By MACHINE_CARDIO_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='MachineCardio']");
    private static final By WEIGHT_PLATE_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='WeightPlate']");

    //Type
    private static final By STRENGTH_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Strength']");
    private static final By STRETCHING_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Stretching']");
    private static final By POWERLIFTING_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Powerlifting']");
    private static final By OLYMPIC_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='OlympicWeightLifting']");

    // Difficulty
    private static final By BEGINNER_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Beginner']");
    private static final By INTERMEDIATE_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Intermediate']");
    private static final By EXPERT_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Expert']");

    // Кнопка поиска
    private static final By SEARCH_BUTTON_EXERCISE_SEARCH_INPUT = By.cssSelector("[class='statusblueButton']");

    // DataBase
    private static final By BICEPS_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Biceps']");
    private static final By BICEPS_DATABASE_RESULT = By.xpath("//strong[text()='Biceps Exercise Database']");
    private static final By GLUTES_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Glutes']");
    private static final By GLUTES_DATABASE_RESULT = By.xpath("//strong[text()='Glutes Exercise Database']");
    private static final By SHOULDERS_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Shoulders']");
    private static final By SHOULDERS_DATABASE_RESULT = By.xpath("//strong[text()='Shoulders Exercise Database']");

    private static final By WORKOUT_PLANS_BUTTON = By.xpath("//a[text()='Workout Plans' and @class='raven-menu-item raven-link-item ']");
    private static final By SEARCH_INPUT = By.xpath("//input[@id='searchText']");
    private static final By SEARCH_BUTTON = By.xpath("//input[@class='postButton']");
    private static final By EXERCISES = By.xpath("//div[contains(text(),'Posterior Chain Workout')]");
    private static final By SAVE_TO_MY_WORKOUTS = By.xpath("//input[@value='Save To My Workouts']");
    private static final By MY_JEFIT = By.xpath("//span[text()='My Jefit']");
    private static final By MESSAGE = By.xpath("//p[text()='This routine has been downloaded to your account. Please click the sync button from your device.']");
    private static final By MY_ROUTINES = By.xpath("//a[contains(text(),'My Routines')]");
    private static final By NAME_WORKOUT = By.xpath("//strong[text()='Posterior Chain Workout']");

    public ExercisesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnWorkoutPlansButton() {
        log.info("Click workout plans button");
        driver.findElement(WORKOUT_PLANS_BUTTON).click();
    }

    public void sentTextExercises(String TEXT_EXERCISES_INPUT) {
        log.info("Send text exercises");
        driver.findElement(SEARCH_INPUT).sendKeys(TEXT_EXERCISES_INPUT);
    }

    public void clickSearchExercisesButton() {
        log.info("Click search button");
        driver.findElement(SEARCH_BUTTON).click();
    }

    public void clickOnExercises() {
        log.info("Click on exercises");
        WebElement element = driver.findElement(EXERCISES);
        scrollToElement(element);
        element.click();
    }

    public void clickOnSaveOnMyWorkouts() {
        log.info("Click on save to my workouts");
        WebElement element = driver.findElement(SAVE_TO_MY_WORKOUTS);
        scrollToElement(element);
        element.click();
    }

    public void clickOnMyJefit() {
        driver.findElement(MY_JEFIT).click();
    }

    public String getTextMessage(){
        log.info("Get text message");
        WebElement element = driver.findElement(MESSAGE);
        scrollToElement(element);
        return element.getText();
    }

    public void clickOnMyRoutines() {
        log.info("Click on the button My routines");
        driver.findElement(MY_ROUTINES).click();
    }

    public String getTextWorkout(){
        log.info("Get text message workout");
        WebElement element = driver.findElement(NAME_WORKOUT);
        scrollToElement(element);
        return element.getText();
    }

    public void clickSearchButton() {
        log.info("Search by name. Click search button");
        WebElement button = driver.findElement(SEARCH_BUTTON_EXERCISE_SEARCH_INPUT);
        scrollToElement(button);
        button.click();
    }

    // Методы (Picture)
    public String getTextPictureTriceps() {
        log.info("Get text Triceps");
        driver.findElement(TRICEPS_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextResult() {
        log.info("Get text result exercise");
        return driver.findElement(EXERCISE_RESULT).getText();
    }

    public String getTextPictureChest() {
        log.info("Get txt Chest");
        driver.findElement(CHEST_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextPictureAbs() {
        log.info("Get text Abc");
        driver.findElement(ABS_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextPictureBack() {
        log.info("Get text Back");
        driver.findElement(BACK_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    public String getTextPictureLowerLegs() {
        log.info("Get text Lower Legs");
        driver.findElement(LOWER_LEGS_PICTURE_INPUT).click();
        return driver.findElement(PICTURE_RESULT).getText();
    }

    // Методы (Search, Equipment)
    public void selectCheckBoxAllPage() {
        log.info("Select check-box Strength");
        WebElement checkbox = driver.findElement(ALL_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxMachineCardio() {
        log.info("Select check-box Machine Cardio");
        WebElement checkbox = driver.findElement(MACHINE_CARDIO_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxWeightPlate() {
        log.info("Select check-box Weight Plate");
        WebElement checkbox = driver.findElement(WEIGHT_PLATE_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    // Методы (Search, Type)
    public void selectCheckBoxStrength() {
        log.info("Select check-box - Strength");
        WebElement checkbox = driver.findElement(STRENGTH_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxBodyOnly() {
        log.info("Select check-box - Strength");
        WebElement checkbox = driver.findElement(BODY_ONLY_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxStretching() {
        log.info("Select check-box - Stretching");
        driver.findElement(STRETCHING_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectCheckBoxPowerlifting() {
        log.info("Select check-box - Powerlifting");
        WebElement checkbox = driver.findElement(POWERLIFTING_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxOlympic() {
        log.info("Select check-box - Olympic");
        WebElement ckeckbox = driver.findElement(OLYMPIC_EXERCISE_SEARCH_INPUT);
        scrollToElement(ckeckbox);
        ckeckbox.click();
    }

    // Методы (Search, Difficulty)
    public void selectCheckBoxBeginner() {
        log.info("Select check-box - Beginner");
        WebElement checkbox = driver.findElement(BEGINNER_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxIntermediate() {
        log.info("Select check-box - Intermediate");
        WebElement checkbox = driver.findElement(INTERMEDIATE_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxExpert() {
        log.info("Select check-box - Expert");
        WebElement checkbox = driver.findElement(EXPERT_EXERCISE_SEARCH_INPUT);
        scrollToElement(checkbox);
        checkbox.click();
    }

    // Методы (Database)
    public String getTextDataBaseBiceps() {
        log.info("Get text Biceps");
        driver.findElement(BICEPS_DATABASE_INPUT).click();
        return driver.findElement(BICEPS_DATABASE_RESULT).getText();
    }

    public String getTextDataBaseGlutes() {
        log.info("Get text Glutes");
        driver.findElement(GLUTES_DATABASE_INPUT).click();
        return driver.findElement(GLUTES_DATABASE_RESULT).getText();
    }

    public String getTextDataBaseShoulders() {
        log.info("Get text Shoulders");
        driver.findElement(SHOULDERS_DATABASE_INPUT).click();
        return driver.findElement(SHOULDERS_DATABASE_RESULT).getText();
    }

    public int getSizeArrayBodyOnly() {
        log.info("Considers numbers of elements Body Only");
        return driver.findElements(RESULT_BODY_ONLY).size();
    }

    public int getSizeArrayStrength() {
        log.info("Considers numbers of elements Strength");
        return driver.findElements(RESULT_STRENGTH).size();
    }

    public int getSizeArrayStretching() {
        log.info("Considers numbers of elements Stretching");
        return driver.findElements(RESULT_STRETCHING).size();
    }

    public void enterUserName(String userName) {
        log.info("Enter User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public boolean checkBoxIsSelected() {
        log.info("Check that check-box selected");
        return driver.findElement(CHECKBOX_INPUT).isSelected();
    }

    public void selectLogin() {
        log.info("Click on login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void moveToElementMenu() {
        log.info("Move to Menu");
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(APP_MENU);
        actions.moveToElement(menuOption).perform();
    }

    public void clickButtonSignOut() {
        log.info("Click on login button");
        driver.findElement(BUTTON_SIGN_OUT).click();
    }
}
