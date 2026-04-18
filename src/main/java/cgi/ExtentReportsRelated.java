package cgi;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsRelated {
	
	public static ExtentReports extent;
	
	public static ExtentReports getinstance() {
		ExtentSparkReporter path=new ExtentSparkReporter("");
		extent = new ExtentReports();
		extent.attachReporter(path);
		return extent;	
	}

}
