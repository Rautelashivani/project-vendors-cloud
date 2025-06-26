package vendor;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.Notification;

public class NotificationIconUnclickable extends BaseClass
{
	@Test
	public void demoTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Notification nt=new Notification(driver);
		nt.getIcon().click();
		Thread.sleep(2000);
	
		Reporter.log("Notification Icon is not Working");
	}
		
}
		
	
		
	
		

    
