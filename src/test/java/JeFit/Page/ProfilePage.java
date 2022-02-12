package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static JeFit.Test.LoginTest.*;

@Log4j2
public class ProfilePage extends BasePage {

    public final static String URL_MY_JIFIT = "https://www.jefit.com/my-jefit/";
    public final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";

    public static final By MONTH_INPUT = By.cssSelector("[name='month']");
    public static final By MONTH_JANUARY_1_INPUT = By.xpath("//option[text()='January']");
    public static final By MONTH_OCTOBER_10_INPUT = By.xpath("//option[text()='October']");
    public static final By MONTH_DECEMBER_12_INPUT = By.xpath("//option[text()='December']");

    public static final By DAY_INPUT = By.xpath("//select[@name='dt']");
    public static final By DAY_INPUT_1 = By.xpath("//option[text()='1']");
    public static final By DAY_INPUT_30 = By.xpath("//option[text()='30']");
    public static final By DAY_INPUT_31 = By.xpath("//option[text()='31']");

    public static final By YEAR_INPUT = By.xpath("//select[@name='year']");
    public static final By YEAR_INPUT_1921 = By.xpath("//option[@value='1921']");
    public static final By YEAR_INPUT_1996 = By.xpath("//option[@value='1996']");
    public static final By YEAR_INPUT_2010 = By.xpath("//option[@value='2010']");

    public static final By CHECKBOX_IB_INCH_INPUT = By.id("unitradio");
    public static final By CHECKBOX_KG_CM_INPUT = By.cssSelector("[style='margin-left:12px']");

    public static final By HEIGTH_INPUT = By.id("heightinput");

    public static final By WEIGHT_INPUT = By.id("weightinput");

    public static final By CHECKBOX_GENDER_MAN_INPUT = By.cssSelector("input[value='M']");
    public static final By CHECKBOX_GENDER_WOMAN_INPUT = By.cssSelector("input[value='F']");

    public static final By SAVE_BUTTON_INPUT = By.cssSelector("[name='Submit']");

    // public static final By SAVE_BUTTON_INPUT = By.cssSelector("input[name='Submit']");

    public static final By HEIGTH1_INPUT_1 = By.xpath("//select[@id='feetP']//ancestor::option[@value='1']");
    public static final By HEIGTH1_INPUT_4 = By.xpath("//select[@id='feetP']//ancestor::option[@value='4']");
    public static final By HEIGTH1_INPUT_8 = By.xpath("//select[@id='feetP']//ancestor::option[@value='8']");

    public static final By HEIGTH2_INPUT_1 = By.xpath("//select[@id='inchP']//ancestor::option[@value='1']");
    public static final By HEIGTH2_INPUT_5 = By.xpath("//select[@id='inchP']//ancestor::option[@value='5']");
    public static final By HEIGTH2_INPUT_11 = By.xpath("//select[@id='inchP']//ancestor::option[@value='11']");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    // Методы
    public void clickCheckBoxOnIbInch (){
        log.info("Select check-box Ib/inch");
        driver.findElement(CHECKBOX_IB_INCH_INPUT).click();
    }

    public void clickCheckBoxOnKgCm (){
        log.info("Select check-box kg/cm");
        driver.findElement(CHECKBOX_KG_CM_INPUT).click();
    }

    public  void inputHeight (String height){
        driver.findElement(HEIGTH_INPUT).sendKeys(height);
    }

    public  void inputWeight (String weight){
        driver.findElement(WEIGHT_INPUT).sendKeys(weight);
    }

    public void clickCheckBoxOnGenderMan (){
        log.info("Select gender check-box man");
        driver.findElement(CHECKBOX_GENDER_MAN_INPUT).click();
    }

    public void clickCheckBoxOnGenderWoman (){
        log.info("Select gender check-box woman");
        driver.findElement(CHECKBOX_GENDER_WOMAN_INPUT).click();
    }

    public void clickButtonSaved (){
        log.info("Click on button save settings");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='Submit']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }

    public String atprofilePage() {
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

    public void checkBoxClick() {
        driver.findElement(CHECKBOX_INPUT).click();
    }

    public void loginButton() {
        log.info("Click on login button");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean checkBoxIsSelected() {
        log.info("Check that check-box selected");
        return driver.findElement(CHECKBOX_INPUT).isSelected();
    }

    public void modifyDataOnMinimumValueInRange () {
        log.info("Select of the date - 01.01.1921");
        driver.findElement(MONTH_JANUARY_1_INPUT).click();
        driver.findElement(DAY_INPUT_1).click();
        driver.findElement(YEAR_INPUT_1921).click();
    }
    public void modifyDataOnMaximumValueInRange() {
        log.info("Select of the date - 31.12.2010");
        driver.findElement(MONTH_INPUT).click();
        driver.findElement(MONTH_DECEMBER_12_INPUT).click();
        driver.findElement(DAY_INPUT_31).click();
        driver.findElement(YEAR_INPUT_2010).click();
    }

    public  void modifyDataOnMiddleValueInRange (){
        log.info("Select of the date - 30.10.1996");
        driver.findElement(MONTH_OCTOBER_10_INPUT).click();
        driver.findElement(DAY_INPUT_30).click();
        driver.findElement(YEAR_INPUT_1996).click();
    }
}
