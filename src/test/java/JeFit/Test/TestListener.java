package JeFit.Test;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    protected WebDriver driver;

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);

        // Делает скриншот и сохраняет его в target
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File distFile = new File("C:\\dev\\Linker\\target/screenshot1.png");
//        FileUtils.copyFile(file, distFile);

//        WebDriver driver = (WebDriver)(result.getAttribute("driver"));
//        AllureUtils.attachScreenshot(driver);


         //Скриншот
        System.out.println(String.format("Test '%s' failed", result.getName()));
        WebDriver driver = (WebDriver)(result.getTestContext().getAttribute("driver"));
         //AllureUtils.attachScreenshot(driver);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
