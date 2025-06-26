package vendor;

import org.junit.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.DashboardPage;

public class VendorDashboardTotalNumberOfPositions extends BaseClass
{
	
	
    @Test
	public void Script()
	{
    	DashboardPage dp=new DashboardPage(driver);
        int headerValue = dp.getHeaderValue();
        
        dp.clickHeader();
        int sumDigits = dp.sumNumbersBeforeParentheses();
 
        Assert.assertEquals("Header value should match sum of positions", headerValue, sumDigits);
    }
 
		
		
	}


