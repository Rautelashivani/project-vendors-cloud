package demoNew;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.BenchPage;

public class Test10 extends BaseClass
{
	@Test
	public void Script() throws InterruptedException
	{
		BenchPage bp=new BenchPage(driver);
		bp.getBenchh().click();
		Thread.sleep(2000);
		bp.getMatching().click();
		Thread.sleep(2000);
	    bp.getSearch().sendKeys("Automation Tester");
		Thread.sleep(2000);
		
		String actSearch=driver.findElement(By.xpath("(//div[normalize-space()='Automation Tester'])[1]")).getText();
	//	String actSearch=bp.getactSearch().getText();
		boolean status=actSearch.equals("Automation Tester");
		if(status)
		{
			
			Reporter.log("Search bar is working");
		//	System.out.println("Search bar is working");
		} 
		
		bp.getCancel().click();
		Thread.sleep(2000);
	}

}
