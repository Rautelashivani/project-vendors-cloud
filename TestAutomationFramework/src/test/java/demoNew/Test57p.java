package demoNew;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.PprofilePage;

public class Test57p extends BaseClass
{
	@Test
	public void Sccript() throws InterruptedException
	{
		Thread.sleep(2000);
		
		PprofilePage pp=new PprofilePage (driver);
		
		pp.getPicon().click();
		Thread.sleep(2000);
		pp.getOpassword().sendKeys("helloo");
		Thread.sleep(2000);
		pp.getNpassword().sendKeys("helloo");
		Thread.sleep(2000);
		pp.getChange().click();
		Thread.sleep(2000);
		
		String actSearch=driver.findElement(By.xpath("//p[text()='Use Different Password']")).getText();
		
		boolean status=actSearch.equals("Use Different Password");
		if(status)
		{
			
			Reporter.log("Password is not able to change");
		
		} 
		
		else
		{
			Reporter.log("Password is changed");
		}
	
	}
}
