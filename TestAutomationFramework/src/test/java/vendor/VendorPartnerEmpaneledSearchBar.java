package vendor;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.PartnerPage;

public class  VendorPartnerEmpaneledSearchBar extends BaseClass
{
	@Test
	public void Scrript() throws InterruptedException
	{
		PartnerPage pt=new PartnerPage(driver);
		pt.getPartner().click();
		Thread.sleep(2000);
		pt.getEmpl().click();
		Thread.sleep(2000);
		pt.getSearcch().sendKeys("IBM");
		Thread.sleep(2000);
		

		String actSearch=driver.findElement(By.xpath("//p[@aria-label='IBM']")).getText();
		
			boolean status=actSearch.equals("IBM");
			if(status)
			{
				
				Reporter.log("Search bar is working");
			//System.out.println("Search bar is working");
			} 
	}

}
