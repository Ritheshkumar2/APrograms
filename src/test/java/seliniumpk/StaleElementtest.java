package seliniumpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementtest {

	private static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		 driver.get("");
		 
		 StaleElementRealatedHandingExceptionWIthRetry obj=new StaleElementRealatedHandingExceptionWIthRetry(driver);
		 obj.clickRetryElement(By.id(""), 3);

	}

}
