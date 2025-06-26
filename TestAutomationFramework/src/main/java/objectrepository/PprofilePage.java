package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PprofilePage 
{
	
	WebDriver driver;

	public PprofilePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//p[@class='text-info truncate text-ellipsis']")
     private WebElement picon ;
    
   
     public WebElement getPicon() 
    {
		return  picon;
    }
     
     @FindBy(xpath="//input[@name=\"oldPassword\"]")
     private WebElement opassword ;
    
   
     public WebElement getOpassword() 
    {
		return  opassword;
    }
     
     @FindBy(xpath="//input[@name=\"newPassword\"]")
     private WebElement npassword ;
    
   
     public WebElement getNpassword() 
    {
		return  npassword;
    }
     
     
     
     @FindBy(xpath="(//button[normalize-space()='Change Password'])[1]")
     private WebElement  change;
    
   
     public WebElement getChange() 
    {
		return  change;
    }
     
     @FindBy(xpath="//input[@name=\"lastName\"]")
     private WebElement  lastname;
    
   
     public WebElement getLastname() 
    {
		return  lastname;
    }
     
     
     @FindBy(xpath="//input[@name=\"email\"]")
     private WebElement  email;
    
   
     public WebElement getEmail() 
    {
		return  email;
    }
     
     
     
     @FindBy(xpath="(//button[normalize-space()='Submit'])[1]")
     private WebElement  submit;
    
   
     public WebElement getSubmit() 
    {
		return  submit;
    }
     
     
     

}
