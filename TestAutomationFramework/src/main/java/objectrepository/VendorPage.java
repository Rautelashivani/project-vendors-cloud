package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage 
{
	WebDriver driver;

	public VendorPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//span[normalize-space()='Vendors']")
     private WebElement vendorr;
    
   
     public WebElement getVendorr() 
    {
		return vendorr;
    }
     
     @FindBy(xpath="//span[normalize-space()='Search']")
     private WebElement search;
    
   
     public WebElement getSearch() 
    {
		return search;
    }
     @FindBy(xpath="//input[@placeholder=\"Search Vendors\"]")
     private WebElement searchfield;
    
   
     public WebElement getSearchfield() 
    {
		return searchfield;
    }


     @FindBy(xpath="//p[@aria-label='Info Edge 2']")
     private WebElement pvendor;
    
   
     public WebElement getPvendor() 
    {
		return pvendor;
    } 
     

     @FindBy(xpath="(//button[normalize-space()='Invite for Empanelment'])[1]")
     private WebElement empl;
    
   
     public WebElement getEmpl() 
    {
		return empl;
    } 
     

     @FindBy(xpath="//textarea[1]")
     private WebElement message;
    
   
     public WebElement getMessage() 
    {
		return message;
    } 
     
     @FindBy(css="div[role='presentation'] button:nth-child(2)")
     private WebElement invite;
    
   
     public WebElement getInvite() 
    {
		return invite;
    } 
     
 
     

}
