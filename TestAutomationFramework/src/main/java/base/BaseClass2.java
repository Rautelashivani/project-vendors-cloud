package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import generic_Utility.FileUtility;

public class BaseClass2 
{
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite
	public void bs() {
		System.out.println("Database connection & Report Configuration");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Pre conditions");
	}

	@BeforeClass
	public void bc() throws IOException 
	{

		System.out.println("Opening Browser");
		FileUtility futil = new FileUtility();
		String BROWSER = futil.getDataFromPropFile("bro");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		sdriver = driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void bm() throws IOException, InterruptedException {
		System.out.println("Signup");

//		get data from properties file
		FileUtility futil = new FileUtility();
		String URL = futil.getDataFromPropFile("url");
	
		

//		URL
		driver.get(URL);
		Thread.sleep(2000);
		

	}

	@AfterMethod
	public void am() throws InterruptedException {
		

		
	}

	@AfterClass
	public void ac() {
		System.out.println("Closing browser");
		driver.close();
	}

	@AfterTest
	public void at() {
		System.out.println("Post Conditions");
	}

	@AfterSuite
	public void as() {
		System.out.println("Database disconnect & Report Backup");
	}


}
