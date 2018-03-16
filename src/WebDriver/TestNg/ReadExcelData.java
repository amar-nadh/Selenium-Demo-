package WebDriver.TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelData {
	
	WebDriver driver = null;
	WebDriverWait wait = new WebDriverWait(driver, 5);
	String baseUrl = "https://www.linkedin.com/";
	
	private By byEmail = By.id("login-email");
	private By byPasswd = By.id("login-password");
	private By bySubButton = By.id("login-submit");
	private By byError = By.id("global-alert-queue");
	
		
	@Before
	public void testSetUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Dump Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(String Uname, String Pwd){
		driver.navigate().to(baseUrl);
		
		driver.findElement(byEmail).clear();
		driver.findElement(byEmail).sendKeys(Uname);
		driver.findElement(byPasswd).clear();
		driver.findElement(byPasswd).sendKeys(Pwd);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySubButton));
		driver.findElement(bySubButton).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(byError));
		String actErrorText = driver.findElement(byError).getText();
		String expText = "Please correct the marked field(s) below.";
		
		Assert.assertEquals(actErrorText, expText);
		
	}
	
	@DataProvider(name ="empLogin")
	public Object[][] loginData(){
		
		Object[][] arryObject = getExcelData("C:\\Education\\ExamplePoiData.xls","Sheet1");
		
		return arryObject;
	}
	
	
	
	@AfterTest
	public void tearDown(){
		
		driver.close();
		driver.quit();
	}
	
	
	
	
	public String[][] getExcelData(String filename, String sheetname){
		
		String[][] excelData = null;
		
		try {
			FileInputStream fis = new FileInputStream(filename);
			
			Workbook wb = Workbook.getWorkbook(fis);
			
			Sheet sh = wb.getSheet(sheetname);
			
			int totalNumberOfCols = sh.getColumns();
			int totalNumberOfRows = sh.getRows();
			
			excelData = new String[totalNumberOfRows-1][totalNumberOfCols];
			
			for (int i =1; i < totalNumberOfCols; i++){
				for (int j=0; j< totalNumberOfRows; j++)
				{
					excelData[i-1][j] = sh.getCell(j,i).getContents();
				}
			}
			
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return excelData;
		
	}
}
