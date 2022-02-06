package JeFit.Test;

import JeFit.Page.ProfilePage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AllureUtils;

import static JeFit.Test.PropertiesTest.*;

@Log4j2
public class ProfileTest extends JeFit.Test.BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void navigateToProfilePage() {
        profilePage = new ProfilePage(driver);
        driver.get(URL_PROFILE);
        profilePage.enterUserName(USERNAME);
        profilePage.enterPassword(PASSWORD);
        profilePage.checkBoxIsSelected();
        profilePage.loginButton();
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

    @Link("https://www.jefit.com/my-jefit/profile/")
    @Test(alwaysRun = true, description = "Тест настройка параметров для пользователя № 1 (JeFit)", invocationCount = 1, threadPoolSize = 1)
    public void profilePositiveModifyDataTestVersionOne() {

        profilePage.modifyDataOn01_01_1921();
        profilePage.clickCheckBoxOnIbInch();
        profilePage.clickCheckBoxOnGenderMan();
        profilePage.clickButtonSaved();
        Assert.assertEquals(profilePage.atprofilePage(), "https://www.jefit.com/my-jefit/");
    }

    @Link("https://www.jefit.com/my-jefit/profile/")
    @Test(alwaysRun = true, description = "Тест настройка параметров для пользователя № 2 (JeFit)", invocationCount = 1, threadPoolSize = 1)
    public void profilePositiveModifyDataTestVersionTwo() {
        profilePage.modifyDataOn31_12_2010();
        profilePage.clickCheckBoxOnKgCm();
        profilePage.clickCheckBoxOnGenderWoman();
        profilePage.clickButtonSaved();
        Assert.assertEquals(profilePage.atprofilePage(), "https://www.jefit.com/my-jefit/");
    }

    @Link("https://www.jefit.com/my-jefit/profile/")
    @Test(alwaysRun = true, description = "Тест настройка параметров для пользователя № 3 (JeFit)", invocationCount = 1, threadPoolSize = 1)
    public void profilyPositiveModifyDataTestVersionThree() {
        profilePage.modifyDataOn30_10_1996();
        profilePage.clickCheckBoxOnIbInch();
        profilePage.clickCheckBoxOnGenderWoman();
        profilePage.clickButtonSaved();
        Assert.assertEquals(profilePage.atprofilePage(), "https://www.jefit.com/my-jefit/");
    }
}
