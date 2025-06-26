package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	For username/Email field
	@FindBy(name="email")
	private WebElement username;
	
	public WebElement getUsername()
	{
		return username;
	}
	
//	For password field
	@FindBy(name="password")
	private WebElement userpassword;
	
	public WebElement getUserpassword()

	{
		return userpassword;
	}
	
//	For Login Button
	@FindBy(css="button[type=\"submit\"]")
	private WebElement loginButton;
	
	public WebElement getloginButton()
	{
		return loginButton;
	}
	
//	Business utility for Login 	
	public void login(String USERNAME, String PASSWORD)
	{
		
		getUsername().sendKeys(USERNAME);
		
		getUserpassword().sendKeys(PASSWORD);
		
		getloginButton().click();

		
		
	}
	
	


}
