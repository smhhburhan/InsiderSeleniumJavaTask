package utils.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import pages.BasePage;
import java.io.IOException;

public class TestNGListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        String methodName = result.getMethod().getMethodName();
        try {
            BasePage.getScreenshot(methodName);
        } catch (IOException e) {}

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        String methodName = result.getMethod().getMethodName();
        try {
            BasePage.getScreenshot(methodName);
        } catch (IOException e) {}

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        String methodName = result.getMethod().getMethodName();
        try {
            BasePage.getScreenshot(methodName);
        } catch (IOException e) {}

    }

}