package JeFit.Test;

import JeFit.Page.BlogPage;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Log4j2
public class BlogTest extends BaseTest {

    private final static int EXPECTED_RESULT = 9;
    private final static String URL_BLOG = "https://www.jefit.com/blog";

    @BeforeTest(alwaysRun = true)
    public void navigateToBlogPage() {
        blogPage = new BlogPage(driver);
        driver.get(URL_BLOG);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Test(description = "Check blog news length on page")
    public void validateBlogsNewsLengthTest() {
        blogPage.selectAll();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }

    @Test(description = "Check exercise tips length on page")
    public void validateExerciseTipsLengthTest() {
        blogPage.selectExerciseTips();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }

    @Test(description = "Check general fitness length on page")
    public void validateGeneralFitnessLengthTest() {
        blogPage.selectGeneralFitness();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }

    @Test(description = "Check nutrition length on page")
    public void validateNutritionTipsLengthTest() {
        blogPage.selectNutritionTips();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }

    @Test(description = "Check product tips and FAQ length on page")
    public void validateProductTipsAndFAQLengthTest() {
        blogPage.selectProductTipsAndFAQ();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }

    @Test(description = "Check what`s new length on page")
    public void validateWhatsNewLengthTest() {
        blogPage.selectWhatsNew();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }

    @Test(description = "Check workout tips length on page")
    public void validateWorkoutTipsLengthTest() {
        blogPage.selectWorkoutTips();
        Assert.assertEquals(blogPage.getTopicSize(), EXPECTED_RESULT);
    }
}
