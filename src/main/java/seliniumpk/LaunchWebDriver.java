package seliniumpk;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchWebDriver {

	public static WebDriver driver;
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.urlContains("saucedemo"));
	}
}
