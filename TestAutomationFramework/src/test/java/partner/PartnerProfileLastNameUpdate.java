package partner;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.PprofilePage;

public class PartnerProfileLastNameUpdate extends BaseClass
{
	@Test
	public void Scripttt() throws InterruptedException
	{
		PprofilePage pp=new PprofilePage(driver);
		pp.getPicon().click();
		Thread.sleep(2000);
		pp.getLastname().sendKeys(Keys.CONTROL + "a");
    	pp .getLastname().sendKeys(Keys.DELETE);
		pp.getLastname().clear();
		Thread.sleep(2000);
		pp.getLastname().sendKeys("aaa");
		Thread.sleep(2000);
		pp.getSubmit().click();
		
		Thread.sleep(2000);
		Reporter.log("Last name is updated");

	
			
	
		
		
	}
	

}
