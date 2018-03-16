package WebDriver.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lesson3Annotations {
  
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite Method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Method");
	}
	
	@BeforeGroups(groups = "testOne")
	public void beforeGroupOne(){
		System.out.println("Before Group Method: testOne Group");
	}
	
	@AfterGroups(groups = "testOne")
	public void afterGroupOne(){
		System.out.println("After Group Method: testOne Group");
	}
	
	@BeforeGroups(groups = "testTwo")
	public void beforeGroupTwo(){
		System.out.println("Before Group Method: testTwo Group");
	}
	
	@AfterGroups(groups = "testTwo")
	public void afterGroupTwo(){
		System.out.println("After Group Method: testTwo Group");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("<-- Before each Test Method -->");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("<--After each Test Method -->");
	}
	
	@Test(groups = "testOne")
	public void testOneMethod() {
		System.out.println("***1.Test Method One belongs to group testOne***");
	}
	
	@Test()
	public void testTwoMethod(){
		System.out.println("***2.Test Method Two belongs to group testTwo***");
	}

}
