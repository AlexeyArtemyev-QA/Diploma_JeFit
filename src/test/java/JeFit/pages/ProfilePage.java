package JeFit.pages;

import JeFit.pages.contants.ProfilePageConstants;
import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class ProfilePage extends BasePage {
    private final static String PROFILE_PAGE_URL = "https://www.jefit.com/my-jefit/profile/";

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(PROFILE_PAGE_URL);
    }

    // Методы
    public void clickRoutineSecond() {
        log.info("Click button My second routine");
        driver.findElement(ProfilePageConstants.ROUTINE_SECOND).click();
    }

    public void clickEditButtonCustomExercise() {
        log.info("Click edit button");
        driver.findElement(ProfilePageConstants.EDIT_BUTTON_CUSTOM_EXERCISE).click();
    }

    public void clickEditButton() {
        log.info("Click edit button");
        driver.findElement(ProfilePageConstants.EDIT_BUTTON).click();
    }

    public void clickDeleteButtonCustomExercises() {
        log.info("Click delete button");
        driver.findElement(ProfilePageConstants.DELETE_BUTTON_CUSTOM_EXERCISES).click();
    }

    public void clickDeleteButton() {
        log.info("Click button My third routine");
        driver.findElement(ProfilePageConstants.DELETE_BUTTON).click();
        driver.switchTo().alert().accept();
    }

    public String getTextSuccessfulRemoval() {
        log.info("Get text frequency");
        WebElement frequency = driver.findElement(ProfilePageConstants.REMOVAL_TEXT);
        return frequency.getText();
    }

    public void clickEditRoutine() {
        log.info("Click button Edit");
        driver.findElement(ProfilePageConstants.EDIT_ROUTINE).click();
    }

    public String getTextEditFrequency() {
        log.info("Get text frequency");
        WebElement frequency = driver.findElement(ProfilePageConstants.FREQUENCY_EDIT);
        return frequency.getText();
    }

    public String getTextEditType() {
        log.info("Get text type");
        WebElement type = driver.findElement(ProfilePageConstants.TYPE_EDIT);
        return type.getText();
    }

    public void selectKgCm() {
        log.info("Select check-box kg/cm");
        driver.findElement(ProfilePageConstants.CHECKBOX_KG_CM_INPUT).click();
    }

    public void selectGenderMan() {
        log.info("Select gender check-box man");
        driver.findElement(ProfilePageConstants.CHECKBOX_GENDER_MAN_INPUT).click();
    }

    public void clickSaveButton() {
        log.info("Click on button save settings");
        WebElement button = driver.findElement(ProfilePageConstants.SUBMIT_BUTTON);
        scrollToElement(button);
        button.click();
    }

    public void selectDateFromMinimumValueInRange(String monthInputText, String dayInputText, String yearInputText) {
        log.info("Select date");
        Select selectMonth = new Select(driver.findElement(ProfilePageConstants.MONTH_VALUE));
        selectMonth.selectByVisibleText(monthInputText);
        Select selectDay = new Select(driver.findElement(ProfilePageConstants.DAY_VALUE));
        selectDay.selectByVisibleText(dayInputText);
        Select selectYear = new Select(driver.findElement(ProfilePageConstants.YEAR_VALUE));
        selectYear.selectByVisibleText(yearInputText);
    }

    public String getTextMonth() {
        log.info("Get month text");
        WebElement elementMonth = driver.findElement(ProfilePageConstants.GET_MONTH);
        return elementMonth.getText();
    }

    public String getTextDate() {
        log.info("Get date text");
        WebElement elementDate = driver.findElement(ProfilePageConstants.GET_DATE);
        return elementDate.getText();
    }

    public String getTextYear() {
        log.info("Get year text");
        WebElement elementDate = driver.findElement(ProfilePageConstants.GET_YEAR);
        return elementDate.getText();
    }

    public boolean isSelectedCheckBoxKgCm() {
        log.info("Check-box KgCm is selected");
        return driver.findElement(ProfilePageConstants.GET_KG_CM).isSelected();
    }

    public boolean isSelectedCheckBoxSex() {
        log.info("Check-box Sex is selected");
        return driver.findElement(ProfilePageConstants.GET_SEX).isSelected();
    }

    public void clickButtonSetting() {
        log.info("Click on setting button");
        driver.findElement(ProfilePageConstants.SELECT_BUTTON_SETTINGS).click();
    }

    public void moveToElementMenu() {
        log.info("Move to element Menu");
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(ProfilePageConstants.APP_MENU);
        actions.moveToElement(menuOption).build().perform();
    }

    public void clickOnMyCustomExercises() {
        log.info("Click button My exercises ");
        driver.findElement(ProfilePageConstants.MY_CUSTOM_EXERCISES).click();
    }

    public void sendTextExerciseName(String exerciseNameInputKeys) {
        log.info("Send name exercise");
        driver.findElement(ProfilePageConstants.EXERCISE_NAME).sendKeys(exerciseNameInputKeys);
    }

    public void selectParametersForExercises(String muscleGroupInputText, String recordTypeInputText) {
        log.info("Select Muscle group");
        Select selectMuscleGroup = new Select(driver.findElement(ProfilePageConstants.MUSCLE_GROUP));
        selectMuscleGroup.selectByVisibleText(muscleGroupInputText);
        log.info("Select Record type");
        Select selectRecordType = new Select(driver.findElement(ProfilePageConstants.RECORD_TYPE));
        selectRecordType.selectByVisibleText(recordTypeInputText);
    }

    public void clickOnCreateExercise() {
        log.info("Click button Create exercises");
        driver.findElement(ProfilePageConstants.CREATE_EXERCISE).click();
    }

    public String getTextMuscleGroup() {
        log.info("Get text name Muscle group");
        WebElement elementMonth = driver.findElement(ProfilePageConstants.TEXT_MUSCLE_GROUP);
        return elementMonth.getText();
    }

    public String getTextNameExercise() {
        log.info("Get name exercise");
        WebElement elementMonth = driver.findElement(ProfilePageConstants.TEXT_NAME_EXERCISE);
        return elementMonth.getText();
    }

    public void clickOnMyRoutines() {
        log.info("Click button My Routines");
        driver.findElement(ProfilePageConstants.MY_ROUTINES).click();
    }

    public void clickOnCreateNewRoutine() {
        log.info("Click button Create new routine");
        driver.findElement(ProfilePageConstants.CREATE_NEW_ROUTINE).click();
    }

    public void sendTextRoutineName(String routineNameInputText) {
        log.info("Send text Routine name");
        driver.findElement(ProfilePageConstants.NAME_ROUTINE).sendKeys(routineNameInputText);
    }

    public void selectParametersForRoutine(String frequencyInputParameter, String dateTypeInputParameter, String typeInputParameter, String difficultyInputParameter) {
        log.info("Select Frequency");
        Select selectFrequency = new Select(driver.findElement(ProfilePageConstants.FREQUENCY_INPUT));
        selectFrequency.selectByVisibleText(frequencyInputParameter);
        log.info("Select Date Type");
        Select selectDateType = new Select(driver.findElement(ProfilePageConstants.DATA_TYPE_INPUT));
        selectDateType.selectByVisibleText(dateTypeInputParameter);
        log.info("Select Type");
        Select selectType = new Select(driver.findElement(ProfilePageConstants.TYPE_INPUT));
        selectType.selectByVisibleText(typeInputParameter);
        log.info("Select Difficulty");
        Select selectDifficulty = new Select(driver.findElement(ProfilePageConstants.DIFFICULTY_INPUT));
        selectDifficulty.selectByVisibleText(difficultyInputParameter);
    }

    public void sendTextDescription(String descriptionInputKeys) {
        log.info("Send text Description");
        driver.findElement(ProfilePageConstants.DESCRIPTION).sendKeys(descriptionInputKeys);
    }

    public void sendTextTags(String tagInpuText) {
        log.info("Send text Tags");
        driver.findElement(ProfilePageConstants.TAGS).sendKeys(tagInpuText);
    }

    public void clickOnSaveButton() {
        log.info("Click save button");
        WebElement saveButton = driver.findElement(ProfilePageConstants.SAVE_BUTTON);
        scrollToElement(saveButton);
        saveButton.click();
    }

    public void clickFirstRoutine() {
        log.info("Click routine");
        driver.findElement(ProfilePageConstants.FIRST_ROUTINE).click();
    }

    public String getTextFrequency() {
        log.info("Get text frequency");
        WebElement frequency = driver.findElement(ProfilePageConstants.FREQUENCY);
        return frequency.getText();
    }

    public String getTextType() {
        log.info("Get text type");
        WebElement type = driver.findElement(ProfilePageConstants.TYPE);
        return type.getText();
    }

    public String getTextName() {
        log.info("Get text name");
        WebElement name = driver.findElement(ProfilePageConstants.NAME);
        return name.getText();
    }

    public String getTextDescription() {
        log.info("Get text description");
        WebElement desc = driver.findElement(ProfilePageConstants.DESCRIPTION_TEXT);
        return desc.getText();
    }

    public void waitAppMenu() {
        log.info("Wait app menu");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProfilePageConstants.APP_MENU));
    }

    public void clickFriendsButton() {
        log.info("Click button friends");
        driver.findElement(ProfilePageConstants.FRIENDS).click();
    }

    public void clickSearchFriendsButton() {
        log.info("Click search friends");
        driver.findElement(ProfilePageConstants.SEARCH_FRIENDS_BUTTON).click();
    }

    public void sentTextNameForSearch(String NAME_FRIEND_INPUT) {
        log.info("Sent text user name for search");
        Faker fakerUserName = new Faker();
        String firstName = fakerUserName.name().firstName();
        driver.findElement(ProfilePageConstants.SEARCH_FRIENDS_FIELD).sendKeys(firstName);
    }

    public void clickSearchButton() {
        log.info("Click search button");
        driver.findElement(ProfilePageConstants.SEARCH_BUTTON).click();
    }

    public String getTextFriendName() {
        log.info("Get friend name");
        WebElement name = driver.findElement(ProfilePageConstants.FRIEND_NAME);
        return name.getText();
    }

    public void clickAddButton() {
        log.info("Click add button");
        driver.findElement(ProfilePageConstants.ADD_BUTTON).click();
    }

    public void clickFriendName() {
        log.info("Click friend name");
        driver.findElement(ProfilePageConstants.FRIEND_NAME).click();
    }

    public String getTextFriendRequest() {
        log.info("Get text request");
        WebElement request = driver.findElement(ProfilePageConstants.FRIEND_REQUEST_SENT);
        return request.getText();
    }

    public void clickAppMenu() {
        log.info("Click on My JeFit");
        driver.findElement(ProfilePageConstants.APP_MENU).click();
    }

    public void sentTextStatus(String statusInpuText) {
        log.info("Send text status");
        driver.findElement(ProfilePageConstants.TEXT_AREA).sendKeys(statusInpuText);
    }

    public void clickPostButton() {
        log.info("Click post button");
        driver.findElement(ProfilePageConstants.POST_BUTTON).click();
    }

    public String getTextCurrentStatus() {
        log.info("Get text status");
        WebElement text = driver.findElement(ProfilePageConstants.TEXT_STATUS);
        return text.getText();
    }

    public void clickLogWorkoutButton() {
        log.info("click Log workout button");
        driver.findElement(ProfilePageConstants.LOG_WORKOUT).click();
    }

    public void clickButtonAddNote() {
        log.info("Click add note");
        driver.findElement(ProfilePageConstants.ADD_BUTTON_NOTE).click();
    }

    public void sentTextNote(String noteInputKeys) {
        log.info("Sent text note");
        driver.findElement(ProfilePageConstants.NOTE_FIELD).sendKeys(noteInputKeys);
    }

    public void clickButtonCreateNote() {
        log.info("Click button create note");
        driver.findElement(ProfilePageConstants.CREATE_NOTE_BUTTON).click();
    }

    public String getTextNote() {
        log.info("Get text note");
        WebElement note = driver.findElement(ProfilePageConstants.NOTE);
        return note.getText();
    }

    public void clickButtonAddBodyStatus() {
        log.info("Click button add body status");
        driver.findElement(ProfilePageConstants.ADD_BUTTON_BODY_STATUS).click();
    }

    public void sendValueBodyParameters(String weightInputKeys, String hieghtInputKeys) {
        log.info("Send value weight");
        driver.findElement(ProfilePageConstants.WEIGHT).clear();
        driver.findElement(ProfilePageConstants.WEIGHT).sendKeys(weightInputKeys);
        log.info("Send value height");
        driver.findElement(ProfilePageConstants.HEIGHT).clear();
        driver.findElement(ProfilePageConstants.HEIGHT).sendKeys(hieghtInputKeys);
    }

    public void clickButtonDone() {
        log.info("Click button Done");
        driver.findElement(ProfilePageConstants.DONE_BUTTON).click();
    }

    public void clickButtonDoneAndWaitUntilPopupDisappear() {
        clickButtonDone();
        wainUntilElementWillBeHiddenOnPageByLocator(ProfilePageConstants.EDIT_BODY_STATUS_POPUP, 5);
    }

    public String getTextWeight() {
        log.info("Get text weight");
        WebElement note = driver.findElement(ProfilePageConstants.WEIGHT_VALUE);
        return note.getText();
    }

    public String getTextHeight() {
        log.info("Get text height");
        WebElement note = driver.findElement(ProfilePageConstants.HEIGHT_VALUE);
        return note.getText();
    }

    public void cleanFieldName() {
        log.info("Clean field exercise name");
        driver.findElement(ProfilePageConstants.EXERCISE_NAME).clear();
    }

    public String getTextCustomExercises() {
        log.info("Get text walk exercises");
        WebElement note = driver.findElement(ProfilePageConstants.WALK_CUSTOM_EXERCISES);
        return note.getText();
    }

    public String getTextDeleteCustomExercises() {
        log.info("Get text after deleting ");
        WebElement space = driver.findElement(ProfilePageConstants.DELETE_CUSTOM_EXERCISE);
        return space.getText();
    }

}
