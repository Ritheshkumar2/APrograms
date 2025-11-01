package basestrings;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindows {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		driver=new ChromeDriver();
		driver.get("URL");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		String parentWindow=driver.getWindowHandle();
		Set<String> childwindow=driver.getWindowHandles();  //set will not allow duplicate values
		
		Iterator<String> i=childwindow.iterator();
		
		while(i.hasNext()) {
			String child=i.next();
			  if (!child.equals(parentWindow)) { // ✅ skip parent
			        driver.switchTo().window(child);
			        // logic for child window
			        driver.close(); // optional: close child if needed
			    }
			
		}
		driver.switchTo().window(parentWindow);
		//driver.switchTo().defaultContent();//-->when we use frames concept it will work
		//driver.switchTo().window(windowHandle) → switches between browser windows/tabs.
		//driver.switchTo().frame(frameName / frameIndex / WebElement) → switches to a frame inside the page
		//driver.switchTo().defaultContent() → switches back from any frame to the main page content.
		
		
		
		
	}

}
