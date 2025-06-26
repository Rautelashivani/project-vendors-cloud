package objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BenchPage 
{
	
	WebDriver driver;

	public BenchPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="(//span[normalize-space()='Bench'])[1]")
     private WebElement benchh;
    
   
     public WebElement getBenchh() 
    {
		return benchh;
    }
     @FindBy(xpath="//tbody/tr[1]/th[2]/div[1]/div[1]/div[1]/div[2]")
     private WebElement matching;
    
   
     public WebElement getMatching() 
    {
		return matching;
    }
     @FindBy(xpath="//input[@placeholder=\"Search\"]")
     private WebElement search;
    
   
     public WebElement getSearch() 
    {
		return search;
    }
     
     @FindBy(xpath="//div[normalize-space()='Automation Tester'])[1]")
     private WebElement actsearch;
    
   
     public WebElement getactSearch() 
    {
		return actsearch;
    }
     
     
     
     @FindBy(css="div[class='px-8 flex'] svg")
     private WebElement cancel;
    
   
     public WebElement getCancel() 
    {
		return cancel;
    }
     
     @FindBy(xpath="//button[normalize-space()='Tech Stack']")
     private WebElement stack ;
    
   
     public WebElement getStack() 
    {
		return stack;
    }
     
     @FindBy(xpath="//input[@placeholder=\"Search Resources\"]")
     private WebElement  stacksearch;
    
   
     public WebElement getStacksearch() 
    {
		return stacksearch;
    }
     
     
     
     

}
