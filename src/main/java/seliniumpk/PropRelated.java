package seliniumpk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropRelated {
	
	private static WebDriver driver;
	
	private static void test() throws IOException {
		Properties prop=new Properties();
		FileInputStream object=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\APrograms\\src\\main\\java\\utils\\Config.properties");
		
		prop.load(object);
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.get("");
	}
}
