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
import objectrepository.LoginPage;
import objectrepository.LogoutPage;


public class BaseClass 
{
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(groups= "Regression")
	public void bs() {
		System.out.println("Database connection & Report Configuration");
	}

	@BeforeTest(groups= "Regression")
	public void bt() {
		System.out.println("Pre conditions");
	}

	@BeforeClass(groups= "Regression")
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

	@BeforeMethod(groups= "Regression")
	public void bm() throws IOException {
		System.out.println("Login");

//		get data from properties file
		FileUtility futil = new FileUtility();
		String URL = futil.getDataFromPropFile("url");
		String USERNAME = futil.getDataFromPropFile("un");
		String PASSWORD = futil.getDataFromPropFile("pwd");
		

//		LOGIN Page
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);

	}

	@AfterMethod(groups= "Regression")
	public void am() throws InterruptedException {
		

		LogoutPage lg = new LogoutPage(driver);
		lg.logouttt();
	}

	@AfterClass(groups= "Regression")
	public void ac() {
		System.out.println("Closing browser");
		driver.close();
	}

	@AfterTest(groups= "Regression")
	public void at() {
		System.out.println("Post Conditions");
	}

	@AfterSuite(groups= "Regression")
	public void as() {
		System.out.println("Database disconnect & Report Backup");
	}

}
