package JeFit.tests;

import JeFit.pages.LoginPage;
import JeFit.pages.ProfilePage;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Log4j2
public class ProfileTest extends BaseTest {

    private final static String EXPECTED_RESULT_FREQUENCY = "Frequency: 4 days / week";
    private final static String EXPECTED_RESULT_TYPE = "Type: Sport Specific";
    private final static String EXPECTED_REQUEST_SENT = " Friend Request Sent ";
    private final static String EXPECTED_STATUS = "Status: My first status";
    private final static String WEIGHT_INPUT = "78";
    private final static String HEIGHT_INPUT = "175";
    private final static String MUSCLE_GROUP_INPUT = "Cardio";
    private final static String MUSCLE_GROUP_INPUT_EDIT = "Lower Legs";
    private final static String MUSCLE_GROUP_INPUT_EDIT_ABS = "Abs";
    private final static String RECORD_TYPE_INPUT = "Cardio";
    private final static String RECORD_TYPE_INPUT_EDIT = "Weight and Reps";
    private final static String RECORD_TYPE_INPUT_EDIT_REPS_ONLY = "Reps Only";
    private final static String EXERCISE_NAME_INPUT = "Run";
    private final static String EXERCISE_NAME_EDIT_INPUT = "Jump";
    private final static String EXERCISE_NAME_DELETE_INPUT = "Acrobatics";
    private final static String EXERCISE_NAME_EDIT_INPUT_WALK = "Walk";
    private final static String MONTH_INPUT = "October";
    private final static String DAY_INPUT = "18";
    private final static String YEAR_INPUT = "1996";
    private final static String TEXT_ROUTINE_NAME_INPUT = "The first routine";
    private final static String TEXT_ROUTINE_NAME_INPUT_EDIT = "The second routine";
    private final static String TEXT_ROUTINE_NAME_INPUT_REMOVAL = "The third routine";
    private final static String DESCRIPTION_INPUT_EDIT = "My second description";
    private final static String DESCRIPTION_INPUT_REMOVAL = "My third description";
    private final static String TAG_INPUT_EDIT = "My second tag";
    private final static String TAG_INPUT_REMOVAL = "My third tag";
    private final static String FREQUENCY_PARAMETER = "2 day(s) / week";
    private final static String TYPE_PARAMETER = "General Fitness";
    private final static String DATE_TYPE_PARAMETER = "Day of Week - E.g., Monday, Tuesday...";
    private final static String EXPECTED_RESULT_EDIT_FREQUENCY = "Frequency: 2 days / week";
    private final static String EXPECTED_RESULT_EDIT_TYPE = "Type: General Fitness";
    private final static String FREQUENCY_PARAMETER_INPUT = "4 day(s) / week";
    private final static String DATE_TYPE_PARAMETER_INPUT = "Numerical - E.g., Day1, Day2...";
    private final static String TYPE_PARAMETER_INPUT = "Sport Specific";
    private final static String DIFFICULTY_PARAMETER_INPUT = "Intermediate - experience >6 and <24 months";
    private final static String DESCRIPTION_INPUT = "My first description";
    private final static String TAG_INPUT = "My first tag";
    private final static String STATUS_INPUT = "My first status";
    private final static String EXPECTED_HEIGHT = "Height : 175  cm";
    private final static String EXPECTED_WEIGHT = "Weight : 78  kg";
    private final static String EXPECTED_NAME_DELETE = "";
    private final static String EXPECTED_TEXT_REMOVAL_ROUTINE = "You have not setup a default routine yet. Please create one or set one as default routine";

    @BeforeMethod(alwaysRun = true)
    public void loginAndNavigateToProfilePage() {
        profilePage = new ProfilePage(driver);
        loginPage = new LoginPage(driver);
        loginPage.login(USERNAME, PASSWORD);
        profilePage.openPage();
    }

    @AfterMethod(alwaysRun = true)
    @Description("Sign out")
    public void signOut() {
        loginPage.logOut();
    }

    @Test(groups = {"smoke", "regression"},  description = "Check is profile can be editable with minimum range value")
    public void profilePositiveModifyDataTestVersionOne() {
        profilePage.selectDateOfBirth(MONTH_INPUT, DAY_INPUT, YEAR_INPUT);
        profilePage.selectKgCm();
        profilePage.selectGenderMan();
        profilePage.clickSaveButton();
        profilePage.moveToElementMenu();
        profilePage.waitAppMenu();
        profilePage.clickButtonSetting();

        Assert.assertEquals(profilePage.getTextMonth(), MONTH_INPUT);
        Assert.assertEquals(profilePage.getTextDate(), DAY_INPUT);
        Assert.assertEquals(profilePage.getTextYear(), YEAR_INPUT);
        Assert.assertTrue(profilePage.isSelectedCheckBoxKgCm());
        Assert.assertTrue(profilePage.isSelectedCheckBoxSex());
    }

    @Test(groups = {"smoke", "regression"}, description = "Check to create my custom exercise")
    public void validateCreatingMyExercisesTest() {
        profilePage.clickOnMyCustomExercises();
        profilePage.sendTextExerciseName(EXERCISE_NAME_INPUT);
        profilePage.selectParametersForExercises(MUSCLE_GROUP_INPUT, RECORD_TYPE_INPUT);
        profilePage.clickOnCreateExercise();

        Assert.assertEquals(profilePage.getTextMuscleGroup(), MUSCLE_GROUP_INPUT);
        Assert.assertEquals(profilePage.getTextNameExercise(), EXERCISE_NAME_INPUT);
    }

