package cgi;

import org.testng.annotations.DataProvider;

public class DataProviderRelated {
	
	@DataProvider(name="testdata")
	public static Object[][] dataproviderrelatedmethod() {
		return new Object[][]{{"user1","password1"},{"user2","password2"}};
	}

}
