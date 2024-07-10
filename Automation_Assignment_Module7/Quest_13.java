package Automation_Assignment_Module7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 *  W.a. junit program to perform test with webdriver to login process of
facebook

 */

public class Quest_13 {

	WebDriver driver=null;
	@Before
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		 driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	@Test
	public void runtest() throws InterruptedException {
	driver.findElement(By.id("email")).sendKeys("ubhoi1997@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.id("pass")).sendKeys("umesh@fb");
	Thread.sleep(1000);
	
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	}
	
	@After
	public void closebrowser() {
		driver.close();
		
	}
}
