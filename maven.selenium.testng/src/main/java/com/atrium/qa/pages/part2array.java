package com.atrium.qa.pages;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class part2array {

	
	@Test
    public void test() {  
    
    	System.setProperty("webdriver.chrome.driver", "C:\\\\JavaWorkspace\\\\chrome_driver\\\\chromedriver.exe");
    	WebDriver d = new ChromeDriver();
    //profile login
   /*
    d.get("https://accounts.google.com/v3/signin/identifier?dsh=S2030367859%3A1669370784742312&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAvLAJj6WMwUPwXy3mCyWF-f_-CzpoS_LefXKgu3QocCdnEoGEYap0RhcmrSyhn9WGhKdrzG-Q");
    d.findElement(By.id("identifierId")).sendKeys("testusertesting05@gmail.com");
    d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();  
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("testuser@123");
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
    
   
    
    d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

    ArrayList<String> tabs = new ArrayList<String> (d.getWindowHandles());
    d.switchTo().window(tabs.get(0)); //switches to new tab
    */
    d.get("https://atriuminsights--preprod.sandbox.lightning.force.com/lightning/o/ArdiraSurvey__Survey__c/list?filterName=Recent");
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.findElement(By.id("username")).sendKeys("qatestautomation@atrium.ai");
    d.findElement(By.id("password")).sendKeys("Atrium@123");
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    d.findElement(By.xpath("//*[@id=\"Login\"]")).click();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //d.findElement(By.xpath("//*[@id=\"editPage\"]/p[2]/a[1]")).click();
  
    
    
    String expectedUrl = "https://atriuminsights--preprod.sandbox.lightning.force.com/lightning/o/ArdiraSurvey__Survey__c/list?filterName=Recent";
    d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    String actualUrl= d.getCurrentUrl();
    System.out.println(actualUrl);
    //Assert.assertEquals(expectedUrl,actualUrl);
    //campaign record creation
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]")).click();
    d.findElement(By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li/a/div")).click();
    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[1]/div[1]/div/div/div/input")).sendKeys("Test Pallav 2");
    //campaign :- check field "clicks" presence on layout
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[4]/div[2]/div/div/div/input")).click();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[5]/div[2]/div/div/div/input")).click();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div[1]/div/div/div[3]/div[1]/div/div/div/input")).click();
    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/button[3]/span")).click();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    String value = "123456";
    
    d.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div/div/section/div/div/article/div[2]/div/div[1]/div/div/div[4]/div[2]/div/div[2]/button/lightning-primitive-icon")).click();
    d.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div/div/section/div/div/article/div[3]/div/div[1]/div/div[1]/div/div/div[4]/div[2]/div/div/div/input")).sendKeys(value);
    
    d.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div/div/section/div/div/article/div[3]/div/div[2]/div/div/div[2]/button[2]")).click();
    
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    String actual_error= d.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div/div/section/div/div/article/div[3]/div/div[1]/div/div[1]/div/div/div[4]/div[2]/div/div/ul/li")).getText();
    //System.out.println(actual_error);
    String expected_error="Clicks: value outside of valid range on numeric field:"+" "+value;

    Assert.assertEquals(actual_error, expected_error);
    
    //d.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div/div/section/div/div/article/div[2]/div/div[1]/div/div/div[5]/div[2]/div/div[2]/button/lightning-primitive-icon")).click();
    
    
// d.close();
  }
/*@Test
public void creatCampaign() {
	
	test();
	//System.setProperty("webdriver.chrome.driver", "C:\\\\JavaWorkspace\\\\chrome_driver\\\\chromedriver.exe");
    //WebDriver d = new ChromeDriver();
    d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    d.findElement(By.xpath("//*[@id=\"458:85;a\"]/div")).click();
    d.findElement(By.id("input-94")).sendKeys("sales");
    d.findElement(By.xpath("//*[@id=\"07p2w000000adVBAAY\"]/div/lightning-formatted-rich-text/span/p/b")).click();
  
    
}*/
}