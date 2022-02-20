package JeFit.Test;

import JeFit.Page.ProfilePage;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Log4j2
public class ProfileTest extends BaseTest {

    private final static String JEFIT_PROFILE_URL = "https://www.jefit.com/my-jefit/profile/";
    private final static String USERNAME = "User_1QA";
    private final static String PASSWORD = "Test_pass0";
    private final static String EXPECTED_RESULT_MONTH = "October";
    private final static String EXPECTED_RESULT_DATE = "18";
    private final static String EXPECTED_RESULT_YEAR = "1996";
    private final static String EXPECTED_RESULT_MUSCLE = "Cardio";
    private final static String EXPECTED_RESULT_NAME_EXERCISE = "Run";
    private final static String EXPECTED_RESULT_FREQUENCY = "Frequency: 4 days / week";
    private final static String EXPECTED_RESULT_TYPE = "Type: Sport Specific";
    private final static String EXPECTED_RESULT_NAME = "The first routine";
    private final static String EXPECTED_DESCRIPTION = "My first description";
    private final static String EXPECTED_FRIEND_NAME = "Alex 13";
    private final static String EXPECTED_REQUEST_SENT = "Friend Request Sent";
    private final static String EXPECTED_STATUS = "Status: My first status";
    private final static String EXPECTED_NOTE = "Note : My first note";
    private final static String WEIGHT_INPUT = "78";
    private final static String HEIGHT_INPUT = "175";
    private final static String MUSCLE_GROUP_INPUT = "Cardio";
    private final static String RECORD_TYPE_INPUT = "Cardio";
    private final static String EXERCISE_NAME_INPUT = "Run";
    private final static String MONTH_INPUT = "October";
    private final static String DAY_INPUT = "18";
    private final static String YEAR_INPUT = "1996";
    private final static String TEXT_ROUTINE_NAME_INPUT = "The first routine";
    private final static String FREQUENCY_PARAMETER_INPUT = "4 day(s) / week";
    private final static String DATE_TYPE_PARAMETER_INPUT = "Numerical - E.g., Day1, Day2...";
    private final static String TYPE_PARAMETER_INPUT = "Sport Specific";
    private final static String DIFFICULTY_PARAMETER_INPUT = "Intermediate - experience >6 and <24 months";
    private final static String DESCRIPTION_INPUT = "My first description";
    private final static String TAG_INPUT = "My first tag";
    private final static String NAME_FRIEND_INPUT = "Alex 13";
    private final static String STATUS_INPUT = "My first status";
    private final static String NOTE_INPUT = "My first note";
    private final static String EXPECTED_HEIGHT = "Height : 175  inches";
    private final static String EXPECTED_WEIGHT = "Weight : 78  lbs";

    @BeforeMethod(alwaysRun = true)
    public void navigateToProfilePage() {
        profilePage = new ProfilePage(driver);
        driver.get(JEFIT_PROFILE_URL);
        profilePage.enterUserName(USERNAME);
        profilePage.enterPassword(PASSWORD);
        profilePage.checkBoxIsSelected();
        profilePage.clickLogin();
        driver.get(JEFIT_PROFILE_URL);
    }

    @AfterMethod(alwaysRun = true)
    @Description("Close browser")
    public void signOut() {
        profilePage.moveToElementMenu();
        profilePage.clickButtonSignOut();
    }

    @Test(description = "Check is profile can be editable with minimum range value")
    public void profilePositiveModifyDataTestVersionOne() {
        profilePage.selectDateFromMinimumValueInRange(MONTH_INPUT, DAY_INPUT, YEAR_INPUT);
        profilePage.selectKgCm();
        profilePage.selectGenderMan();
        profilePage.clickSavedButton();
        profilePage.moveToElementMenu();
        profilePage.waitAppMenu();
        profilePage.clickButtonSetting();

        Assert.assertEquals(profilePage.getTextMonth(), EXPECTED_RESULT_MONTH);
        Assert.assertEquals(profilePage.getTextDate(), EXPECTED_RESULT_DATE);
        Assert.assertEquals(profilePage.getTextYear(), EXPECTED_RESULT_YEAR);
        Assert.assertTrue(profilePage.isSelectedCheckBoxKgCm());
        Assert.assertTrue(profilePage.isSelectedCheckBoxSex());
    }

