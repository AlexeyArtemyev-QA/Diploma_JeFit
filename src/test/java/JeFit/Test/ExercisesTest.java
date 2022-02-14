package JeFit.Test;

import JeFit.Page.ExercisesPage;
import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static JeFit.Page.ExercisesPage.URL_EXERCISES;

public class ExercisesTest extends JeFit.Test.BaseTest {

    public static final int EXERCISE_RESULT_ARRAY = 10;
    public static final String EXERCISE_RESULT_TEXT = "No result found!";
    public final static String GLUTES = "Glutes Exercise Database";
    public final static String BICEPS = "Biceps Exercise Database";
    public final static String SHOULDERS = "Shoulders Exercise Database";
    public final static String TRICEPS = "Triceps Exercise Database";
    public final static String CHEST = "Chest Exercise Database";
    public final static String ABS = "Abs Exercise Database";
    public final static String BACK = "Back Exercise Database";
    public final static String LOWER_LEGS_RESULT = "Lower-Legs Exercise Database";


    @BeforeMethod(alwaysRun = true)
    public void navigateToLoginPage() {
        exercisesPage = new ExercisesPage(driver);
        driver.get(URL_EXERCISES);
    }

    // Exercise Search
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - body only, type - strength, difficulty - beginner")
    public void searchExerciseWithParametersBodyOnlyStrengthBeginnerTest() {
        exercisesPage.scrollIntoView(exercisesPage.getExerciseSearchInputFromBody());
        exercisesPage.selectStrength();
        exercisesPage.selectBeginner();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getSizeArrayBodyOnly(), EXERCISE_RESULT_ARRAY);
        Assert.assertEquals(exercisesPage.getSizeArrayStrength(), EXERCISE_RESULT_ARRAY);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - all, type - stretching, difficulty - intermediate")
    public void searchExerciseWithParametersAllStretchingIntermediateTest() {
        exercisesPage.scrollIntoView(exercisesPage.getExerciseSearchInputFromAllPage());
        exercisesPage.selectStretching();
        exercisesPage.selectIntermediate();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getSizeArrayStretching(), EXERCISE_RESULT_ARRAY);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - machine cardio, type - powerlifting, difficulty - expert")
    public void searchExerciseWithParametersMachineCardioPowerliftingExpertTest() {
        exercisesPage.scrollIntoView(exercisesPage.getExerciseSearchMachineCardio());
        exercisesPage.selectPowerlifting();
        exercisesPage.selectExpert();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getTextResult(), EXERCISE_RESULT_TEXT);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - weight plat, type - olympic, difficulty - expert")
    public void searchExerciseWithParametersWeightPlateOlympicExpertTest() {
        exercisesPage.scrollIntoView(exercisesPage.findButtonExerciseWeightPlate());
        exercisesPage.selectOlympic();
        exercisesPage.selectExpert();
        exercisesPage.clickSearchButton();
        Assert.assertEquals(exercisesPage.getTextResult(), EXERCISE_RESULT_TEXT);
    }

    // Exercise Database
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Glutes")
    public void searchDataBaseGlutesTest() {
        String result = exercisesPage.getTextDataBaseGlutes();
        Assert.assertEquals(result, GLUTES);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Biceps")
    public void searchDataBaseBicepsTest() {
        Assert.assertEquals(exercisesPage.getTextDataBaseBiceps(), BICEPS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Shoulders")
    public void searchDataBaseShouldersTest() {
        Assert.assertEquals(exercisesPage.getTextDataBaseShoulders(), SHOULDERS);
    }

    // Picture
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Picture. Triceps")
    public void searchPictureTricepsTest() {
        Assert.assertEquals(exercisesPage.getTextPictureTriceps(), TRICEPS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Picture. Chest")
    public void searchPictureChestTest() {
        Assert.assertEquals(exercisesPage.getTextPictureChest(), CHEST);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Picture. Abs")
    public void searchPictureAbsTest() {
        Assert.assertEquals(exercisesPage.getTextPictureAbs(), ABS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Picture. Back")
    public void searchPictureBackTest() {
        Assert.assertEquals(exercisesPage.getTextPictureBack(), BACK);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Picture. Lower-legs")
    public void searchPictureLowerLegsTest() {
        Assert.assertEquals(exercisesPage.getTextPictureLowerLegs(), LOWER_LEGS_RESULT);
    }
}
