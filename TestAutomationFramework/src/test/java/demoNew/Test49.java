package demoNew;

import org.testng.annotations.Test;

import base.BaseClass;
import objectrepository.MemberPage;

public class Test49 extends BaseClass
{
	@Test
	public void Scriptttt() throws InterruptedException
	{
		MemberPage mp=new MemberPage(driver);
		mp.getMemberr().click();
		mp.deletee();
		mp.getButton().click();
		Thread.sleep(3000);
		
	}
	
}
