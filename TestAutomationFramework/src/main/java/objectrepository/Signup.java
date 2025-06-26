package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup
{
	WebDriver driver;

	public Signup(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="(//span[@class='text-blue-500 cursor-pointer'])[1]")
     private WebElement signup;
    
   
     public WebElement getSignup() 
    {
		return signup;
    }
     @FindBy(xpath="//input[@name=\"firstName\"]")
     private WebElement firstname;
    
   
     public WebElement getFirstname() 
    {
		return firstname;
    }
     @FindBy(xpath="//input[@name=\"lastName\"]")
     private WebElement lastname;
    
   
     public WebElement getLastname() 
    {
		return lastname;
    }
     
     @FindBy(xpath="//input[@name=\"companyName\"]")
     private WebElement companyname;
    
   
     public WebElement getCompanyname() 
    {
		return companyname;
    }
     
    @FindBy(xpath="//input[@name=\"email\"]")
    private WebElement email;
    
    public WebElement getEmail()
    {
    	return email;
    }
    
    @FindBy(xpath="//input[@name=\"password\"]")
    private WebElement password;
    
    public WebElement getPassword()
    {
    	return password;
    }
    
    
    @FindBy(xpath="//button[@type=\"submit\"]")
    private WebElement continuee;
    
    public WebElement getContinuee()
    {
    	return continuee;
    }
     
    
    
    @FindBy(xpath="(//p[@class='!mt-1 text-info text-red-500'])[1]")
    private WebElement alert;
    
    public WebElement getAlert()
    {
    	return alert;
    }
    
    
     
     
     
     
     
     

}
