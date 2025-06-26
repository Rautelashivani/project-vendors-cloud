package vendor;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

import base.BaseClass;
import objectrepository.DashboardJobPage;

public class VendorDashboardTotalJobApplied extends BaseClass
{
	@Test
	public void Script() throws InterruptedException
	{
		Thread.sleep(2000);
		DashboardJobPage djp=new DashboardJobPage(driver);
        int headerValue = djp.getHeaderValue();
        Thread.sleep(2000);
        djp.clickHeader();
        int totaljobapplied = djp.getRowCount();
        
       Reporter.log("Header value: " + headerValue + ", Table rows: " + totaljobapplied);
 
        Assert.assertEquals(headerValue, totaljobapplied, 
                "Header value (" + headerValue + ") does not match row count (" + totaljobapplied + ")");
    
		
	}

}
