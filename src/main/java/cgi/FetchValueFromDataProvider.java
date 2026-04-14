package cgi;

import org.testng.annotations.Test;

public class FetchValueFromDataProvider {
	
	@Test(dataProvider="testdata",dataProviderClass=cgi.DataProviderRelated.class)
	public void testone(String username,String password) {
		System.out.println(username+"-->"+password);
	}

}
