package JeFit.Test;

import JeFit.Page.BlogPage;
import io.qameta.allure.Link;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static JeFit.Test.PropertiesTest.URL_BLOG;
@Log4j2
public class BlogTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void navigateToLoginPage() {
        blogPage = new BlogPage(driver);
        driver.get(URL_BLOG);
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogAll() {
        blogPage.selectAll();


//        Assert.assertEquals(loginPage.getErrorMessageText(), "Invalid username/email or password",
//                "ERROR:Unregistered user successfully logged in");
    }

    @Link("https://www.jefit.com/blog")
    @Test(alwaysRun = true, description = "Blog.", invocationCount = 1, threadPoolSize = 1)
    public void blogExerciseTips() {
        blogPage.selectExerciseTips();
        int a =  driver.findElements(By.xpath("//a[@href='https://www.jefit.com/category/exercise-tips']")).size();
        System.out.println(a);
        Assert.assertEquals(a,9);



//        Assert.assertEquals(loginPage.getErrorMessageText(), "Invalid username/email or password",
//                "ERROR:Unregistered user successfully logged in");
    }
}
