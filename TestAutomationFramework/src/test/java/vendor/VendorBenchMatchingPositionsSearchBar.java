package vendor;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.BenchPage;

public class  VendorBenchMatchingPositionsSearchBar extends BaseClass
{
	@Test(groups= "Regression")
	public void Script() throws InterruptedException
	{
		BenchPage bp=new BenchPage(driver);
		bp.getBenchh().click();
		Thread.sleep(2000);
		bp.getMatching().click();
		Thread.sleep(2000);
	    bp.getSearch().sendKeys("React Developer");
		Thread.sleep(2000);
		
		String actSearch=driver.findElement(By.xpath("(//div[normalize-space()='React Developer'])[1]")).getText();
	//	String actSearch=bp.getactSearch().getText();
		boolean status=actSearch.equals("React Developer");
		if(status)
		{
			
			Reporter.log("Search bar is working");
		//	System.out.println("Search bar is working");
		} 
		
		bp.getCancel().click();
		Thread.sleep(2000);
	}

}
