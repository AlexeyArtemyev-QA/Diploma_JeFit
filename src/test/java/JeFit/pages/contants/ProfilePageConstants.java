package JeFit.pages.contants;

import org.openqa.selenium.By;

public class ProfilePageConstants {
    public static final By CHECKBOX_KG_CM_INPUT = By.xpath("//input[@onclick='changeUnits(1)']");
    public static final By CHECKBOX_GENDER_MAN_INPUT = By.cssSelector("input[value='M']");
    public static final By SELECT_BUTTON_SETTINGS = By.xpath("//a[text()='Settings']");
    public static final By GET_MONTH = By.cssSelector("#monthSelect > option[selected]");
    public static final By GET_DATE = By.cssSelector("#dateSelect > option[selected]");
    public static final By GET_YEAR = By.cssSelector("#yearSelect > option[selected]");
    public static final By GET_KG_CM = By.xpath("//input[@id='unitradio' and @value='1']");
    public static final By GET_SEX = By.xpath("//input[@name='sex' and @value='M']");
    public static final By APP_MENU = By.cssSelector("#my-jefit-app-menu");
    public static final By MY_CUSTOM_EXERCISES = By.xpath("//li[contains(text(),' My Custom Exercises')]");
    public static final By EXERCISE_NAME = By.xpath("//input[@id='newename']");
    public static final By CREATE_EXERCISE = By.xpath("//input[@name='Submit']");
    public static final By TEXT_MUSCLE_GROUP = By.xpath("//p[text()='Cardio']");
    public static final By TEXT_NAME_EXERCISE = By.xpath("//td[text()='Run']");
    public static final By WALK_CUSTOM_EXERCISES = By.xpath("//td[text()='Walk']");
    public static final By MY_ROUTINES = By.xpath("//a[contains(text(),'My Routines')]");
    public static final By CREATE_NEW_ROUTINE = By.xpath("//a[text()='Create New Routine']");
    public static final By NAME_ROUTINE = By.xpath("//input[@name='rpname']");
    public static final By DESCRIPTION = By.xpath("//textarea[@name='rptext']");
    public static final By TAGS = By.xpath("//textarea[@name='rtags']");
    public static final By SAVE_BUTTON = By.xpath("//input[@class='statusblueButton']");
    public static final By FIRST_ROUTINE = By.xpath("//strong[text()='The first routine']");
    public static final By FREQUENCY = By.xpath("//p[text()=' 4 days / week']");
    public static final By FREQUENCY_EDIT = By.xpath("//p[text()=' 2 days / week']");
    public static final By TYPE = By.xpath("//p[text()='Sport Specific']");
    public static final By NAME = By.xpath("//strong[text()='The first routine']");
    public static final By DESCRIPTION_TEXT = By.xpath("//p[text()='My first description']");
    public static final By FRIENDS = By.xpath("//span[text()='Friends']");
    public static final By SEARCH_FRIENDS_BUTTON = By.xpath("//div[contains(text(),'Search Friends')]");
    public static final By SEARCH_FRIENDS_FIELD = By.xpath("//input[@id='suggestionsinput']");
    public static final By SEARCH_BUTTON = By.xpath("//input[@id='searchFriend']");
    public static final By ADD_BUTTON = By.xpath("//a[contains(text(),'Add')]");
    public static final By FRIEND_REQUEST_SENT = By.xpath("//a[contains(text(),'Friend Request Sent')]");
    public static final By TEXT_AREA = By.xpath("//textarea[@id='statusinputbox']");
    public static final By POST_BUTTON = By.xpath("//input[@value='Post']");
    public static final By TEXT_STATUS = By.xpath("//div[@id='statusText']//descendant::div");
    public static final By LOG_WORKOUT = By.xpath("//a[@class='btn btn-outline-secondary btn-block']");
    public static final By ADD_BUTTON_BODY_STATUS = By.xpath("//span[@id='edit-body-stats']");
    public static final By EDIT_BODY_STATUS_POPUP = By.id("add-body-stats-div");
    public static final By WEIGHT = By.xpath("//input[@name='weight']");
    public static final By HEIGHT = By.xpath("//input[@name='height']");
    public static final By DONE_BUTTON = By.xpath("//div[contains(text(),'Done')]");
    public static final By WEIGHT_VALUE = By.xpath("//strong[contains(text(),'Weight : ')]//ancestor::a");
    public static final By HEIGHT_VALUE = By.xpath("//strong[contains(text(),'Height : ')]//ancestor::a");
    public static final By SUBMIT_BUTTON = By.cssSelector("[name='Submit']");
    public static final By MONTH_VALUE = By.xpath("//select[@name='month']");
    public static final By DAY_VALUE = By.xpath("//select[@name='dt']");
    public static final By YEAR_VALUE = By.xpath("//select[@name='year']");
    public static final By MUSCLE_GROUP = By.xpath("//select[@name='selectpart']");
    public static final By RECORD_TYPE = By.xpath("//select[@name='select_recordtype']");
    public static final By FREQUENCY_INPUT = By.xpath("//select[@name='dayselect']");
    public static final By DATA_TYPE_INPUT = By.xpath("//select[@name='daytype']");
    public static final By TYPE_INPUT = By.xpath("//select[@name='typeselect']");
    public static final By DIFFICULTY_INPUT = By.xpath("//select[@name='levelselect']");
    public static final By ROUTINE_SECOND = By.xpath("//strong[text()='The second routine']");
    public static final By DELETE_BUTTON = By.xpath("//a[text()=' Delete']");
    public static final By EDIT_ROUTINE = By.xpath("//a[@class='confirmText']");
    public static final By TYPE_EDIT = By.xpath("//p[text()='General Fitness']");
    public static final By REMOVAL_TEXT = By.xpath("//p[text()='You have not setup a default routine yet. Please create one or set one as default routine']");
    public static final By EDIT_BUTTON = By.cssSelector("#hor-minimalist_3 > tbody > tr > td > table > tbody > tr:nth-of-type(2) > td:nth-of-type(3) > a");
    public static final By DELETE_BUTTON_CUSTOM_EXERCISES = By.cssSelector("#hor-minimalist_3 > tbody > tr > td > table > tbody > tr:nth-of-type(2) > td:nth-of-type(4) > a");
    public static final By EDIT_BUTTON_CUSTOM_EXERCISE = By.xpath("//td[text()='Jump']//ancestor::td[@align='center']//following::td[@align='center']");
    public static final By DELETE_CUSTOM_EXERCISE = By.xpath("//td[@colspan='4']");
}
