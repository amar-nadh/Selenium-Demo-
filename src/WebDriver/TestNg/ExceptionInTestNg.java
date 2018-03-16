package WebDriver.TestNg;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ExceptionInTestNg {
  private static final boolean DataAvailable = false;

@Test (expectedExceptions = ArithmeticException.class, priority =1)
  public void divisibleByZeor1() {
	  
	  int e = 10 /0;
	  
	  System.out.println("Value of E: "+e);
	  
  }
  
  @Test(priority =0)
  public void divisibleByZero2(){
	  
	  int e = 10/0;
	  System.out.println("Value of E: "+e);
  }
  
  @Test(enabled =false)
  
  public void testcaseEnabling(){
	  
	  System.out.println("I'm not Ready, Please Execute me");
  }
  
  @Test(enabled = true)
  
  public void testCaseSkipException(){
	  
	  System.out.println("Im in SkipException");
	  throw new SkipException("Skipping this exception");
	 
  }
  
  @Test()
  
  public void testcaseConditionalSkipException(){
	  System.out.println("Im in condtional Skip");
	  
	  if(!DataAvailable)
	  {
		  throw new SkipException("Skipping this exception");
		  
	  }
	  
	  System.out.println("Executed Successfully");
  }
  
}
