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

@Log4j2
public class ProfileTest extends JeFit.Test.BaseTest {

    private final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";
    private final static String USERNAME = "User_1QA";
    private final static String PASSWORD = "Test_pass0";
    private static final By APP_MENU = By.cssSelector("#my-jefit-app-menu");
    private final static String EXPECTED_RESULT_MONTH = "October";
    private final static String EXPECTED_RESULT_DATE = "18";
    private final static String EXPECTED_RESULT_YEAR = "1996";



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
        WebElement menuOption = driver.findElement(APP_MENU);
        actions.moveToElement(menuOption).perform();
        profilePage.clickButtonSignOut();
    }

    @Test(description = "Check is profile can be editable with minimum range value")
    public void profilePositiveModifyDataTestVersionOne() {
        profilePage.selectDateFromMinimumValueInRange();
        profilePage.selectKgCm();
        profilePage.selectGenderMan();
        profilePage.selectSavedButton();
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(APP_MENU);
        actions.moveToElement(menuOption).perform();
        profilePage.selectButtonSetting();
        Assert.assertEquals(profilePage.getTextMonth(), EXPECTED_RESULT_MONTH);
        Assert.assertEquals(profilePage.getTextDate(), EXPECTED_RESULT_DATE);
        Assert.assertEquals(profilePage.getTextYear(), EXPECTED_RESULT_YEAR);
        Assert.assertTrue(profilePage.isSelectedCheckBoxKgCm());
        Assert.assertTrue(profilePage.isSelectedCheckBoxSex());
    }

}
