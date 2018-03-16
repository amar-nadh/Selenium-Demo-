package WebDriver.TestNg;

import org.testng.annotations.Test;


public class SimpleDependencyTest {
	
 @Test(dependsOnMethods = {"testThree"})
  public void testOne() {
	System.out.println("Test Method One");
  }

 @Test
  public void testTwo(){
	  System.out.println("Test Method Two");
	}

 @Test
 public void testThree(){
	System.out.println("Test Method Three");
	}
}
