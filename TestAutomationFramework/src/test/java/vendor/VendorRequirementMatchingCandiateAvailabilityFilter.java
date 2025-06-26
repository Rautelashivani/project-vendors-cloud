package vendor;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.RequirementPage;

public class VendorRequirementMatchingCandiateAvailabilityFilter extends BaseClass
{
	@Test
	public void Sscript() throws InterruptedException
	{
		RequirementPage rp=new RequirementPage(driver);
		rp.getRequirement().click();
		rp.getMatchingg().click();
		rp.getAvailable().click();
		Thread.sleep(2000);
		 rp.getNotice().click();
		 Thread.sleep(4000);
		rp.getResource().click();
		
		//rp.getAvailable().click();
	//	rp.getAvailable().click();
	//	rp.getAvailable();
		

		String actSearch=driver.findElement(By.xpath("//p[@class='text-base']")).getText();
		
			boolean status=actSearch.equals("15 Days Notice");
			if(status)
			{
				
				Reporter.log("15 days notice appears");
			//System.out.println("Search bar is working");
			} 
			
			else
			{
				Reporter.log("No data is available");
			}
	    	
		
	}
	

}
