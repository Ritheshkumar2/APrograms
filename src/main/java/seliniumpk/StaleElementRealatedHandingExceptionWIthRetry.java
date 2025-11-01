package seliniumpk;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementRealatedHandingExceptionWIthRetry {
	
	public static WebDriver driver;
	
	public StaleElementRealatedHandingExceptionWIthRetry(WebDriver driver) {
		this.driver=driver;
	}
	
	public static void clickRetryElement(By locator, int maxRetry) {
		
		int attempt=0;
		
		while(attempt < maxRetry) {
			try {
			WebElement element=driver.findElement(locator);
			element.click();
			System.out.print("element click on successfully on element:"+ (attempt+1));
			break;
		} catch (StaleElementReferenceException  e) {
			attempt++;
			System.out.println("⚠️ StaleElementReferenceException caught. Retrying... Attempt: " + attempt);
            if (attempt == maxRetry) {
                throw e; // rethrow after max retries
            }
			
		}
		}
	}
	
}
