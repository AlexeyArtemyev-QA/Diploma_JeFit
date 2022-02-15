package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static JeFit.Page.LoginPage.*;

@Log4j2
public class ProfilePage extends BasePage {

    public final static String URL_MY_JIFIT = "https://www.jefit.com/my-jefit/";
    public final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";

    public static final By MONTH_JANUARY_1_INPUT = By.xpath("//option[text()='January']");
    public static final By MONTH_OCTOBER_10_INPUT = By.xpath("//option[text()='October']");
    public static final By MONTH_DECEMBER_12_INPUT = By.xpath("//option[text()='December']");

    public static final By DAY_INPUT_1 = By.xpath("//option[text()='1']");
    public static final By DAY_INPUT_30 = By.xpath("//option[text()='30']");
    public static final By DAY_INPUT_31 = By.xpath("//option[text()='31']");

    public static final By YEAR_INPUT_1921 = By.xpath("//option[@value='1921']");
    public static final By YEAR_INPUT_1996 = By.xpath("//option[@value='1996']");
    public static final By YEAR_INPUT_2010 = By.xpath("//option[@value='2010']");

    public static final By CHECKBOX_IB_INCH_INPUT = By.id("unitradio");
    public static final By CHECKBOX_KG_CM_INPUT = By.xpath("//input[@onclick='changeUnits(1)']");
    // [style='margin-left:12px']

    public static final By CHECKBOX_GENDER_MAN_INPUT = By.cssSelector("input[value='M']");
    public static final By CHECKBOX_GENDER_WOMAN_INPUT = By.cssSelector("input[value='F']");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    // Методы
    public void selectIbInch() {
        log.info("Select check-box Ib/inch");
        driver.findElement(CHECKBOX_IB_INCH_INPUT).click();
    }

    public void selectKgCm() {
        log.info("Select check-box kg/cm");
        driver.findElement(CHECKBOX_KG_CM_INPUT).click();
    }

    public void selectGenderMan() {
        log.info("Select gender check-box man");
        driver.findElement(CHECKBOX_GENDER_MAN_INPUT).click();
    }

    public void selectGenderWoman() {
        log.info("Select gender check-box woman");
        driver.findElement(CHECKBOX_GENDER_WOMAN_INPUT).click();
    }

    public void selectSaved() {
        log.info("Click on button save settings");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='Submit']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void enterUserName(String userName) {
        log.info("Enter the User Name");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
    }

    public void enterPassword(String password) {
        log.info("Enter the password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void selectLogin() {
        log.info("Click on login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean checkBoxIsSelected() {
        log.info("Check that check-box selected");
        return driver.findElement(CHECKBOX_INPUT).isSelected();
    }

    public void selectDateFromMinimumValueInRange() {
        log.info("Select of the date - 01.01.1921");
        selectMonthOfBirthday(MONTH_JANUARY_1_INPUT);
        selectDayOfBirthday(DAY_INPUT_1);
        selectYearOfBirthday(YEAR_INPUT_1921);
    }

    public void selectDateFromMaximumValueInRange() {
        log.info("Select of the date - 31.12.2010");
        selectMonthOfBirthday(MONTH_DECEMBER_12_INPUT);
        selectDayOfBirthday(DAY_INPUT_31);
        selectYearOfBirthday(YEAR_INPUT_2010);
    }

    public void selectDateFromMiddleValueInRange() {
        log.info("Select of the date - 30.10.1996");
        selectMonthOfBirthday(MONTH_OCTOBER_10_INPUT);
        selectDayOfBirthday(DAY_INPUT_30);
        selectYearOfBirthday(YEAR_INPUT_1996);
    }

    private void selectDayOfBirthday(By pathOfDay) {
        driver.findElement(pathOfDay).click();
    }

    private void selectMonthOfBirthday(By pathOfMonth) {
        driver.findElement(pathOfMonth).click();
    }

    private void selectYearOfBirthday(By pathOfYear) {
        driver.findElement(pathOfYear).click();
    }
}
