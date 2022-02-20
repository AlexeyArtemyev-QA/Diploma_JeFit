package JeFit.Test;

import JeFit.Page.ExercisesPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExercisesTest extends BaseTest {

    private final static String URL_LOGIN = "https://www.jefit.com/login/";
    private final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";
    private final static String USERNAME = "User_1QA";
    private final static String PASSWORD = "Test_pass0";
    private static final String URL_EXERCISES = "https://www.jefit.com/exercises/";
    private static final int EXERCISE_RESULT_ARRAY = 10;
    private static final String EXERCISE_RESULT_TEXT = "No result found!";
    private final static String GLUTES = "Glutes Exercise Database";
    private final static String BICEPS = "Biceps Exercise Database";
    private final static String SHOULDERS = "Shoulders Exercise Database";
    private final static String TRICEPS = "Triceps Exercise Database";
    private final static String CHEST = "Chest Exercise Database";
    private final static String ABS = "Abs Exercise Database";
    private final static String BACK = "Back Exercise Database";
    private final static String LOWER_LEGS_RESULT = "Lower-Legs Exercise Database";
    private final static String EXPECTED_MESSAGE = "This routine has been downloaded to your account. Please click the sync button from your device.";
    private final static String EXPECTED_NAME_WORKOUT = "Posterior Chain Workout";

    private final static String TEXT_EXERCISES_INPUT = "Posterior Chain Workout";

    @BeforeMethod(alwaysRun = true)
    public void navigateToLoginPage() {
        exercisesPage = new ExercisesPage(driver);
        driver.get(URL_LOGIN);
        exercisesPage.enterUserName(USERNAME);
        exercisesPage.enterPassword(PASSWORD);
        exercisesPage.isCookieCheckboxSelected();
        exercisesPage.selectLogin();
        driver.get(URL_EXERCISES);
    }

    @AfterMethod(alwaysRun = true)
    @Description("Close browser")
    public void signOut() {
        exercisesPage.moveToElementMenu();
        exercisesPage.clickButtonSignOut();
    }

    // Exercise Search
    @Test(retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - body only, type - strength, difficulty - beginner")
    public void searchExerciseWithParametersBodyOnlyStrengthBeginnerTest() {
        exercisesPage.selectCheckBoxBodyOnly();
        exercisesPage.selectCheckBoxStrength();
        exercisesPage.selectCheckBoxBeginner();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getSizeArrayBodyOnly(), EXERCISE_RESULT_ARRAY);
        Assert.assertEquals(exercisesPage.getSizeArrayStrength(), EXERCISE_RESULT_ARRAY);
    }

    @Test(retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - all, type - stretching, difficulty - intermediate")
    public void searchExerciseWithParametersAllStretchingIntermediateTest() {
        exercisesPage.selectCheckBoxAllPage();
        exercisesPage.selectCheckBoxStretching();
        exercisesPage.selectCheckBoxIntermediate();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getSizeArrayStretching(), EXERCISE_RESULT_ARRAY);
    }

    @Test(retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - machine cardio, type - powerlifting, difficulty - expert")
    public void searchExerciseWithParametersMachineCardioPowerliftingExpertTest() {
        exercisesPage.selectCheckBoxMachineCardio();
        exercisesPage.selectCheckBoxPowerlifting();
        exercisesPage.selectCheckBoxExpert();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getTextResult(), EXERCISE_RESULT_TEXT);
    }

    @Test(retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - weight plat, type - olympic, difficulty - expert")
    public void searchExerciseWithParametersWeightPlateOlympicExpertTest() {
        exercisesPage.selectCheckBoxWeightPlate();
        exercisesPage.selectCheckBoxOlympic();
        exercisesPage.selectCheckBoxExpert();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getTextResult(), EXERCISE_RESULT_TEXT);
    }

    // Exercise Database
    @Test(description = "Exercise Database. Glutes")
    public void searchDataBaseGlutesTest() {
        String result = exercisesPage.getTextDataBaseGlutes();
        Assert.assertEquals(result, GLUTES);
    }

    @Test(description = "Exercise Database. Biceps")
    public void searchDataBaseBicepsTest() {
        Assert.assertEquals(exercisesPage.getTextDataBaseBiceps(), BICEPS);
    }

    @Test(description = "Exercise Database. Shoulders")
    public void searchDataBaseShouldersTest() {
        Assert.assertEquals(exercisesPage.getTextDataBaseShoulders(), SHOULDERS);
    }

    // Picture
    @Test(description = "Picture. Triceps")
    public void searchPictureTricepsTest() {
        Assert.assertEquals(exercisesPage.getTextPictureTriceps(), TRICEPS);
    }

    @Test(description = "Picture. Chest")
    public void searchPictureChestTest() {
        Assert.assertEquals(exercisesPage.getTextPictureChest(), CHEST);
    }

    @Test(description = "Picture. Abs")
    public void searchPictureAbsTest() {
        Assert.assertEquals(exercisesPage.getTextPictureAbs(), ABS);
    }

    @Test(description = "Picture. Back")
    public void searchPictureBackTest() {
        Assert.assertEquals(exercisesPage.getTextPictureBack(), BACK);
    }

    @Test(description = "Picture. Lower-legs")
    public void searchPictureLowerLegsTest() {
        Assert.assertEquals(exercisesPage.getTextPictureLowerLegs(), LOWER_LEGS_RESULT);
    }

    @Test(description = "")
    public void addingExerciseToTheProfileTest() {
        exercisesPage.clickOnWorkoutPlansButton();
        exercisesPage.sentTextExercises(TEXT_EXERCISES_INPUT);
        exercisesPage.clickSearchExercisesButton();
        exercisesPage.clickOnExercises();
        exercisesPage.clickOnSaveOnMyWorkouts();
        Assert.assertEquals(exercisesPage.getTextMessage(), EXPECTED_MESSAGE);
        exercisesPage.clickOnMyJefit();
        exercisesPage.clickOnMyRoutines();
        Assert.assertEquals(exercisesPage.getTextWorkout(), EXPECTED_NAME_WORKOUT);
    }


}
