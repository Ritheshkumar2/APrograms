package cgi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MainClassExtentReports {
	
	ExtentReports extent=ExtentReportsRelated.getinstance();
	ExtentTest test;
	
	@BeforeClass
	public void setUp() {
		test=extent.createTest("LoginTest");
	}
	
	@Test
	public void testone() {
		test.pass("");
		test.fail("");
		test.skip("");
		test.log(Status.PASS, "");
	}
	
	@AfterClass
	public void tearDown() {
		extent.flush();
	}

}
