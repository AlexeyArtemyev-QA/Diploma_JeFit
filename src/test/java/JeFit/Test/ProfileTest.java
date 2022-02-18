package JeFit.Test;

import JeFit.Page.ProfilePage;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Log4j2
public class ProfileTest extends JeFit.Test.BaseTest {

    private final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";
    private final static String USERNAME = "User_1QA";
    private final static String PASSWORD = "Test_pass0";
    private final static String EXPECTED_RESULT_MONTH = "October";
    private final static String EXPECTED_RESULT_DATE = "18";
    private final static String EXPECTED_RESULT_YEAR = "1996";
    private final static String EXPECTED_RESULT_MUSCLE = "Cardio";
    private final static String EXPECTED_RESULT_NAME_EXERCISE = "Run";
    private final static String EXPECTED_RESULT_FREQUENCY = "Frequency: 4 days / week";
    private final static String EXPECTED_RESULT_TYPE = "Type: Sport Specific";
    private final static String EXPECTED_RESULT_NAME = "The first routine";
    private final static String EXPECTED_DESCRIPTION = "My first description";


    @BeforeMethod(alwaysRun = true)
    public void navigateToProfilePage() {
        profilePage = new ProfilePage(driver);
        driver.get(URL_PROFILE);
        profilePage.enterUserName(USERNAME);
        profilePage.enterPassword(PASSWORD);
        profilePage.checkBoxIsSelected();
        profilePage.selectLogin();
        driver.get(URL_PROFILE);
    }

    @AfterMethod(alwaysRun = true)
    @Description("Close browser")
    public void signOut() {
        profilePage.moveToElementMenu();
        profilePage.clickButtonSignOut();
    }

    @Test(description = "Check is profile can be editable with minimum range value")
    public void profilePositiveModifyDataTestVersionOne() {
        driver.get(URL_PROFILE);
        profilePage.selectDateFromMinimumValueInRange();
        profilePage.selectKgCm();
        profilePage.selectGenderMan();
        profilePage.selectSavedButton();
        profilePage.moveToElementMenu();
        profilePage.waitAppMenu();
        profilePage.selectButtonSetting();
        Assert.assertEquals(profilePage.getTextMonth(), EXPECTED_RESULT_MONTH);
        Assert.assertEquals(profilePage.getTextDate(), EXPECTED_RESULT_DATE);
        Assert.assertEquals(profilePage.getTextYear(), EXPECTED_RESULT_YEAR);
        Assert.assertTrue(profilePage.isSelectedCheckBoxKgCm());
        Assert.assertTrue(profilePage.isSelectedCheckBoxSex());
    }

    @Test(description = "Check to create my custom exercise")
    public void createMyCustomExercises() {
        profilePage.clickOnMyCustomExercises();
        profilePage.sendTextExerciseName();
        profilePage.selectParametersForExercises();
        profilePage.clickOnCreateExercise();
        Assert.assertEquals(profilePage.getTextMuscleGroup(),EXPECTED_RESULT_MUSCLE);
        Assert.assertEquals(profilePage.getTextNameExercise(),EXPECTED_RESULT_NAME_EXERCISE);
    }

    @Test(description = "Check to create my routines")
    public void createMyRoutines() {
        profilePage.clickOnMyRoutines();
        profilePage.clickOnCreateNewRoutine();
        profilePage.sendTextRoutineName();
        profilePage.selectParametersForRoutine();
        profilePage.sendTextDescription();
        profilePage.sendTextTags();
        profilePage.clickOnSaveButton();
        profilePage.clickFirstRoutine();
        Assert.assertEquals(profilePage.getTextFraquency(),EXPECTED_RESULT_FREQUENCY);
        Assert.assertEquals(profilePage.getTextType(), EXPECTED_RESULT_TYPE);
        Assert.assertEquals(profilePage.getTextName(), EXPECTED_RESULT_NAME);
        Assert.assertEquals(profilePage.getTextDescription(), EXPECTED_DESCRIPTION);

    }

}
