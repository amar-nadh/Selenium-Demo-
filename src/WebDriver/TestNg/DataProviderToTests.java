package WebDriver.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderToTests {
 
	
	
 @Test(dataProvider="getData")
  public void setData(String uname, String pwd) {
	 
	 System.out.println("You have Provided username as: " + uname);
	 System.out.println("You have Provided password as: " + pwd);
		 
  }
 
 @DataProvider
 public String[][] getData()
 {
	 String [][] data=new String[3][2];
	 
		 data[0][0] = "Username1";
		 data[0][1] = "Password1";
				 
		 data[1][0] = "Username2";
		 data[1][1] = "Password2";
				 
		 data[2][0] = "Username3";
		 data[2][1] = "Password3";
		 
		 return data;
 }
 
 
}
