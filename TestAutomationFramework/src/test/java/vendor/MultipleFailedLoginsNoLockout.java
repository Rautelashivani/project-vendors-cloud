package vendor;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass2;
import objectrepository.LoginPage;

public class MultipleFailedLoginsNoLockout extends BaseClass2
{
	@Test(groups= "Smoke")
	public void Multiplefailedloginsnolockout() throws InterruptedException
	{
		LoginPage  lp=new LoginPage(driver);
		  for (int i = 1; i <= 5; i++) 
          {
              Reporter.log("Attempt #" + i);
	          
	                
	              
	                
	        
                    lp.getUsername().sendKeys(Keys.CONTROL + "a");
          	        lp.getUsername().sendKeys(Keys.DELETE);
	                
	                Thread.sleep(2000);
	                lp.getUsername().sendKeys("vendor44@ss.com");
	               
	            
	                lp.getUserpassword().sendKeys(Keys.CONTROL + "a");
          	        lp.getUserpassword().sendKeys(Keys.DELETE);
		        	Thread.sleep(2000);
		        	lp.getUserpassword().sendKeys("1234567");
	        		
	        		lp.getloginButton().click();
	        		Thread.sleep(2000);
	        		
	                
	               
	                
	                
	              	                
	            }	
	            
	            
	        		
	    }
	
}	
	


