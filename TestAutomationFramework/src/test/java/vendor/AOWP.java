package vendor;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass2;
import objectrepository.Signup;

public class  AOWP extends BaseClass2
{
	
	@Test
	public void Alertonweakpassword() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
	  	
      Signup sp=new Signup(driver);
	  sp.getSignup().click();
	  sp.getFirstname().sendKeys("vendor");
	  sp.getLastname().sendKeys("1111");
	  sp.getCompanyname().sendKeys("qsp");
	  sp.getEmail().sendKeys("qsp@yop.com");
	  sp.getPassword().sendKeys("123456");
	  Thread.sleep(2000);
	  
	  String actoutput=sp.getAlert().getText();
		
		boolean status=actoutput.equals("Weak password (Use strong password)");
		if(status)
		{
			
			
		Reporter.log("Giving Alert");
		
		} 
		else
			Reporter.log("No Alert");
			
	 
	  sp.getContinuee().click();
	  Thread.sleep(2000);
	 
	 
	
	  
	
	}

}
