package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberPage 
{

	WebDriver driver;

	public MemberPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//span[normalize-space()='Members']")
     private WebElement memberr;
    
   
     public WebElement getMemberr() 
    {
		return memberr;
    }
     
     @FindBy(xpath="(//div[@class='flex justify-between'])[1]")
     private WebElement name;
    
   
     public WebElement getName() 
    {
		return name ;
    }
     
     @FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-colorError MuiSvgIcon-fontSizeSmall css-qrs4ze'])[1]")
     private WebElement delete;
    
   
     public WebElement getDelete() 
    {
		return delete;
    }
     
     public void deletee() throws InterruptedException
     {
    	 
    	 
    	 Actions acc=new Actions(driver);
    	 acc.moveToElement(getName()).click().build().perform();
    	 Thread.sleep(1000);
    	 acc.moveToElement(getDelete()).click().build().perform();
     }
     @FindBy(xpath="(//button[normalize-space()='Delete'])[1]")
     private WebElement button;
    
   
     public WebElement getButton() 
    {
		return  button;
    }
     
     

}
