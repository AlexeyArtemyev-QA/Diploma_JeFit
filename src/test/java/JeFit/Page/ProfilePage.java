package JeFit.Page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

@Log4j2
public class ProfilePage extends BasePage {

    private static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    private static final By PASSWORD_INPUT = By.id("navbar_password");
    private static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    private static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");

    private static final By CHECKBOX_KG_CM_INPUT = By.xpath("//input[@onclick='changeUnits(1)']");

    private static final By CHECKBOX_GENDER_MAN_INPUT = By.cssSelector("input[value='M']");
    public static final By BUTTON_SIGN_OUT = By.xpath("//a[text()='Sign out']");


    private static final By SELECT_BUTTON_SETTINGS = By.xpath("//a[text()='Settings']");
    private static final By GET_MONTH = By.cssSelector("#monthSelect > option[selected]");
    private static final By GET_DATE = By.cssSelector("#dateSelect > option[selected]");
    private static final By GET_YEAR = By.cssSelector("#yearSelect > option[selected]");
    private static final By GET_KG_CM = By.xpath("//input[@id='unitradio' and @value='1']");
    private static final By GET_SEX = By.xpath("//input[@name='sex' and @value='M']");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    // Методы

    public void selectKgCm() {
        log.info("Select check-box kg/cm");
        driver.findElement(CHECKBOX_KG_CM_INPUT).click();
    }

    public void selectGenderMan() {
        log.info("Select gender check-box man");
        driver.findElement(CHECKBOX_GENDER_MAN_INPUT).click();
    }

    public void selectSavedButton() {
        log.info("Click on button save settings");
        WebElement button = driver.findElement(By.cssSelector("[name='Submit']"));
        scrollIntoView(button);
        button.click();
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
        log.info("Select of the date - 18.10.1996");
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name='month']")));
        selectMonth.selectByVisibleText("October");
        Select selectDay = new Select(driver.findElement(By.xpath("//select[@name='dt']")));
        selectDay.selectByVisibleText("18");
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@name='year']")));
        selectYear.selectByVisibleText("1996");
    }

    public void clickButtonSignOut() {
        log.info("Click on login button");
        driver.findElement(BUTTON_SIGN_OUT).click();
    }

    public String getTextMonth (){
        log.info("Get month text");
        WebElement elementMonth = driver.findElement(GET_MONTH);
        return elementMonth.getText();
    }

    public String getTextDate (){
        log.info("Get date text");
        WebElement elementDate = driver.findElement(GET_DATE);
        return elementDate.getText();
    }

    public String getTextYear (){
        log.info("Get year text");
        WebElement elementDate = driver.findElement(GET_YEAR);
        return elementDate.getText();
    }

    public boolean isSelectedCheckBoxKgCm (){
        log.info("Check-box KgCm is selected");
        return driver.findElement(GET_KG_CM).isSelected();
    }

    public boolean isSelectedCheckBoxSex (){
        log.info("Check-box Sex is selected");
        return driver.findElement(GET_SEX).isSelected();
    }

    public void selectButtonSetting (){
        log.info("Click on setting button");
        driver.findElement(SELECT_BUTTON_SETTINGS).click();
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