    @Test(groups = {"smoke", "regression"}, description = "Check to create my routines")
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
        Assert.assertEquals(profilePage.getTextName(), TEXT_ROUTINE_NAME_INPUT);
        Assert.assertEquals(profilePage.getTextDescription(), DESCRIPTION_INPUT);
    }

    Faker fakerUserName = new Faker();
    String firstName = fakerUserName.name().firstName();

    @Test(groups = {"regression"}, description = "Check to create my routines")
    public void validateAddingFriendTest() {
        profilePage.moveToElementMenu();
        profilePage.clickFriendsButton();
        profilePage.clickSearchFriendsButton();
        profilePage.sentTextNameForSearch(firstName);
        profilePage.clickSearchButton();
        profilePage.clickAddButton();

        Assert.assertEquals(profilePage.getTextFriendRequest(), EXPECTED_REQUEST_SENT);
    }

    @Test(groups = {"regression"}, alwaysRun = true)
    public void validateSavingStatusTest() {
        profilePage.clickAppMenu();
        profilePage.sentTextStatus(STATUS_INPUT);
        profilePage.clickPostButton();

        Assert.assertEquals(profilePage.getTextCurrentStatus(), EXPECTED_STATUS);
    }

    @Test(groups = {"regression"})
    public void validateBodyStatusSavingTest() {
        profilePage.clickAppMenu();
        profilePage.clickLogWorkoutButton();
        profilePage.clickButtonAddBodyStatus();
        profilePage.sendValueBodyParameters(WEIGHT_INPUT, HEIGHT_INPUT);
        profilePage.clickButtonDoneAndWaitUntilPopupDisappear();

        Assert.assertEquals(profilePage.getTextWeight(), EXPECTED_WEIGHT);
        Assert.assertEquals(profilePage.getTextHeight(), EXPECTED_HEIGHT);
    }

    @Test(groups = {"smoke", "regression"})
    public void validateEditingRoutineTest() {
        profilePage.clickOnMyRoutines();
        profilePage.clickOnCreateNewRoutine();
        profilePage.sendTextRoutineName(TEXT_ROUTINE_NAME_INPUT_EDIT);
        profilePage.selectParametersForRoutine(FREQUENCY_PARAMETER_INPUT, DATE_TYPE_PARAMETER_INPUT, TYPE_PARAMETER_INPUT, DIFFICULTY_PARAMETER_INPUT);
        profilePage.sendTextDescription(DESCRIPTION_INPUT_EDIT);
        profilePage.sendTextTags(TAG_INPUT_EDIT);
        profilePage.clickOnSaveButton();
        profilePage.clickRoutineSecond();
        profilePage.clickEditRoutine();
        profilePage.selectParametersForRoutine(FREQUENCY_PARAMETER, DATE_TYPE_PARAMETER, TYPE_PARAMETER, DIFFICULTY_PARAMETER_INPUT);
        profilePage.clickOnSaveButton();
        profilePage.clickRoutineSecond();

        Assert.assertEquals(profilePage.getTextEditFrequency(), EXPECTED_RESULT_EDIT_FREQUENCY);
        Assert.assertEquals(profilePage.getTextEditType(), EXPECTED_RESULT_EDIT_TYPE);
    }

    @Test(groups = {"smoke", "regression"})
    public void validateRemovalRoutineTest() {
        profilePage.clickOnMyRoutines();
        profilePage.clickOnCreateNewRoutine();
        profilePage.sendTextRoutineName(TEXT_ROUTINE_NAME_INPUT_REMOVAL);
        profilePage.selectParametersForRoutine(FREQUENCY_PARAMETER_INPUT, DATE_TYPE_PARAMETER_INPUT, TYPE_PARAMETER_INPUT, DIFFICULTY_PARAMETER_INPUT);
        profilePage.sendTextDescription(DESCRIPTION_INPUT_REMOVAL);
        profilePage.sendTextTags(TAG_INPUT_REMOVAL);
        profilePage.clickOnSaveButton();
        profilePage.clickDeleteButtonAndAcceptConfirmationAlert();

        Assert.assertEquals(profilePage.getTextSuccessfulRemoval(), EXPECTED_TEXT_REMOVAL_ROUTINE);
    }

    @Test(groups = {"smoke", "regression"})
    public void validateEditingMyExercisesTest() {
        profilePage.clickOnMyCustomExercises();
        profilePage.sendTextExerciseName(EXERCISE_NAME_EDIT_INPUT);
        profilePage.selectParametersForExercises(MUSCLE_GROUP_INPUT_EDIT, RECORD_TYPE_INPUT_EDIT);
        profilePage.clickOnCreateExercise();
        profilePage.clickEditButton();
        profilePage.cleanFieldName();
        profilePage.sendTextExerciseName(EXERCISE_NAME_EDIT_INPUT_WALK);
        profilePage.selectParametersForExercises(MUSCLE_GROUP_INPUT_EDIT_ABS, RECORD_TYPE_INPUT_EDIT_REPS_ONLY);
        profilePage.clickOnCreateExercise();

        Assert.assertEquals(profilePage.getTextCustomExercises(), EXERCISE_NAME_EDIT_INPUT_WALK);
    }

    @Test(groups = {"smoke", "regression"})
    public void validateDeletingMyExercisesTest() {
        profilePage.clickOnMyCustomExercises();
        profilePage.sendTextExerciseName(EXERCISE_NAME_DELETE_INPUT);
        profilePage.selectParametersForExercises(MUSCLE_GROUP_INPUT_EDIT, RECORD_TYPE_INPUT_EDIT);
        profilePage.clickOnCreateExercise();
        profilePage.clickDeleteButtonCustomExercises();

        Assert.assertEquals(profilePage.getTextDeleteCustomExercises(), EXPECTED_NAME_DELETE);
    }
}
