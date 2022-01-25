package JeFit.Test;

import org.openqa.selenium.By;

public class PropertiesTest {

    public final static String URL_LOGIN = "https://www.jefit.com/login/";
    public final static String URL_PROFILE = "https://www.jefit.com/my-jefit/profile/";
    public final static String URL_EXERCISES = "https://www.jefit.com/exercises/";

    // LoginPage
    public static final By USERNAME_INPUT = By.cssSelector("[id='navbar_username']");
    public static final By PASSWORD_INPUT = By.id("navbar_password");
    public static final By CHECKBOX_INPUT = By.id("cb_cookieuser_navbar");
    public static final By LOGIN_BUTTON = By.cssSelector(".loginblueButton1");
    public static final By ERROR_MESSAGE = By.id("invalidpassworderrormessage");
    final static String USERNAME = "User_1QA";
    final static String PASSWORD = "Test_pass0";

    // Log out
    public static final By MY_JEFIT_BUTTON = By.cssSelector("#my-jefit-app-menu > a");
    public static final By SIGNOUT_BUTTON = By.xpath("//a[text()='Sign out']");


    // ProfilePage
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

    // ExercisesPage
    // Лскаторы Picture
    public static final By TRICEPS_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=7&exercises=Triceps']");
    public static final By CHEST_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=3&exercises=Chest']");
    public static final By BACK_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=1&exercises=Back']");
    public static final By ABS_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=0&exercises=Abs']");
    public static final By LOWER_LEGS_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=9&exercises=Lower-Legs']");
    public static final By VIEW_ALL_EXERCISES_PICTURE_INPUT = By.cssSelector("[href='bodypart.php?id=11&exercises=All']");

    public static final By PICTURE_RESULT = By.id("bodyparttext");


    // Локаторы Exercise Search
    // Equipment
    public static final By ALL_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='All']");
    public static final By BODY_ONLY_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='BodyOnly']");
    public static final By MACHINE_CARDIO_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='MachineCardio']");
    public static final By WEIGHT_PLATE_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='WeightPlate']");

    //Type
    public static final By STRENGTH_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Strength']");
    public static final By STRETCHING_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Stretching']");
    public static final By POWERLIFTING_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Powerlifting']");
    public static final By OLYMPIC_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='OlympicWeightLifting']");

    // Difficulty
    public static final By BEGINNER_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Beginner']");
    public static final By INTERMEDIATE_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Intermediate']");
    public static final By EXPERT_EXERCISE_SEARCH_INPUT = By.cssSelector("[name='Expert']");

    // Поиск по имени
    public static final By SEARCH_EXERCISE_SEARCH_INPUT = By.id("searchText");

    // Кнопка поиска
    public static final By SEARCH_BUTTON_EXERCISE_SEARCH_INPUT = By.cssSelector("[class='statusblueButton']");

    // DataBase
    public static final By BICEPS_DATABASE_INPUT = By.cssSelector("[href='http://www.jefit.com/exercises/bodypart.php?id=2&exercises=Biceps']");
    public static final By BICEPS_DATABASE_RESULT = By.xpath("//strong[text()='Biceps Exercise Database']");
    public static final By GLUTES_DATABASE_INPUT = By.cssSelector("[href='http://www.jefit.com/exercises/bodypart.php?id=5&exercises=Glutes']");
    public static final By GLUTES_DATABASE_RESULT = By.xpath("//strong[text()='Glutes Exercise Database']");
    public static final By SHOULDERS_DATABASE_INPUT = By.cssSelector("[href='http://www.jefit.com/exercises/bodypart.php?id=6&exercises=Shoulders']");
    public static final By SHOULDERS_DATABASE_RESULT = By.xpath("//strong[text()='Shoulders Exercise Database']");
}
