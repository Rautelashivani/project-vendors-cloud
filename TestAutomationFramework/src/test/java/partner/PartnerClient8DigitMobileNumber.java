package partner;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.ClientPage;

public class PartnerClient8DigitMobileNumber extends BaseClass
{
	@Test
	public void Scrt() throws InterruptedException
	{
		
		ClientPage cp=new ClientPage(driver);
		cp.getClientt().click();
		Thread.sleep(2000);
		cp.getAddclient().click();
		Thread.sleep(2000);
		cp.getName().sendKeys("KPGM");
		Thread.sleep(2000);
		cp.getMobile().sendKeys("98765433");
		Thread.sleep(2000);
		cp.getEmail().sendKeys("kpmg@kk.com");
		cp.getAddress().sendKeys("Delhi");
		Thread.sleep(2000);
		cp.getWebsite().sendKeys("//https:kpgm.com");
		Thread.sleep(2000);
		cp.getSubmit().click();
		Thread.sleep(4000);
		String actOutput=driver.findElement(By.xpath("//p[@class=\"MuiFormHelperText-root Mui-error MuiFormHelperText-sizeSmall MuiFormHelperText-contained MuiFormHelperText-filled css-1h5xszz\"]")).getText();


		boolean status=actOutput.equals("Mobile number must be 10 digits");
		if(status)
		{
			
			Reporter.log("Digits must be 10");
			System.out.println("Digits must be 10");
		} 
		
		else
		{
			Reporter.log("Accepting the incorrect digits");
			System.out.println("Accepting the incorrect digits");
		}
		
		
	}
	
	
	//table//tbody//tr[1]//td[3]

}
