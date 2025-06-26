package listener_Utility;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass2;

public class AllureListener implements ITestListener {
    
    @Attachment(value = "Screenshot on Failure", type = "image/png")
    public byte[] saveScreenshot(byte[] screenshot) {
        return screenshot;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (BaseClass2.sdriver != null) {
            saveScreenshot(((TakesScreenshot) BaseClass2.sdriver).getScreenshotAs(OutputType.BYTES));
        }
    }
}