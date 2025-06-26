package demoNew;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import base.BaseClass2;
import objectrepository.Signup;

public class Test05 extends BaseClass2
{
	@Test
	public void demootest() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
	  	
      Signup sp=new Signup(driver);
	  sp.getSignup().click();
	  sp.getFirstname().sendKeys("vendor");
	  sp.getLastname().sendKeys("1111");
	  sp.getCompanyname().sendKeys("qsp");
	  sp.getEmail().sendKeys("qsp@yop.com");
	  sp.getPassword().sendKeys("123");
	 
	  sp.getContinuee().click();
	 
	  sp.getRegis().click();
	  
	
	}

}
