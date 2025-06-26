package vendor;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import base.BaseClass2;
import objectrepository.Signup;

@Epic("Vendor Module")
@Feature("Password Validation")
public class Alertonweakpasswordd extends BaseClass2 {
    
    @Test(description = "Verify alert on weak password")
    @Story("Weak Password Alert")
    @Severity(SeverityLevel.CRITICAL)
    public void Alertonweakpassword() throws InterruptedException {
        Signup sp = new Signup(driver);
        
        sp.getSignup().click();
        sp.getFirstname().sendKeys("vendor");
        sp.getLastname().sendKeys("1111");
        sp.getCompanyname().sendKeys("qsp");
        sp.getEmail().sendKeys("qsp@yop.com");
        sp.getPassword().sendKeys("123456");
        Thread.sleep(2000);
        
        String actoutput = sp.getAlert().getText();
        boolean status = actoutput.equals("Weak password (Use strong password)");
        
        if (status) {
            Allure.step("Alert message displayed: Weak password");
        } else {
            Allure.step("No alert message displayed");
            throw new AssertionError("Expected alert not shown");
        }
        
        sp.getContinuee().click();
        Thread.sleep(2000);
    }
}
