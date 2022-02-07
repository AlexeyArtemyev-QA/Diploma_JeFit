package JeFit.Test;

import JeFit.Page.ExercisesPage;
import io.qameta.allure.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

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
    public void searchTestOne() {
        exercisesPage.checkBoxSearchBodyOnly();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
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
    public void searchTestTwo() {
        exercisesPage.checkBoxSearchAll();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        exercisesPage.checkBoxSearchStretching();
        exercisesPage.checkBoxSearchIntermediate();
        exercisesPage.clickSearchButton();
        int sizeStretching = exercisesPage.resultArrayStretching();
        Assert.assertEquals(sizeStretching, EXERCISE_RESULT_ARRAY);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - machine cardio, type - powerlifting, difficulty - expert", invocationCount = 1, threadPoolSize = 1)
    public void searchTestThree() {
        exercisesPage.checkBoxSearchMachineCardio();
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        exercisesPage.checkBoxSearchPowerlifting();
        exercisesPage.checkBoxSearchExpert();
        exercisesPage.clickSearchButton();
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, retryAnalyzer = JeFit.Test.Retry.class, description = "Exercise Search with parameters: equipment - weight plat, type - olympic, difficulty - expert", invocationCount = 1, threadPoolSize = 1)
    public void searchTestFour() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        exercisesPage.checkBoxSearchWeightPlate();
        exercisesPage.checkBoxSearchOlympic();
        exercisesPage.checkBoxSearchExpert();
        exercisesPage.clickSearchButton();
    }

    // Exercise Database
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Glutes", invocationCount = 1, threadPoolSize = 1)
    public void searchTestFive() {
        exercisesPage.clickDataBaseGlutes();
        String result = driver.findElement(GLUTES_DATABASE_RESULT).getText();
        Assert.assertEquals(result, GLUTES);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Biceps", invocationCount = 1, threadPoolSize = 1)
    public void searchTestSix() {
        exercisesPage.clickDataBaseBiceps();
        String result = driver.findElement(BICEPS_DATABASE_RESULT).getText();
        Assert.assertEquals(result, BICEPS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "Exercise Database. Shoulders", invocationCount = 1, threadPoolSize = 1)
    public void searchTestSeven() {
        exercisesPage.clickDataBaseShoulders();
        String result = driver.findElement(SHOULDERS_DATABASE_RESULT).getText();
        Assert.assertEquals(result, SHOULDERS);
    }

    // Picture
    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchTestEight() {
        exercisesPage.clickPictureTriceps();
        String result = driver.findElement(PICTURE_RESULT).getText();
        Assert.assertEquals(result, TRICEPS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchTestNine() {
        exercisesPage.clickPictureChest();
        String result = driver.findElement(PICTURE_RESULT).getText();
        Assert.assertEquals(result, CHEST);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchTestTen() {
        exercisesPage.clickPictureAbs();
        String result = driver.findElement(PICTURE_RESULT).getText();
        Assert.assertEquals(result, ABS);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchTestEleven() {
        exercisesPage.clickPictureBack();
        String result = driver.findElement(PICTURE_RESULT).getText();
        Assert.assertEquals(result, BACK);
    }

    @Link("https://www.jefit.com/exercises/")
    @Test(alwaysRun = true, description = "", invocationCount = 1, threadPoolSize = 1)
    public void searchTestTwelve() {
        exercisesPage.clickPictureLowerLegs();
        String result = driver.findElement(PICTURE_RESULT).getText();
        Assert.assertEquals(result, LOWER_LEGS_RESULT);
    }
}
