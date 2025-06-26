package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequirementPage 
{
	WebDriver driver;

	public RequirementPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//span[normalize-space()='Requirements']")
     private WebElement requirement;
    
   
     public WebElement getRequirement() 
    {
		return requirement;
    }
     @FindBy(xpath="//tbody/tr[1]/th[2]/div[1]/div[2]/div[2]")
     private WebElement matchingg;
    
   
     public WebElement getMatchingg() 
    {
		return matchingg;
    }
     @FindBy(xpath="(//button[normalize-space()='Availability'])[1]")
     private WebElement available ;
    
   
     public WebElement getAvailable() 
    {
		return available ;
    }

    
     @FindBy(xpath="//span[normalize-space()='Immediate']")
     private WebElement immdt  ;
    
   
     public WebElement getImmdt() 
    {
		return immdt ;
    }
     
     @FindBy(xpath="//body[1]/div[2]/div[3]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[2]")
     private WebElement blank ;
    
   
     public WebElement getBlank () 
    {
		return blank ;
    }
     @FindBy(xpath="//input[@placeholder=\"Search Resources\"]")
     private WebElement search   ;
    
   
     public WebElement getSearch() 
    {
		return search ;
    }
     
     @FindBy(xpath="(//*[name()='svg'][@class='absolute cursor-pointer left-[8px] top-[11px]'])[1]")
     private WebElement cancell   ;
    
   
     public WebElement getCancell() 
    {
		return cancell ;
    }
     
     @FindBy(xpath="//span[normalize-space()='15 Days Notice']")
     private WebElement notice   ;
    
   
     public WebElement getNotice() 
    {
		return notice ;
    }
     
     @FindBy(xpath="//th[normalize-space()='Resource name']")
     private WebElement resource   ;
    
   
     public WebElement getResource() 
    {
		return resource ;
    }
     
    
     
     
     


}
