package vendor;

import org.openqa.selenium.Keys;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import base.BaseClass2;
import objectrepository.LoginPage;

@Epic("Security Tests")
@Feature("Login Attempts")
public class Mutiplefailedloginsnolockoutt extends BaseClass2 {
    
    @Test(groups = "Smoke")
    @Story("Multiple Failed Login Attempts")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify account is not locked after 5 failed login attempts")
    public void multipleFailedLoginsNoLockout() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        
        for (int i = 1; i <= 5; i++) {
            Allure.step("Login Attempt #" + i, () -> {
                // Clear and enter credentials
                lp.getUsername().sendKeys(Keys.CONTROL + "a");
                lp.getUsername().sendKeys(Keys.DELETE);
                lp.getUsername().sendKeys("vendor44@ss.com");
                
                lp.getUserpassword().sendKeys(Keys.CONTROL + "a");
                lp.getUserpassword().sendKeys(Keys.DELETE);
                lp.getUserpassword().sendKeys("1234567");
                
                // Attempt login
                lp.getloginButton().click();
                Thread.sleep(2000);
                
                
               
            }
            );
        }
    }
}
