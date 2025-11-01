package basestrings;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShotMethod {

	private static WebDriver driver;
	public static void main(String[] args) throws IOException {
		test();

	}

	private static void test() throws IOException {
		//For arrays, strings, chars, and lists → use i < length or i <= length-1.
       //Never use i <= length, otherwise you’ll get IndexOutOfBoundsException. 
       // For sets → no indexing, use iterator or for-each.
		
		TakesScreenshot  ss=(TakesScreenshot)driver;//TakeScreenShot is an interface
		
		File src=ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(""));
		
		
		
	}

}
