package com.app;


import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class ASDM 
{

	 public static void main(String args[]) throws InterruptedException { 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\group002\\Desktop\\VerizonWireless\\src\\com\\app\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	  
	  driver.get("https://accounts.google.com/SignUp");
	  
	   
	  driver.manage().window().maximize(); 
	 
	  Thread.sleep(2000);
	  driver.findElement(By.id("firstName")).sendKeys("Raj");
      driver.findElement(By.id("lastName")).sendKeys("Randive");
      Thread.sleep(2000);
      driver.findElement(By.id("username")).sendKeys("prithvi");
      Thread.sleep(2000);
      driver.findElement(By.name("Passwd")).sendKeys("password");
      driver.findElement(By.name("ConfirmPasswd")).sendKeys("password");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
	   
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	   
	   }
		
}
