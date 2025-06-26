package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification
{
	WebDriver driver;

	public Notification(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath="(//*[name()='svg'][@class='my-auto'])[1]")
	     private WebElement icon;
	    
	   
	     public WebElement getIcon() 
	    {
			return icon;
	    }
	    
	    /* @FindBy(css="a[class='shopping_cart_link']")
	     private WebElement cart;
	    
	   
	     public WebElement getCart() 
	    {
			return cart; */
	    }


