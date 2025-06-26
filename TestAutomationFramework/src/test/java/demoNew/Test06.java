package demoNew;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass2;
import objectrepository.LoginPage;

public class Test06 extends BaseClass2
{
	@Test
	public void scriptt() throws InterruptedException
	{
		LoginPage  lp=new LoginPage(driver);
		  for (int i = 1; i <= 5; i++) 
          {
              Reporter.log("Attempt #" + i);
	          
	                
	              
	                
	            //  	lp.getUsername().click();
	                lp.getUsername().clear();
	                Thread.sleep(2000);
	                lp.getUsername().sendKeys("vendor44@ss.com");
	               
	            //    lp.getUserpassword().click();
		        	lp.getUserpassword().clear();
		        	Thread.sleep(2000);
		        	lp.getUserpassword().sendKeys("1234567");
	        		
	        		lp.getloginButton().click();
	        		Thread.sleep(2000);
	        		
	                
	               
	                
	                
	               /* WebElement username=driver.findElement(By.name("email"));
	                WebElement userpassword=driver.findElement(By.name("password"));
	                WebElement login=driver.findElement(By.cssSelector("button[type=\"submit\"]"));
	                
	                
	                String wrongUsername="vendor44@ss.com";
	                String wrongPassword="123456";
	                
	                for (int i = 1; i <= 5; i++) 
		            {
		                Reporter.log("Attempt #" + i);
		                
		                
		                // Clear fields with proper waiting
		                username.clear();
		                // Small delay between actions
		                Thread.sleep(200);
		                username.sendKeys(wrongUsername);
		                
		                userpassword.clear();
		                Thread.sleep(200);
		                userpassword.sendKeys(wrongPassword);
		                login.click();  */
		                
	            }	
	            
	            
	        		
	    }
	
}	
	


