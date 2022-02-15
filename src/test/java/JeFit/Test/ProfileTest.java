package JeFit.Test;

import JeFit.Page.ProfilePage;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AllureUtils;
import static JeFit.Page.ProfilePage.URL_MY_JIFIT;
import static JeFit.Page.ProfilePage.URL_PROFILE;
import static JeFit.Test.LoginTest.PASSWORD;
import static JeFit.Test.LoginTest.USERNAME;

@Log4j2
public class ProfileTest extends JeFit.Test.BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void navigateToProfilePage() {
        profilePage = new ProfilePage(driver);
        driver.get(URL_PROFILE);
        profilePage.enterUserName(USERNAME);
        profilePage.enterPassword(PASSWORD);
        profilePage.checkBoxIsSelected();
        profilePage.selectLogin();
        driver.get(URL_PROFILE);
        AllureUtils.attachScreenshot(driver);
    }

    @AfterMethod(alwaysRun = true)
    @Description("Close browser")
    public void signOut() {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.cssSelector("#my-jefit-app-menu"));
        actions.moveToElement(menuOption).perform();
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();
    }

    @Test(description = "Check is profile can be editable with minimum range value")
    public void profilePositiveModifyDataTestVersionOne() {
        profilePage.selectDateFromMinimumValueInRange();
        profilePage.selectIbInch();
        profilePage.selectGenderMan();
        profilePage.selectSaved();
        Assert.assertEquals(profilePage.getCurrentUrl(), URL_MY_JIFIT);
    }


    @Test(description = "Check is profile can be editable with maximum range value")
    public void profilePositiveModifyDataTestVersionTwo() {
        profilePage.selectDateFromMaximumValueInRange();
        profilePage.selectKgCm();
        profilePage.selectGenderWoman();
        profilePage.selectSaved();
        Assert.assertEquals(profilePage.getCurrentUrl(), URL_MY_JIFIT);
    }

    @Test(description = "Check is profile can be editable with medium range value")
    public void profilyPositiveModifyDataTestVersionThree() {
        profilePage.selectDateFromMiddleValueInRange();
        profilePage.selectIbInch();
        profilePage.selectGenderWoman();
        profilePage.selectSaved();
        Assert.assertEquals(profilePage.getCurrentUrl(), URL_MY_JIFIT);
    }
}
