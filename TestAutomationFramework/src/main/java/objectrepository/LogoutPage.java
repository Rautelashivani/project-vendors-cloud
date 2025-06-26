package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	WebDriver driver;

	public LogoutPage(WebDriver driver) 
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[@class='text-info flex items-center justify-end text-indigo-500 cursor-pointer px-2 hover:text-indigo-700'])[1]")
	private WebElement logoutt;

	public WebElement getLogoutt() 
	{
		return logoutt;
	}

	public void logouttt() 
	{
		
		getLogoutt().click();
		
	}



}
