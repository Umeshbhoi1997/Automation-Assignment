package Automation_Assignment_Module7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  W.A.J. script To write the script for image of logo facebook using xpath.
 */

public class Quest_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 
		 driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.name("email")).sendKeys("ubhoi1997@gmail.com");
			Thread.sleep(1000);
			
			driver.findElement(By.name("pass")).sendKeys("umesh@fb");
			Thread.sleep(1000);
			
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			
	//		driver.findElement(By.xpath("//*[@id=\"mount_0_0_mp\"]/div/div[1]/div/div[2]/div[1]/a/svg/path[1]")).click();
			Thread.sleep(1000);
			
			
			
			driver.close();
			

	}

}
