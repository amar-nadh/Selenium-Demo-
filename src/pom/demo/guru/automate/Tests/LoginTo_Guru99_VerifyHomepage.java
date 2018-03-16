package pom.demo.guru.automate.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.demo.guru.automate.Pages.Guru99HomePage;
import pom.demo.guru.automate.Pages.GuruLoginPage;

public class LoginTo_Guru99_VerifyHomepage {
  
	public WebDriver driver = null;
	String strUserName= "mngr96403 ";
	String strPassword = "EsAsaja";
	Guru99HomePage objHome;
	GuruLoginPage objLogin;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Dump Software\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
	}
	
	
	@Test	
	public void test_Home_Page_Appear_Correct(){
   	//Create Login Page object
	objLogin = new GuruLoginPage(driver);
		
	//Verify login page title
	String loginPageTitle = objLogin.getLoginTitle();
   
	System.out.println("Login Page Title is: " + loginPageTitle);
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application
	objLogin.loginToGuru99("mngr96403 ", "EsAsaja");
	     
	    
	// go the next page
    objHome = new Guru99HomePage(driver);

    //Verify home page
    System.out.println(objHome.getHomePageDashboardUserName());
    Assert.assertTrue(objHome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr96403"));
	}
	
	
	
	@AfterTest
	public void Exit()
	{
		driver.close();
		driver.quit();
	}
	
}
	
		

