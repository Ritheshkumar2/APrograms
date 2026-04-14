package cgi;

import org.openqa.selenium.WebDriver;

public class ValidateConfigFile {
	
	public WebDriver driver;
	
	public ValidateConfigFile(WebDriver driver) {
		this.driver=driver;
	}
	
	public void testone() {
		String username=ConfigProperties.getProperty("username");// variable name should be same as variable in config properties file
	}

}
