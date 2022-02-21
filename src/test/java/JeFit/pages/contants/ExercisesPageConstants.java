package JeFit.pages.contants;

import org.openqa.selenium.By;

public class ExercisesPageConstants {
    public static final By EXERCISE_RESULT = By.id("hor-minimalist_3");
    public static final By BUTTON_SIGN_OUT = By.xpath("//a[text()='Sign out']");

    public static final By APP_MENU = By.cssSelector("#my-jefit-app-menu");

    // ExercisesPage
    // Локаторы Picture
    public static final By TRICEPS_PICTURE_INPUT = By.xpath("//ul[@class='buttonTableLeft']//a[text()='Triceps']");
    public static final By CHEST_PICTURE_INPUT = By.xpath("//li[@id='exercisechest']//descendant::a");
    public static final By BACK_PICTURE_INPUT = By.xpath("//a[@class='exerciseblueButton' and text()='Back']");
    public static final By ABS_PICTURE_INPUT = By.xpath("//li[@id='exerciseabs']//descendant::a");
    public static final By LOWER_LEGS_PICTURE_INPUT = By.xpath("//li[@id='exerciselowerlegs']//descendant::a");

    public static final By PICTURE_RESULT = By.id("bodyparttext");

    public static final By RESULT_BODY_ONLY = By.xpath("//p[text()='Equipment : Body Only ']");
    public static final By RESULT_STRENGTH = By.xpath("//p[text()='Type : Strength ']");
    public static final By RESULT_STRETCHING = By.xpath("//p[text()='Type : Stretching ']");

    // Equipment
    // Локаторы Exercise Search
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

    // Кнопка поиска
    public static final By SEARCH_BUTTON_EXERCISE_SEARCH_INPUT = By.cssSelector("[class='statusblueButton']");

    // DataBase
    public static final By BICEPS_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Biceps']");
    public static final By BICEPS_DATABASE_RESULT = By.xpath("//strong[text()='Biceps Exercise Database']");
    public static final By GLUTES_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Glutes']");
    public static final By GLUTES_DATABASE_RESULT = By.xpath("//strong[text()='Glutes Exercise Database']");
    public static final By SHOULDERS_DATABASE_INPUT = By.xpath("//li[@id='exerciselefttext']//descendant::a[text()='Shoulders']");
    public static final By SHOULDERS_DATABASE_RESULT = By.xpath("//strong[text()='Shoulders Exercise Database']");

    public static final By WORKOUT_PLANS_BUTTON = By.xpath("//a[text()='Workout Plans' and @class='raven-menu-item raven-link-item ']");
    public static final By SEARCH_INPUT = By.xpath("//input[@id='searchText']");
    public static final By SEARCH_BUTTON = By.xpath("//input[@class='postButton']");
    public static final By EXERCISES = By.xpath("//div[contains(text(),'Posterior Chain Workout')]");
    public static final By SAVE_TO_MY_WORKOUTS = By.xpath("//input[@value='Save To My Workouts']");
    public static final By MY_JEFIT = By.xpath("//span[text()='My Jefit']");
    public static final By MESSAGE = By.xpath("//p[text()='This routine has been downloaded to your account. Please click the sync button from your device.']");
    public static final By MY_ROUTINES = By.xpath("//a[contains(text(),'My Routines')]");
    public static final By NAME_WORKOUT = By.xpath("//strong[text()='Posterior Chain Workout']");
}
