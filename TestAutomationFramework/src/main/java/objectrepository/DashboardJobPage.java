package objectrepository;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import java.time.Duration;
	import java.util.List;

	public class DashboardJobPage 
	{
	     WebDriver driver;
	     private WebDriverWait wait;

	    private By outPosition = By.xpath("//h5[@class='MuiTypography-root MuiTypography-h5 !text-indigo-400 css-1faowcc']");
	    private By tableRows = By.xpath("//table//tbody//tr");

	    public DashboardJobPage(WebDriver driver) 
	    {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public int getHeaderValue() 
	    {
	        WebElement headerElement = wait.until(ExpectedConditions.presenceOfElementLocated(outPosition));
	        return Integer.parseInt(headerElement.getText().trim());
	    }
	    
	    public void clickHeader() {
	        WebElement headerElement = wait.until(ExpectedConditions.elementToBeClickable(outPosition));
	        headerElement.click();
	    }

	    // Method to count the number of rows in the table
	    public int getRowCount() {
	        List<WebElement> rows = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tableRows));
	        int rowCount = rows.size();
	        System.out.println("Number of rows in table: " + rowCount);
	        return rowCount;
	    }
	}

