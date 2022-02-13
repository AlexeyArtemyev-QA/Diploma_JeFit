package JeFit.Test;

import JeFit.Page.BlogPage;
import io.qameta.allure.Link;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static JeFit.Page.BlogPage.URL_BLOG;

@Log4j2
public class BlogTest extends BaseTest {

    public final static int RESULT = 9;

    @BeforeTest(alwaysRun = true)
    public void navigateToLoginPage() {
        blogPage = new BlogPage(driver);
        driver.get(URL_BLOG);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogAll() {
        blogPage.selectAll();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogExerciseTips() {
        blogPage.selectExerciseTips();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogGeneralFitness() {
        blogPage.selectGeneralFitness();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogNutritionTips() {
        blogPage.selectNutritionTips();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogProductTipsAndFAQ() {
        blogPage.selectProductTipsAndFAQ();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogWhatsNew() {
        blogPage.selectWhatsNew();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.")
    public void blogWorkoutTips() {
        blogPage.selectWorkoutTips();
        Assert.assertEquals(blogPage.resultArray(), RESULT);
    }
}
