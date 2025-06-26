package demoNew;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.RequirementPage;

public class Test11 extends BaseClass
{
	@Test
	public void scripttt() throws InterruptedException
	{
	RequirementPage rp=new RequirementPage(driver);
	rp.getRequirement().click();
	Thread.sleep(1000);
	rp.getMatchingg().click();
	Thread.sleep(1000);
	rp.getSearch().sendKeys("priya sharma");
	Thread.sleep(1000);
	
	String actSearch=driver.findElement(By.xpath("(//div[@class='cursor-pointer hover:text-indigo-700'])[1]")).getText();
	
		boolean status=actSearch.equals("PRIYA SHARMA");
		if(status)
		{
			
			Reporter.log("Search bar is working");
		//System.out.println("Search bar is working");
		} 
	rp.getCancell().click();
	}
	
	

}
