package seliniumpk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class OptimizedScreenshot implements ITestListener{
	
	public WebDriver driver;
	public void onTestFailure(ITestResult result) {
	
	if(LaunchWebDriver.driver != null && result.getStatus() == ITestResult.FAILURE) {
		TakesScreenshot ts=(TakesScreenshot)LaunchWebDriver.driver;
		File input=ts.getScreenshotAs(OutputType.FILE);
		String path="C:/Users/hp/eclipse-workspace/APrograms/test-output"+ "/" + result.getName() + "_error.png";
		try {
			FileUtils.copyFile(input, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
}
