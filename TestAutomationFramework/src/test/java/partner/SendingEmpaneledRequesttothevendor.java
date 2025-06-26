package partner;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.VendorPage;

public class SendingEmpaneledRequesttothevendor extends BaseClass
{
	@Test
	
	public void Scripptt() throws InterruptedException
	{
		
		VendorPage vp=new VendorPage(driver);
		vp.getVendorr().click();
		Thread.sleep(2000);
		vp.getSearch().click();
		Thread.sleep(2000);
		vp.getSearchfield().sendKeys("Info Edge 2");
		Thread.sleep(2000);
		vp.getPvendor().click();
		Thread.sleep(2000);
		vp.getEmpl().click();
		Thread.sleep(2000);
		vp.getMessage().sendKeys("hello");
		Thread.sleep(2000);
		vp.getInvite().click();
		Thread.sleep(4000);
		
		String actOutput=driver.findElement(By.xpath("//p[@class=\"text-title font-bold mt-4\"]")).getText();


			boolean status=actOutput.equals("Invited successfully for Empanelment");
			if(status)
			{
				
				Reporter.log("Request has been sent");
				System.out.println("Request has been sent");
			} 
			
			Thread.sleep(4000);
	}

}
