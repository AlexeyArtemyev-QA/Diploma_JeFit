package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class ProfilePage extends BasePage {

    private static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    private static final By PASSWORD_INPUT = By.id("navbar_password");
    private static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    private static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");

    private static final By CHECKBOX_KG_CM_INPUT = By.xpath("//input[@onclick='changeUnits(1)']");

    private static final By CHECKBOX_GENDER_MAN_INPUT = By.cssSelector("input[value='M']");
    public static final By BUTTON_SIGN_OUT = By.xpath("//a[text()='Sign out']");


    private static final By SELECT_BUTTON_SETTINGS = By.xpath("//a[text()='Settings']");
    private static final By GET_MONTH = By.cssSelector("#monthSelect > option[selected]");
    private static final By GET_DATE = By.cssSelector("#dateSelect > option[selected]");
    private static final By GET_YEAR = By.cssSelector("#yearSelect > option[selected]");
    private static final By GET_KG_CM = By.xpath("//input[@id='unitradio' and @value='1']");
    private static final By GET_SEX = By.xpath("//input[@name='sex' and @value='M']");
    private static final By APP_MENU = By.cssSelector("#my-jefit-app-menu");

    private static final By MY_CUSTOM_EXERCISES = By.xpath("//li[contains(text(),' My Custom Exercises')]");
    private static final By EXERCISE_NAME = By.xpath("//input[@id='newename']");
    private static final By CREATE_EXERCISE = By.xpath("//input[@name='Submit']");
    private static final By TEXT_MUSCLE_GROUP = By.xpath("//p[text()='Cardio']");
    private static final By TEXT_NAME_EXERCISE = By.xpath("//td[text()='Run']");

    private static final By MY_ROUTINES = By.xpath("//a[contains(text(),'My Routines')]");
    private static final By CREATE_NEW_ROUTINE = By.xpath("//a[text()='Create New Routine']");
    private static final By NAME_ROUTINE = By.xpath("//input[@name='rpname']");
    private static final By DESCRIPTION = By.xpath("//textarea[@name='rptext']");
    private static final By TAGS = By.xpath("//textarea[@name='rtags']");
    private static final By SAVE_BUTTON = By.xpath("//input[@class='statusblueButton']");
    private static final By FIRST_ROUTINE = By.xpath("//strong[text()='The first routine']");

    private static final By EXPECTED_FREQUENCY = By.xpath("//p[text()=' 4 days / week']");
    private static final By EXPECTED_TYPE = By.xpath("//p[text()='Sport Specific']");
    private static final By EXPECTED_NAME = By.xpath("//strong[text()='The first routine']");
    private static final By EXPECTED_DESCRIPTION = By.xpath("//p[text()='My first description']");


    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    // Методы
    public void selectKgCm() {
        log.info("Select check-box kg/cm");
        driver.findElement(CHECKBOX_KG_CM_INPUT).click();
    }

    public void selectGenderMan() {
        log.info("Select gender check-box man");
        driver.findElement(CHECKBOX_GENDER_MAN_INPUT).click();
    }

    public void selectSavedButton() {
        log.info("Click on button save settings");
        WebElement button = driver.findElement(By.cssSelector("[name='Submit']"));
        scrollIntoView(button);
        button.click();
    }

    public void enterUserName(String userName) {
        log.info("Enter the User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    public void enterPassword(String password) {
        log.info("Enter the password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void selectLogin() {
        log.info("Click on login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean checkBoxIsSelected() {
        log.info("Check that check-box selected");
        return driver.findElement(CHECKBOX_INPUT).isSelected();
    }

    public void selectDateFromMinimumValueInRange() {
        log.info("Select of the date - 18.10.1996");
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name='month']")));
        selectMonth.selectByVisibleText("October");
        Select selectDay = new Select(driver.findElement(By.xpath("//select[@name='dt']")));
        selectDay.selectByVisibleText("18");
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@name='year']")));
        selectYear.selectByVisibleText("1996");
    }

    public void clickButtonSignOut() {
        log.info("Click on login button");
        driver.findElement(BUTTON_SIGN_OUT).click();
    }

    public String getTextMonth() {
        log.info("Get month text");
        WebElement elementMonth = driver.findElement(GET_MONTH);
        return elementMonth.getText();
    }

    public String getTextDate() {
        log.info("Get date text");
        WebElement elementDate = driver.findElement(GET_DATE);
        return elementDate.getText();
    }

    public String getTextYear() {
        log.info("Get year text");
        WebElement elementDate = driver.findElement(GET_YEAR);
        return elementDate.getText();
    }

    public boolean isSelectedCheckBoxKgCm() {
        log.info("Check-box KgCm is selected");
        return driver.findElement(GET_KG_CM).isSelected();
    }

    public boolean isSelectedCheckBoxSex() {
        log.info("Check-box Sex is selected");
        return driver.findElement(GET_SEX).isSelected();
    }

    public void selectButtonSetting() {
        log.info("Click on setting button");
        driver.findElement(SELECT_BUTTON_SETTINGS).click();
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void moveToElementMenu() {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(APP_MENU);
        actions.moveToElement(menuOption).perform();
    }

    public void clickOnMyCustomExercises() {
        driver.findElement(MY_CUSTOM_EXERCISES).click();
    }

    public void sendTextExerciseName() {
        driver.findElement(EXERCISE_NAME).sendKeys("Run");
    }

    public void selectParametersForExercises() {
        Select selectMuscleGroup = new Select(driver.findElement(By.xpath("//select[@name='selectpart']")));
        selectMuscleGroup.selectByVisibleText("Cardio");
        Select selectRecordType = new Select(driver.findElement(By.xpath("//select[@name='select_recordtype']")));
        selectRecordType.selectByVisibleText("Cardio");
    }

    public void clickOnCreateExercise() {
        driver.findElement(CREATE_EXERCISE).click();
    }

    public String getTextMuscleGroup() {
        log.info("Get name muscle group");
        WebElement elementMonth = driver.findElement(TEXT_MUSCLE_GROUP);
        return elementMonth.getText();
    }

    public String getTextNameExercise() {
        log.info("Get name exercise");
        WebElement elementMonth = driver.findElement(TEXT_NAME_EXERCISE);
        return elementMonth.getText();
    }

    public void clickOnMyRoutines() {
        driver.findElement(MY_ROUTINES).click();
    }

    public void clickOnCreateNewRoutine() {
        driver.findElement(CREATE_NEW_ROUTINE).click();
    }

    public void sendTextRoutineName() {
        driver.findElement(NAME_ROUTINE).sendKeys("The first routine");
    }

    public void selectParametersForRoutine() {
        Select selectFrequency = new Select(driver.findElement(By.xpath("//select[@name='dayselect']")));
        selectFrequency.selectByVisibleText("4 day(s) / week");
        Select selectDateType = new Select(driver.findElement(By.xpath("//select[@name='daytype']")));
        selectDateType.selectByVisibleText("Numerical - E.g., Day1, Day2...");
        Select selectType = new Select(driver.findElement(By.xpath("//select[@name='typeselect']")));
        selectType.selectByVisibleText("Sport Specific");
        Select selectDifficulty = new Select(driver.findElement(By.xpath("//select[@name='levelselect']")));
        selectDifficulty.selectByVisibleText("Intermediate - experience >6 and <24 months");
    }

    public void sendTextDescription() {
        driver.findElement(DESCRIPTION).sendKeys("My first description");
    }

    public void sendTextTags() {
        driver.findElement(TAGS).sendKeys("My first tag");
    }

    public void clickOnSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickFirstRoutine() {
        driver.findElement(FIRST_ROUTINE).click();
    }

    public String getTextFraquency() {
        log.info("Get name muscle group");
        WebElement fraquency = driver.findElement(EXPECTED_FREQUENCY);
        return fraquency.getText();
    }

    public String getTextType() {
        log.info("Get type");
        WebElement type = driver.findElement(EXPECTED_TYPE);
        return type.getText();
    }

    public String getTextName() {
        log.info("Get name");
        WebElement name = driver.findElement(EXPECTED_NAME);
        return name.getText();
    }

    public String getTextDescription() {
        log.info("Get name");
        WebElement desc = driver.findElement(EXPECTED_DESCRIPTION);
        return desc.getText();
    }

    public void waitAppMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(APP_MENU));
    }

}
