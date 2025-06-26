package vendor;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.BenchPage;

public class VendorBenchTechStackSearchBar extends BaseClass
{
	@Test
	public void scrippt() throws InterruptedException
	{
		BenchPage bp=new BenchPage(driver);
		bp.getBenchh().click();
		Thread.sleep(2000);
		bp.getStack().click();
		Thread.sleep(2000);
		bp.getStacksearch().sendKeys("JIRA");
		Thread.sleep(2000);

		String actSearch=driver.findElement(By.xpath("//th[normalize-space()='JIRA']")).getText();
		
			boolean status=actSearch.equals("JIRA");
			if(status)
			{
				
				Reporter.log("Search bar is working");
			//System.out.println("Search bar is working");
			} 
		
	}

}
