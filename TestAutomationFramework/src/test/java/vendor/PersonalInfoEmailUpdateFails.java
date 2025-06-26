package vendor;

import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.PprofilePage;

public class PersonalInfoEmailUpdateFails extends BaseClass
{
	@Test
	public void Scriipt() throws InterruptedException
	{
		PprofilePage pp=new PprofilePage(driver);
		Thread.sleep(2000);
		pp.getPicon().click();
		Thread.sleep(2000);
		pp.getEmail().sendKeys("Vendor99@yopmail.com");
		Thread.sleep(2000);
		pp.getSubmit().click();
		
	}
	

}
