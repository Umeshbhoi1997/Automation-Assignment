package Automation_Assignment_Module7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  W.A.J. script to use different methods to manage the windows-alerts
and pop ups
 */

public class Quest_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(1000);
		 
		 driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.name("cusid")).sendKeys("123");
			Thread.sleep(1000);
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(1000);
			
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			
			a1.accept();
			
			Alert a2=driver.switchTo().alert();
			System.out.println(a1.getText());
			
			a2.accept();
			Thread.sleep(2000);
			driver.close();
	}

}
