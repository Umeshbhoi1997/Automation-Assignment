package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  W.A.J. Script To perform the radio button to select one by one in loop
 */

public class Quest_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/radio.html");
		 Thread.sleep(1000);
		 
		 driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.id("vfb-7-1")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("vfb-7-2")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("vfb-7-3")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("vfb-6-0")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("vfb-6-1")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("vfb-6-2")).click();
			Thread.sleep(1000);
			
			
			driver.close();

	}

}
