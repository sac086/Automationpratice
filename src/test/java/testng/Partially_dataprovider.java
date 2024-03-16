package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Partially_dataprovider {

	@Test(dataProvider = "dp1")
	public void TestLogin(String s) throws Exception {
		System.out.println(s);
	}

	@DataProvider(indices= {0,2})
	public String[] dp1() {
		String[] data = new String[] {
				"sachin",
				"Jhon",
				"Rebecca",
				"Smith"
		};
		return data;
	}

}



