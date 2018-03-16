package WebDriver.TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BasicTestNgAnnotations{
  
  @Test
  public void Test1() {
	  
	  System.out.println("Test1 method");
  }
  
  @Test
  public void Test2(){
	  System.out.println("Test2 method");
  }
  
  @Test
  public void Test3(){
	  System.out.println("Test3 method");
  }
  
  public void test4()
  {
	  System.out.println("i am subset of test3");
  }
  

  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After method");
  }

  @BeforeTest
  
  public void beforeTest() {
	  
	  System.out.println("I am before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("I am after test annotation");  

  }
  
  @BeforeClass
  public void beforeclass(){
	  System.out.println("Executed before class");
  }
  
  @AfterClass
  public void afterclass(){
	  System.out.println("Executed after class");
  }

}
