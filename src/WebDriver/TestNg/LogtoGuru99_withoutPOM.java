package WebDriver.TestNg;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogtoGuru99_withoutPOM {
  
  @Test
  public void loginToGuru99() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Dump Software\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.get("http://demo.guru99.com/v4/");
	  
	  driver.findElement(By.name("uid")).clear();
	  driver.findElement(By.name("uid")).sendKeys("mngr96403");
	  
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys("EsAsaja");
	  
	  String HomePageTitle = driver.getTitle();
	  
	  assertTrue(HomePageTitle.toLowerCase().contains("guru99 bank"));
	  
	  driver.close();
	  
	 }
}