    @Test(description = "Check to create my custom exercise")
    public void validateCreatingMyExercisesTest() {
        profilePage.clickOnMyCustomExercises();
        profilePage.sendTextExerciseName(EXERCISE_NAME_INPUT);
        profilePage.selectParametersForExercises(MUSCLE_GROUP_INPUT, RECORD_TYPE_INPUT);
        profilePage.clickOnCreateExercise();

        Assert.assertEquals(profilePage.getTextMuscleGroup(), EXPECTED_RESULT_MUSCLE);
        Assert.assertEquals(profilePage.getTextNameExercise(), EXPECTED_RESULT_NAME_EXERCISE);
    }

    @Test(description = "Check to create my routines")
    public void validateCreatingRoutineTest() {
        profilePage.clickOnMyRoutines();
        profilePage.clickOnCreateNewRoutine();
        profilePage.sendTextRoutineName(TEXT_ROUTINE_NAME_INPUT);
        profilePage.selectParametersForRoutine(FREQUENCY_PARAMETER_INPUT, DATE_TYPE_PARAMETER_INPUT, TYPE_PARAMETER_INPUT, DIFFICULTY_PARAMETER_INPUT);
        profilePage.sendTextDescription(DESCRIPTION_INPUT);
        profilePage.sendTextTags(TAG_INPUT);
        profilePage.clickOnSaveButton();
        profilePage.clickFirstRoutine();

        Assert.assertEquals(profilePage.getTextFrequency(), EXPECTED_RESULT_FREQUENCY);
        Assert.assertEquals(profilePage.getTextType(), EXPECTED_RESULT_TYPE);
        Assert.assertEquals(profilePage.getTextName(), EXPECTED_RESULT_NAME);
        Assert.assertEquals(profilePage.getTextDescription(), EXPECTED_DESCRIPTION);
    }

    @Test(description = "Check to create my routines")
    public void validateAddingFriendTest() {
        profilePage.moveToElementMenu();
        profilePage.clickFriendsButton();
        profilePage.clickSearchFriendsButton();
        profilePage.sentTextNameForSearch(NAME_FRIEND_INPUT);
        profilePage.clickSearchButton();
        Assert.assertEquals(profilePage.getTextFriendName(), EXPECTED_FRIEND_NAME);
        //profilePage.clickAddButton();
        profilePage.clickFriendName();

        Assert.assertEquals(profilePage.getTextFriendRequest(), EXPECTED_REQUEST_SENT);
    }

    @Test(description = "")
    public void validateSavingNoteTest() {
        profilePage.clickAppMenu();
        profilePage.sentTextStatus(STATUS_INPUT);
        profilePage.clickPostButton();

        Assert.assertEquals(profilePage.getTextCurrentStatus(), EXPECTED_STATUS);
    }

    @Test(description = "")
    public void validateNoteSavingTest() {
        profilePage.clickAppMenu();
        profilePage.clickLogWorkoutButton();
        profilePage.clickButtonAddNote();
        profilePage.sentTextNote(NOTE_INPUT);
        profilePage.clickButtonCreateNote();

        Assert.assertEquals(profilePage.getTextNote(), EXPECTED_NOTE);
    }

    @Test(description = "")
    public void validateBodyStatusSavingTest() {
        profilePage.clickAppMenu();
        profilePage.clickLogWorkoutButton();
        profilePage.clickButtonAddBodyStatus();
        profilePage.sendValueBodyParameters(WEIGHT_INPUT, HEIGHT_INPUT);
        profilePage.clickButtonDoneAndWaitUntilPopupDisappear();

        Assert.assertEquals(profilePage.getTextWeight(), EXPECTED_WEIGHT);
        Assert.assertEquals(profilePage.getTextHeight(), EXPECTED_HEIGHT);
    }

}
