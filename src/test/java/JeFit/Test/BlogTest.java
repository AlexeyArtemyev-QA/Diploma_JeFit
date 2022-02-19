package JeFit.Test;

import JeFit.Page.BlogPage;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Log4j2
public class BlogTest extends BaseTest {

    private final static int EXPECTED_LENGTH_OF_TIPS = 9;
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
    public void validateBlogNewsLengthTest() {
        Assert.assertEquals(blogPage.getBlogNewsLength(), EXPECTED_LENGTH_OF_TIPS);
    }

    @Test(description = "Check exercise tips length on page")
    public void validateExerciseTipsLengthTest() {
        Assert.assertEquals(blogPage.getExerciseTipsLength(), EXPECTED_LENGTH_OF_TIPS);
    }

    @Test(description = "Check general fitness length on page")
    public void validateGeneralFitnessLengthTest() {
        Assert.assertEquals(blogPage.getGeneralFitnessTipsLength(), EXPECTED_LENGTH_OF_TIPS);
    }

    @Test(description = "Check nutrition length on page")
    public void validateNutritionTipsLengthTest() {
        Assert.assertEquals(blogPage.getNutritionTipsLength(), EXPECTED_LENGTH_OF_TIPS);
    }

    @Test(description = "Check product tips and FAQ length on page")
    public void validateProductTipsAndFAQLengthTest() {
        Assert.assertEquals(blogPage.getProductTipsAndFAQLength(), EXPECTED_LENGTH_OF_TIPS);
    }

    @Test(description = "Check what`s new length on page")
    public void validateWhatsNewLengthTest() {
        Assert.assertEquals(blogPage.getWhatsNewLength(), EXPECTED_LENGTH_OF_TIPS);
    }

    @Test(description = "Check workout tips length on page")
    public void validateWorkoutTipsLengthTest() {
        Assert.assertEquals(blogPage.getWorkoutTipsLength(), EXPECTED_LENGTH_OF_TIPS);
    }
}
