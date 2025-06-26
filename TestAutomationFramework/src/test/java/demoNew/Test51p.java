package demoNew;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.PprofilePage;

public class Test51p extends BaseClass
{
	@Test
	public void Scripttt() throws InterruptedException
	{
		PprofilePage pp=new PprofilePage(driver);
		pp.getPicon().click();
		Thread.sleep(2000);
		pp.getLastname().clear();
		Thread.sleep(2000);
		pp.getLastname().sendKeys("786");
		Thread.sleep(2000);
		pp.getSubmit().click();
		

		String actSearch=driver.findElement(By.xpath("//input[@name=\"lastName\"]")).getText();
		
			boolean status=actSearch.equals("786");
			if(status)
			{
				
				Reporter.log("last name is updated");
			
			} 
		
		
	}
	

}
