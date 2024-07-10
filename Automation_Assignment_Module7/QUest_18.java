package Automation_Assignment_Module7;

/*
 * /*
 *  W.a. TestNG program to use parameterized demo with multiple
parameter of Facebook login with TestNG.
 */
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QUest_18 {
	

	WebDriver driver;
	
	
	  @Test
	  @Parameters({"username","password"})
	  public void f(String username, String password) throws InterruptedException {
		  
		  System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("email")).sendKeys(username);
			Thread.sleep(1000);
			
			driver.findElement(By.id("pass")).sendKeys(password);
			Thread.sleep(1000);
			
			driver.findElement(By.name("login")).click();
			Thread.sleep(1000);
			
			driver.close();
			
	  }
}

