package WebDriver.TestNg;

import org.testng.annotations.Test;

public class TimeoutException {
  
  @Test
  public void sampleTestcase() {
	  
	   System.out.println("Im ready to execute");
  }
  
  //FAILED: executeTimeOut  
  //java.lang.ArrayIndexOutOfBoundsException: 0
  @Test(timeOut = 100)
  public void executeTimeOut() throws InterruptedException{
	  
	  Thread.sleep(101);
  }
}
