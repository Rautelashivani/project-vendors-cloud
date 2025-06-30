
package listener_Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseClass2;

public class ListImp implements ISuiteListener, ITestListener
{
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onStart(ISuite suite)
	{
		System.out.println("Database connection & Report Configuration");
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-SS_yyyy-MM-dd");
		String time=sdf.format(new Date());
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"C:\\Users\\Fleek IT\\git\\repository\\TestAutomationFramework\\report\\" + time +"repot"+".html");
		spark.config().setDocumentTitle("Vendors Cloud");
		spark.config().setReportName("Extent Report ");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("window", "11pro");
		report.setSystemInfo("Browser", "Chrome");
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName= result.getMethod().getMethodName();
	    test = report.createTest(methodName);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Passed");
		test.log(Status.PASS, "The test script got passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed");
		
		test.log(Status.FAIL, "The test script got failed");
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-SS_yyyy-MM-dd");
		String time=sdf.format(new Date());
		
		TakesScreenshot tks =(TakesScreenshot) BaseClass2.sdriver;
		File src=tks.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Fleek IT\\git\\repository\\TestAutomationFramework\\error_shots\\" + time +"screenshot"+".png");
		try
		{
			FileHandler.copy(src, des);
			
			test.addScreenCaptureFromPath("C:\\Users\\Fleek IT\\git\\repository\\TestAutomationFramework\\error_shots\\" + time +"screenshot"+".png");
		}
		
		catch(IOException e)
		{
			 test.fail("Failed to attach screenshot: " + e.getMessage());
			
		}
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Skipped");
		test.log(Status.SKIP, "The test script got skipped");
	}

	

	@Override
	public void onFinish(ISuite suite) 
	{
		System.out.println("Database disconnect & Report Backup");
		report.flush();
	}
	
	

}
