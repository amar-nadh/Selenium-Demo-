package WebDriver.TestNg;

import org.testng.annotations.Test;

public class TestGroupsExample {
  
  @Test(groups = "Regression")
  public void testCaseOne () {
  	  System.out.println("TestCase1 - Regression group");
	}
  
  @Test(groups = "Regression")
  public void testCaseTwo () {
  	  System.out.println("TestCase2 - Regression group");
	}
  
  @Test(groups = {"Regression", "Smoke"})
  public void testCaseThree () {
  	  System.out.println("TestCase3 - Regression and Smoke group");
	}
  @Test(groups = "Smoke")
  public void testCaseSM1 () {
  	  System.out.println("Smoke TestCase1 - Smoke group");
	}
  
  @Test(groups = "Smoke")
  public void testCaseSM2 () {
  	  System.out.println("Smoke TestCase2 - Smoke group");
	}
  
}
