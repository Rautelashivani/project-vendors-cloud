package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage 
{
	WebDriver driver;

	public PartnerPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//span[normalize-space()='Partners']")
     private WebElement partner ;
    
   
     public WebElement getPartner() 
    {
		return partner;
    }
     @FindBy(xpath="//span[normalize-space()='Empaneled']")
     private WebElement empl;
    
   
     public WebElement getEmpl() 
    {
		return empl;
    }
     
     @FindBy(xpath="//input[@placeholder=\"Search Partners\"]")
     private WebElement searcch;
    
   
     public WebElement getSearcch() 
    {
		return searcch;
    }

}
