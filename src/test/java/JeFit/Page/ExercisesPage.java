package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;

@Log4j2
public class ExercisesPage extends BasePage {

    private static final By EXERCISE_RESULT = By.id("hor-minimalist_3");

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


    public ExercisesPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchButton() {
        log.info("Search by name. click search button ");
        WebElement button = driver.findElement(SEARCH_BUTTON_EXERCISE_SEARCH_INPUT);
        scrollIntoView(button);
        button.click();
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
    public void selectCheckBoxAllPage() {
        log.info("Exercise Search. Type - Strength");
        WebElement checkbox = driver.findElement(ALL_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxMachineCardio() {
        log.info("Exercise Search. Equipment - Machine Cardio");
        WebElement checkbox = driver.findElement(MACHINE_CARDIO_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxWeightPlate() {
        log.info("Exercise Search. Equipment - Weight Plate");
        WebElement checkbox = driver.findElement(WEIGHT_PLATE_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    // Методы (Search, Type)
    public void selectCheckBoxStrength() {
        log.info("Exercise Search. Type - Strength");
        WebElement checkbox = driver.findElement(STRENGTH_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxBodyOnly() {
        log.info("Exercise Search. Type - Strength");
        WebElement checkbox = driver.findElement(BODY_ONLY_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxStretching() {
        log.info("Exercise Search. Type - Stretching");
        driver.findElement(STRETCHING_EXERCISE_SEARCH_INPUT).click();
    }

    public void selectCheckBoxPowerlifting() {
        log.info("Exercise Search. Type - Powerlifting");
        WebElement checkbox = driver.findElement(POWERLIFTING_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxOlympic() {
        log.info("Exercise Search. Type - Olympic");
        WebElement ckeckbox = driver.findElement(OLYMPIC_EXERCISE_SEARCH_INPUT);
        scrollIntoView(ckeckbox);
        ckeckbox.click();
    }

    // Методы (Search, Difficulty)
    public void selectCheckBoxBeginner() {
        log.info("Exercise Search. Difficulty - Beginner");
        WebElement checkbox = driver.findElement(BEGINNER_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxIntermediate() {
        log.info("Exercise Search. Difficulty - Intermediate");
        WebElement checkbox = driver.findElement(INTERMEDIATE_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
    }

    public void selectCheckBoxExpert() {
        log.info("Exercise Search. Difficulty - Expert");
        WebElement checkbox = driver.findElement(EXPERT_EXERCISE_SEARCH_INPUT);
        scrollIntoView(checkbox);
        checkbox.click();
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
    }


}
