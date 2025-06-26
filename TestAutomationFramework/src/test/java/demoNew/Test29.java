package demoNew;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.BenchPage;

public class Test29 extends BaseClass
{
	@Test
	public void scrippt() throws InterruptedException
	{
		BenchPage bp=new BenchPage(driver);
		bp.getBenchh().click();
		Thread.sleep(2000);
		bp.getStack().click();
		Thread.sleep(2000);
		bp.getStacksearch().sendKeys("Node.js");
		Thread.sleep(2000);

		String actSearch=driver.findElement(By.xpath("//th[normalize-space()='Node.js']")).getText();
		
			boolean status=actSearch.equals("Node.js");
			if(status)
			{
				
				Reporter.log("Search bar is working");
			//System.out.println("Search bar is working");
			} 
		
	}

}
