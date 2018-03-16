package pom.demo.guru.automate.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuruLoginPage {
  
    WebDriver driver;
    
    // By user99GuruName = By.name("uid");
    //By password99Guru = By.name("password");
    //By titleText =By.className("barone");
    //By login = By.name("btnLogin");

     public GuruLoginPage(WebDriver driver){

         this.driver = driver;
     }

    //Set user name in text box

     public void setUserName(String strUserName){

         driver.findElement(By.name("uid") ).sendKeys(strUserName);

     }

     //Set password in password text box

     public void setPassword(String strPassword){

          driver.findElement(By.name("password")).sendKeys(strPassword);

     }

     //Click on login button

     public void clickLogin(){

      driver.findElement(By.name("btnLogin")).click();

     } 

     
     //Get the title of Login Page

     public String getLoginTitle(){

     return    driver.findElement(By.className("barone")).getText();

     }

     /**

      * This POM method will be exposed in test case to login in the application

      * @param strUserName

      * @param strPasword

      * @return

      */
     
     public void loginToGuru99(String strUserName,String strPasword){
    	 
    	//Fill user name

         this.setUserName(strUserName);

         //Fill password

         this.setPassword(strPasword);


         driver.findElement(By.name("btnLogin")).click();       
         
     }
 }
