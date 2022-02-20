package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
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
    private static final By WALK_CUSTOM_EXERCISES = By.xpath("//td[text()='Walk']");
    private static final By MY_ROUTINES = By.xpath("//a[contains(text(),'My Routines')]");
    private static final By CREATE_NEW_ROUTINE = By.xpath("//a[text()='Create New Routine']");
    private static final By NAME_ROUTINE = By.xpath("//input[@name='rpname']");
    private static final By DESCRIPTION = By.xpath("//textarea[@name='rptext']");
    private static final By TAGS = By.xpath("//textarea[@name='rtags']");
    private static final By SAVE_BUTTON = By.xpath("//input[@class='statusblueButton']");
    private static final By FIRST_ROUTINE = By.xpath("//strong[text()='The first routine']");
    private static final By FREQUENCY = By.xpath("//p[text()=' 4 days / week']");
    private static final By FREQUENCY_EDIT = By.xpath("//p[text()=' 2 days / week']");
    private static final By TYPE = By.xpath("//p[text()='Sport Specific']");
    private static final By NAME = By.xpath("//strong[text()='The first routine']");
    private static final By DESCRIPTION_TEXT = By.xpath("//p[text()='My first description']");
    private static final By FRIENDS = By.xpath("//span[text()='Friends']");
    private static final By SEARCH_FRIENDS_BUTTON = By.xpath("//div[contains(text(),'Search Friends')]");
    private static final By SEARCH_FRIENDS_FIELD = By.xpath("//input[@id='suggestionsinput']");
    private static final By SEARCH_BUTTON = By.xpath("//input[@id='searchFriend']");
    private static final By FRIEND_NAME = By.xpath("//a[contains(text(),'Alex 1980')]");
    private static final By ADD_BUTTON = By.xpath("//a[contains(text(),'Add')]");
    private static final By FRIEND_REQUEST_SENT = By.xpath("//div[contains(text(),'Friend Request Sent')]");
    private static final By TEXT_AREA = By.xpath("//textarea[@id='statusinputbox']");
    private static final By POST_BUTTON = By.xpath("//input[@value='Post']");
    private static final By TEXT_STATUS = By.xpath("//div[@id='statusText']//descendant::div");
    private static final By LOG_WORKOUT = By.xpath("//a[@class='btn btn-outline-secondary btn-block']");
    private static final By ADD_BUTTON_NOTE = By.xpath("//span[@id='add-note']");
    private static final By NOTE_FIELD = By.xpath("//form[@name='add-note']//descendant::textarea[@name='note']");
    private static final By CREATE_NOTE_BUTTON = By.xpath("//button[text()='Create Note']");
    private static final By NOTE = By.xpath("//div[@class='fixed-note']//descendant::div");
    private static final By ADD_BUTTON_BODY_STATUS = By.xpath("//span[@id='edit-body-stats']");
    private static final By EDIT_BODY_STATUS_POPUP = By.id("add-body-stats-div");
    private static final By WEIGHT = By.xpath("//input[@name='weight']");
    private static final By HEIGHT = By.xpath("//input[@name='height']");
    private static final By DONE_BUTTON = By.xpath("//div[contains(text(),'Done')]");
    private static final By WEIGHT_VALUE = By.xpath("//strong[contains(text(),'Weight : ')]//ancestor::a");
    private static final By HEIGHT_VALUE = By.xpath("//strong[contains(text(),'Height : ')]//ancestor::a");
    private static final By SUBMIT_BUTTON = By.cssSelector("[name='Submit']");
    private static final By MONTH_VALUE = By.xpath("//select[@name='month']");
    private static final By DAY_VALUE = By.xpath("//select[@name='dt']");
    private static final By YEAR_VALUE = By.xpath("//select[@name='year']");
    private static final By MUSCLE_GROUP = By.xpath("//select[@name='selectpart']");
    private static final By RECORD_TYPE = By.xpath("//select[@name='select_recordtype']");
    private static final By FREQUENCY_INPUT = By.xpath("//select[@name='dayselect']");
    private static final By DATA_TYPE_INPUT = By.xpath("//select[@name='daytype']");
    private static final By TYPE_INPUT = By.xpath("//select[@name='typeselect']");
    private static final By DIFFICULTY_INPUT = By.xpath("//select[@name='levelselect']");
    private static final By ROUTINE_SECOND = By.xpath("//strong[text()='The second routine']");
    private static final By DELETE_BUTTON = By.xpath("//a[text()=' Delete']");
    private static final By EDIT_ROUTINE = By.xpath("//a[@class='confirmText']");
    private static final By TYPE_EDIT = By.xpath("//p[text()='General Fitness']");
    private static final By REMOVAL_TEXT = By.xpath("//p[text()='You have not setup a default routine yet. Please create one or set one as default routine']");
    private static final By EDIT_BUTTON = By.cssSelector("#hor-minimalist_3 > tbody > tr > td > table > tbody > tr:nth-of-type(2) > td:nth-of-type(3) > a");
    private static final By DELETE_BUTTON_CUSTOM_EXERCISES = By.cssSelector("#hor-minimalist_3 > tbody > tr > td > table > tbody > tr:nth-of-type(2) > td:nth-of-type(4) > a");
    private static final By EDIT_BUTTON_CUSTOM_EXERCISE = By.xpath("//td[text()='Jump']//ancestor::td[@align='center']//following::td[@align='center']");
    private static final By DELETE_CUSTOM_EXERCISE = By.xpath("//td[@colspan='4']");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    // Методы
    public void clickRoutineSecond() {
        log.info("Click button My second routine");
        driver.findElement(ROUTINE_SECOND).click();
    }

    public void clickEditButtonCustomExercise() {
        log.info("Click edit button");
        driver.findElement(EDIT_BUTTON_CUSTOM_EXERCISE).click();
    }

    public void clickEditButton() {
        log.info("Click edit button");
        driver.findElement(EDIT_BUTTON).click();
    }

    public void clickDeleteButtonCustomExercises() {
        log.info("Click delete button");
        driver.findElement(DELETE_BUTTON_CUSTOM_EXERCISES).click();
    }

    public void clickDeleteButton() {
        log.info("Click button My third routine");
        driver.findElement(DELETE_BUTTON).click();
        driver.switchTo().alert().accept();
    }

    public String getTextSuccessfulRemoval() {
        log.info("Get text frequency");
        WebElement frequency = driver.findElement(REMOVAL_TEXT);
        return frequency.getText();
    }

    public void clickEditRoutine() {
        log.info("Click button Edit");
        driver.findElement(EDIT_ROUTINE).click();
    }

    public String getTextEditFrequency() {
        log.info("Get text frequency");
        WebElement frequency = driver.findElement(FREQUENCY_EDIT);
        return frequency.getText();
    }

    public String getTextEditType() {
        log.info("Get text type");
        WebElement type = driver.findElement(TYPE_EDIT);
        return type.getText();
    }

    public void selectKgCm() {
        log.info("Select check-box kg/cm");
        driver.findElement(CHECKBOX_KG_CM_INPUT).click();
    }

    public void selectGenderMan() {
        log.info("Select gender check-box man");
        driver.findElement(CHECKBOX_GENDER_MAN_INPUT).click();
    }

    public void clickSaveButton() {
        log.info("Click on button save settings");
        WebElement button = driver.findElement(SUBMIT_BUTTON);
        scrollToElement(button);
        button.click();
    }

    public void enterUserName(String userName) {
        log.info("Enter User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLogin() {
        log.info("Click on login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean checkBoxIsSelected() {
        log.info("Check that check-box selected");
        return driver.findElement(CHECKBOX_INPUT).isSelected();
    }

    public void selectDateFromMinimumValueInRange(String MONTH_INPUT, String DAY_INPUT, String YEAR_INPUT) {
        log.info("Select date");
        Select selectMonth = new Select(driver.findElement(MONTH_VALUE));
        selectMonth.selectByVisibleText(MONTH_INPUT);
        Select selectDay = new Select(driver.findElement(DAY_VALUE));
        selectDay.selectByVisibleText(DAY_INPUT);
        Select selectYear = new Select(driver.findElement(YEAR_VALUE));
        selectYear.selectByVisibleText(YEAR_INPUT);
    }

    public void clickButtonSignOut() {
        log.info("Click on Sign Out");
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

    public void clickButtonSetting() {
        log.info("Click on setting button");
        driver.findElement(SELECT_BUTTON_SETTINGS).click();
    }

    public void moveToElementMenu() {
        log.info("Move to element Menu");
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(APP_MENU);
        actions.moveToElement(menuOption).perform();
    }

    public void clickOnMyCustomExercises() {
        log.info("Click button My exercises ");
        driver.findElement(MY_CUSTOM_EXERCISES).click();
    }

    public void sendTextExerciseName(String exerciseNameInputKeys) {
        log.info("Send name exercise");
        driver.findElement(EXERCISE_NAME).sendKeys(exerciseNameInputKeys);
    }

    public void selectParametersForExercises(String muscleGroupInputText, String recordTypeInputText) {
        log.info("Select Muscle group");
        Select selectMuscleGroup = new Select(driver.findElement(MUSCLE_GROUP));
        selectMuscleGroup.selectByVisibleText(muscleGroupInputText);
        log.info("Select Record type");
        Select selectRecordType = new Select(driver.findElement(RECORD_TYPE));
        selectRecordType.selectByVisibleText(recordTypeInputText);
    }

    public void clickOnCreateExercise() {
        log.info("Click button Create exercises");
        driver.findElement(CREATE_EXERCISE).click();
    }

    public String getTextMuscleGroup() {
        log.info("Get text name Muscle group");
        WebElement elementMonth = driver.findElement(TEXT_MUSCLE_GROUP);
        return elementMonth.getText();
    }

    public String getTextNameExercise() {
        log.info("Get name exercise");
        WebElement elementMonth = driver.findElement(TEXT_NAME_EXERCISE);
        return elementMonth.getText();
    }

    public void clickOnMyRoutines() {
        log.info("Click button My Routines");
        driver.findElement(MY_ROUTINES).click();
    }

    public void clickOnCreateNewRoutine() {
        log.info("Click button Create new routine");
        driver.findElement(CREATE_NEW_ROUTINE).click();
    }

    public void sendTextRoutineName(String routineNameInputText) {
        log.info("Send text Routine name");
        driver.findElement(NAME_ROUTINE).sendKeys(routineNameInputText);
    }

    public void selectParametersForRoutine(String frequencyInputParameter, String dateTypeInputParameter, String typeInputParameter, String difficultyInputParameter) {
        log.info("Select Frequency");
        Select selectFrequency = new Select(driver.findElement(FREQUENCY_INPUT));
        selectFrequency.selectByVisibleText(frequencyInputParameter);
        log.info("Select Date Type");
        Select selectDateType = new Select(driver.findElement(DATA_TYPE_INPUT));
        selectDateType.selectByVisibleText(dateTypeInputParameter);
        log.info("Select Type");
        Select selectType = new Select(driver.findElement(TYPE_INPUT));
        selectType.selectByVisibleText(typeInputParameter);
        log.info("Select Difficulty");
        Select selectDifficulty = new Select(driver.findElement(DIFFICULTY_INPUT));
        selectDifficulty.selectByVisibleText(difficultyInputParameter);
    }

    public void sendTextDescription(String DESCRIPTION_INPUT) {
        log.info("Send text Description");
        driver.findElement(DESCRIPTION).sendKeys(DESCRIPTION_INPUT);
    }

    public void sendTextTags(String TAG_INPUT) {
        log.info("Send text Tags");
        driver.findElement(TAGS).sendKeys(TAG_INPUT);
    }

    public void clickOnSaveButton() {
        log.info("Click save button");
        WebElement saveButton = driver.findElement(SAVE_BUTTON);
        scrollToElement(saveButton);
        saveButton.click();
    }

    public void clickFirstRoutine() {
        log.info("Click routine");
        driver.findElement(FIRST_ROUTINE).click();
    }

    public String getTextFrequency() {
        log.info("Get text frequency");
        WebElement frequency = driver.findElement(FREQUENCY);
        return frequency.getText();
    }

    public String getTextType() {
        log.info("Get text type");
        WebElement type = driver.findElement(TYPE);
        return type.getText();
    }

    public String getTextName() {
        log.info("Get text name");
        WebElement name = driver.findElement(NAME);
        return name.getText();
    }

    public String getTextDescription() {
        log.info("Get text description");
        WebElement desc = driver.findElement(DESCRIPTION_TEXT);
        return desc.getText();
    }

    public void waitAppMenu() {
        log.info("Wait app menu");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(APP_MENU));
    }

    public void clickFriendsButton() {
        log.info("Click button friends");
        driver.findElement(FRIENDS).click();
    }

    public void clickSearchFriendsButton() {
        log.info("Click search friends");
        driver.findElement(SEARCH_FRIENDS_BUTTON).click();
    }

    public void sentTextNameForSearch(String NAME_FRIEND_INPUT) {
        log.info("Sent text user name for search");
        driver.findElement(SEARCH_FRIENDS_FIELD).sendKeys(NAME_FRIEND_INPUT);
    }

    public void clickSearchButton() {
        log.info("Click search button");
        driver.findElement(SEARCH_BUTTON).click();
    }

    public String getTextFriendName() {
        log.info("Get friend name");
        WebElement name = driver.findElement(FRIEND_NAME);
        return name.getText();
    }

    public void clickAddButton() {
        log.info("Click add button");
        driver.findElement(ADD_BUTTON).click();
    }

    public void clickFriendName() {
        log.info("Click friend name");
        driver.findElement(FRIEND_NAME).click();
    }

    public String getTextFriendRequest() {
        log.info("Get text request");
        WebElement request = driver.findElement(FRIEND_REQUEST_SENT);
        return request.getText();
    }

    public void clickAppMenu() {
        log.info("Click on My JeFit");
        driver.findElement(APP_MENU).click();
    }

    public void sentTextStatus(String STATUS_INPUT) {
        log.info("Send text status");
        driver.findElement(TEXT_AREA).sendKeys(STATUS_INPUT);
    }

    public void clickPostButton() {
        log.info("Click post button");
        driver.findElement(POST_BUTTON).click();
    }

    public String getTextCurrentStatus() {
        log.info("Get text status");
        WebElement text = driver.findElement(TEXT_STATUS);
        return text.getText();
    }

    public void clickLogWorkoutButton() {
        log.info("click Log workout button");
        driver.findElement(LOG_WORKOUT).click();
    }

    public void clickButtonAddNote() {
        log.info("Click add note");
        driver.findElement(ADD_BUTTON_NOTE).click();
    }

    public void sentTextNote(String NOTE_INPUT) {
        log.info("Sent text note");
        driver.findElement(NOTE_FIELD).sendKeys(NOTE_INPUT);
    }

    public void clickButtonCreateNote() {
        log.info("Click button create note");
        driver.findElement(CREATE_NOTE_BUTTON).click();
    }

    public String getTextNote() {
        log.info("Get text note");
        WebElement note = driver.findElement(NOTE);
        return note.getText();
    }

    public void clickButtonAddBodyStatus() {
        log.info("Click button add body status");
        driver.findElement(ADD_BUTTON_BODY_STATUS).click();
    }

    public void sendValueBodyParameters(String weightInputKeys, String hieghtInputKeys) {
        log.info("Send value weight");
        driver.findElement(WEIGHT).sendKeys(weightInputKeys);
        log.info("Send value height");
        driver.findElement(HEIGHT).sendKeys(hieghtInputKeys);
    }

    public void clickButtonDone() {
        log.info("Click button Done");
        driver.findElement(DONE_BUTTON).click();
    }

    public void clickButtonDoneAndWaitUntilPopupDisappear() {
        clickButtonDone();
        wainUntilElementWillBePresentOnPageByLocator(EDIT_BODY_STATUS_POPUP, 5);
    }

    public String getTextWeight() {
        log.info("Get text weight");
        WebElement note = driver.findElement(WEIGHT_VALUE);
        return note.getText();
    }

    public String getTextHeight() {
        log.info("Get text height");
        WebElement note = driver.findElement(HEIGHT_VALUE);
        return note.getText();
    }

    public void cleanFieldName (){
        log.info("Clean field exercise name");
        driver.findElement(EXERCISE_NAME).clear();
    }

    public String getTextCustomExercises() {
        log.info("Get text walk exercises");
        WebElement note = driver.findElement(WALK_CUSTOM_EXERCISES);
        return note.getText();
    }

    public String getTextDeleteCustomExercises() {
        log.info("Get text after deleting ");
        WebElement space = driver.findElement(DELETE_CUSTOM_EXERCISE);
        return space.getText();
    }

}
