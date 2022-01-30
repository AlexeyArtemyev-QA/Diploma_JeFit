package JeFit.Test;

import JeFit.Page.BlogPage;
import io.qameta.allure.Link;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static JeFit.Test.PropertiesTest.URL_BLOG;
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
        driver.close();
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
        int a =  driver.findElements(By.cssSelector("span[class='raven-post-meta-item raven-post-categories']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogGeneralFitness() {
        blogPage.selectGeneralFitness();
        int a =  driver.findElements(By.cssSelector("span[class='raven-post-meta-item raven-post-categories']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogNutritionTips() throws InterruptedException {
        blogPage.selectNutritionTips();
        int a =  driver.findElements(By.cssSelector("span[class='raven-post-meta-item raven-post-categories']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogProductTipsAndFAQ() {
        blogPage.selectProductTipsAndFAQ();
        int a =  driver.findElements(By.cssSelector("span[class='raven-post-meta-item raven-post-categories']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogWhatsNew() {
        blogPage.selectWhatsNew();
        int a =  driver.findElements(By.cssSelector("span[class='raven-post-meta-item raven-post-categories']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogWorkoutTips() {
        blogPage.selectWorkoutTips();
        int a =  driver.findElements(By.cssSelector("span[class='raven-post-meta-item raven-post-categories']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);
    }
}
