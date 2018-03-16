package WebDriver.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebdriverTestNgClass {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Dump Software\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.scooptimes.com/television/star-maa-bigg-boss-vote-telugu-details/9654");
		
			
	}

	
  @Test
  public void calculatePercentage() throws InterruptedException {
	  
	  driver.findElement(By.id("PDI_answer44858660")).click();
  
	  driver.findElement(By.id("pd-vote-button9804561")).click();
	  
	  driver.findElement(By.className("pds-view-results")).click();
	  
	  System.out.println("NUmber of Votes: " + driver.findElement(By.className("pds-feedback-votes")).getText());
	  
 }
  
  
  @AfterTest
  public void Teardown()
  {
	  driver.close();
  }
  
  
  
}
