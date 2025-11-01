package seliniumpk;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlin {
	private static WebDriver driver;

	public static void main(String[] args) {
		test();

	}

	
	private static void test() {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(WebElement links:link) {
			String l=links.getAttribute("href");
			
			try {
				
				URL u=new URL(l);
				HttpURLConnection  ul=(HttpURLConnection) u.openConnection();
				ul.connect();
				int code=ul.getResponseCode();
				
				if(code >= 400) {
					System.out.println(ul+"->Its a broken link->"+code);
				}else {
					System.out.println(ul+"->Its not a broken link->"+code);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
		driver.quit();
		
	}

}
