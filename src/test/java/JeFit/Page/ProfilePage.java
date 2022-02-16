package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class ProfilePage extends BasePage {

    private static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    private static final By PASSWORD_INPUT = By.id("navbar_password");
    private static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    private static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");

    private static final By MONTH_JANUARY_1_INPUT = By.xpath("//option[text()='January']");
    private static final By MONTH_OCTOBER_10_INPUT = By.xpath("//option[text()='October']");
    private static final By MONTH_DECEMBER_12_INPUT = By.xpath("//option[text()='December']");

    private static final By DAY_INPUT_1 = By.xpath("//option[text()='1']");
    private static final By DAY_INPUT_30 = By.xpath("//option[text()='30']");
    private static final By DAY_INPUT_31 = By.xpath("//option[text()='31']");

    private static final By YEAR_INPUT_1921 = By.xpath("//option[@value='1921']");
    private static final By YEAR_INPUT_1996 = By.xpath("//option[@value='1996']");
    private static final By YEAR_INPUT_2010 = By.xpath("//option[@value='2010']");

    private static final By CHECKBOX_IB_INCH_INPUT = By.id("unitradio");
    private static final By CHECKBOX_KG_CM_INPUT = By.xpath("//input[@onclick='changeUnits(1)']");

    private static final By CHECKBOX_GENDER_MAN_INPUT = By.cssSelector("input[value='M']");
    private static final By CHECKBOX_GENDER_WOMAN_INPUT = By.cssSelector("input[value='F']");
    public static final By BUTTON_SIGN_OUT = By.xpath("//a[text()='Sign out']");


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

    public void selectSavedButton() {
        log.info("Click on button save settings");
        WebElement button = driver.findElement(By.cssSelector("[name='Submit']"));
        scrollIntoView(button);
        button.click();
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

    public void clickButtonSignOut() {
        log.info("Click on login button");
        driver.findElement(BUTTON_SIGN_OUT).click();
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
