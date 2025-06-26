package objectrepository;

	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;
	import java.util.List;

	public class DashboardPage {
	   WebDriver driver;
	    private WebDriverWait wait;

	    private By outPosition = By.xpath("//h5[@class='MuiTypography-root MuiTypography-h5 !text-indigo-950 css-1faowcc']");
	    private By tableRows = By.xpath("//table//tbody//tr");

	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public int getHeaderValue() {
	        WebElement headerElement = wait.until(ExpectedConditions.presenceOfElementLocated(outPosition));
	        return Integer.parseInt(headerElement.getText().trim());
	    }
	    
	    public void clickHeader() {
	        WebElement headerElement = wait.until(ExpectedConditions.elementToBeClickable(outPosition));
	        headerElement.click();
	    }

	    public int sumNumbersBeforeParentheses() {
	        List<WebElement> rows = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tableRows));
	        int sum = 0;
	        
	        for (WebElement row : rows) {
	            try {
	                WebElement cell = row.findElement(By.xpath(".//td[3]"));
	                String cellText = cell.getText().trim();
	                
	                // Extract number before parentheses
	                String numberStr = cellText.split("\\(")[0].trim();
	                int number = Integer.parseInt(numberStr);
	                
	                sum += number;
	                System.out.println("Found value: " + number);
	                
	            } catch (Exception e) {
	                System.out.println("Couldn't parse value in row: " + e.getMessage());
	            }
	        }
	        
	        System.out.println("Total sum: " + sum);
	        return sum;
	    }
	}


