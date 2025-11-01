package seliniumpk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seliniumpk.OptimizedScreenshot.class)
public class MainClass extends LaunchWebDriver{

	
	@BeforeMethod
	public void launchURL() {
		LaunchWebDriver obj=new LaunchWebDriver();
		obj.launch();
	}
	
	@Test(priority=1)
	public void test() {
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("Rithesh");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Rithesh");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Assert.assertTrue(false);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
