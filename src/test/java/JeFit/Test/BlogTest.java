package JeFit.Test;

import JeFit.Page.BlogPage;
import io.qameta.allure.Link;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static JeFit.Page.BasePage.URL_BLOG;
import static JeFit.Page.BlogPage.ARRAY_LOCATOR;
import static JeFit.Page.BlogPage.RESULT;

@Log4j2
public class BlogTest extends BaseTest {


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
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogAll() {
        blogPage.selectAll();
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogExerciseTips() {
        blogPage.selectExerciseTips();
        int size = blogPage.resultArray();
        Assert.assertEquals(size, RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogGeneralFitness() {
        blogPage.selectGeneralFitness();
        int size = blogPage.resultArray();
        Assert.assertEquals(size, RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogNutritionTips() {
        blogPage.selectNutritionTips();
        int size = blogPage.resultArray();
        Assert.assertEquals(size, RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogProductTipsAndFAQ() {
        blogPage.selectProductTipsAndFAQ();
        int size = blogPage.resultArray();
        Assert.assertEquals(size, RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogWhatsNew() {
        blogPage.selectWhatsNew();
        int size = blogPage.resultArray();
        Assert.assertEquals(size, RESULT);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogWorkoutTips() {
        blogPage.selectWorkoutTips();
        int size = blogPage.resultArray();
        Assert.assertEquals(size, RESULT);
    }
}
