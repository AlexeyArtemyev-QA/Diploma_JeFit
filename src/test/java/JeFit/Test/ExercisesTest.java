package JeFit.Test;

import JeFit.Page.ExercisesPage;
import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static JeFit.Page.ExercisesPage.*;

public class ExercisesTest extends JeFit.Test.BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void navigateToLoginPage() {
        exercisesPage = new ExercisesPage(driver);
        driver.get(URL_EXERCISES);
    }

    // Exercise Search
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - body only, type - strength, difficulty - beginner", invocationCount = 1, threadPoolSize = 1)
    public void searchExerciseWithParametersBodyOnlyStrengthBeginnerTest() {
        exercisesPage.checkBoxSearchBodyOnly();
        exercisesPage.scrollPage();
        exercisesPage.checkBoxSearchStrength();
        exercisesPage.checkBoxSearchBeginner();
        exercisesPage.clickSearchButton();
        int sizeBodyOnly = exercisesPage.resultArrayBodyOnly();
        Assert.assertEquals(sizeBodyOnly, EXERCISE_RESULT_ARRAY);
        int sizeStrength = exercisesPage.resultArrayStrength();
        Assert.assertEquals(sizeStrength, EXERCISE_RESULT_ARRAY);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - all, type - stretching, difficulty - intermediate", invocationCount = 1, threadPoolSize = 1)
    public void searchExerciseWithParametersAllStretchingIntermediateTest() {
        exercisesPage.checkBoxSearchAll();
        exercisesPage.scrollPage();
        exercisesPage.checkBoxSearchStretching();
        exercisesPage.checkBoxSearchIntermediate();
        exercisesPage.clickSearchButton();
        int sizeStretching = exercisesPage.resultArrayStretching();
        Assert.assertEquals(sizeStretching, EXERCISE_RESULT_ARRAY);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - machine cardio, type - powerlifting, difficulty - expert", invocationCount = 1, threadPoolSize = 1)
    public void searchExerciseWithParametersMachineCardioPowerliftingExpertTest() {
        exercisesPage.checkBoxSearchMachineCardio();
        exercisesPage.scrollPageTwo();
        exercisesPage.checkBoxSearchPowerlifting();
        exercisesPage.checkBoxSearchExpert();
        exercisesPage.clickSearchButton();
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - weight plat, type - olympic, difficulty - expert", invocationCount = 1, threadPoolSize = 1)
    public void searchExerciseWithParametersWeightPlateOlympicExpertTest() {
        exercisesPage.scrollPageTwo();
        exercisesPage.checkBoxSearchWeightPlate();
        exercisesPage.checkBoxSearchOlympic();
        exercisesPage.checkBoxSearchExpert();
        exercisesPage.clickSearchButton();
    }

    // Exercise Database
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Glutes", invocationCount = 1, threadPoolSize = 1)
    public void searchDataBaseGlutesTest() {
        exercisesPage.clickDataBaseGlutes();
        String result = exercisesPage.clickDataBaseGlutes();
        Assert.assertEquals(result, GLUTES);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Biceps", invocationCount = 1, threadPoolSize = 1)
    public void searchDataBaseBicepsTest() {
        exercisesPage.clickDataBaseBiceps();
        String result = exercisesPage.clickDataBaseBiceps();
        Assert.assertEquals(result, BICEPS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Shoulders", invocationCount = 1, threadPoolSize = 1)
    public void searchDataBaseShouldersTest() {
        exercisesPage.clickDataBaseShoulders();
        String result = exercisesPage.clickDataBaseShoulders();
        Assert.assertEquals(result, SHOULDERS);
    }

    // Picture
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchPictureTricepsTest() {
        String result = exercisesPage.clickPictureTriceps();
        Assert.assertEquals(result, TRICEPS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchPictureChestTest() {
        String result = exercisesPage.clickPictureChest();
        Assert.assertEquals(result, CHEST);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchPictureAbsTest() {
        String result = exercisesPage.clickPictureAbs();
        Assert.assertEquals(result, ABS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchPictureBackTest() {
        String result = exercisesPage.clickPictureBack();
        Assert.assertEquals(result, BACK);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchPictureLowerLegsTest() {
        String result = exercisesPage.clickPictureLowerLegs();
        Assert.assertEquals(result, LOWER_LEGS_RESULT);
    }
}
