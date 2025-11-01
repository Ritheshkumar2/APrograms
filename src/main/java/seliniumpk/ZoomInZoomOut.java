package seliniumpk;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomInZoomOut {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		test();

	}

	private static void test() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.urlContains("saucedemo"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='150%'","");
		
		Thread.sleep(2000);
	
		js.executeScript("document.body.style.zoom='50%'","");
		
		Thread.sleep(2000);
		
		js.executeScript("document.body.style.zoom='100%'","");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
