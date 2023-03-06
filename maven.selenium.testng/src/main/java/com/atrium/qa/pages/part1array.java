package com.atrium.qa.pages;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class part1array {
	

WebDriver driver;
	
	@BeforeTest
    public void launchapp() {
        
        System.setProperty("webdriver.chrome.driver", "C:\\JavaWorkspace\\chrome_driver\\chromedriver.exe");
        driver =  new ChromeDriver();
       // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       // Launch website
       driver.navigate().to("https://atrium8.my.salesforce.com/");
       driver.manage().window().maximize();
    }    

       
       @Test
       public void login() 

       {
       

       driver.manage().window().maximize();
       WebElement username=driver.findElement(By.id("username"));
       WebElement password=driver.findElement(By.id("password"));

       WebElement login=driver.findElement(By.name("Login"));

       username.sendKeys("testuserautomation007-l2r3@force.com");

       password.sendKeys("testuser@123");

       login.click();
       
     

       String actualUrl="https://atrium5.lightning.force.com/lightning/page/home";

       String expectedUrl= driver.getCurrentUrl();
       System.out.println(expectedUrl);
       Assert.assertEquals(expectedUrl,actualUrl);

       }
       
      
      
       
       
       @AfterTest
       public void terminatetest() {
          driver.close();
       }
        
    
}
