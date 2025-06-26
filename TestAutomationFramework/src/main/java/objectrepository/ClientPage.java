package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage 
{
	WebDriver driver;

	public ClientPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//a[@href='/company/clients']")
     private WebElement clientt;
    
   
     public WebElement getClientt() 
    {
		return clientt;
    }
     
     @FindBy(xpath="(//button[normalize-space()='Add new client'])[1]")
     private WebElement addclient;
    
   
     public WebElement getAddclient() 
    {
		return addclient;
    }
     
     @FindBy(xpath="//input[@name=\"clientName\"]")
     private WebElement name;
    
   
     public WebElement getName() 
    {
		return name;
    }
     
     @FindBy(xpath="//input[@name=\"contactPhone\"]")
     private WebElement mobile;
    
   
     public WebElement getMobile() 
    {
		return mobile;
    }
     
     @FindBy(xpath="//input[@name=\"contactEmail\"]")
     private WebElement email;
    
   
     public WebElement getEmail() 
    {
		return email;
    } 
     
     @FindBy(xpath="//input[@name=\"address\"]")
     private WebElement address;
    
   
     public WebElement getAddress() 
    {
		return address;
    } 
     
     @FindBy(xpath="//input[@name=\"website\"]")
     private WebElement website;
    
   
     public WebElement getWebsite() 
    {
		return website;
    } 
     
     @FindBy(xpath="(//button[normalize-space()='Submit'])[1]")
     private WebElement submit;
    
   
     public WebElement getSubmit() 
    {
		return submit;
    } 
     
     
     
     
     
     
     
     
     

}
