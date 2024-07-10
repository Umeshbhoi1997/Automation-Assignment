package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *  W.A.J.Script To write a script for drop down.
 */

public class Quest_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 Thread.sleep(1000);
		 
		 driver.manage().window().maximize();
			Thread.sleep(1000);
			
	WebElement e1=driver.findElement(By.name("country"));
		 Thread.sleep(1000);
		 Select s1=new Select(e1);
		 
		 s1.selectByIndex(10);
		 Thread.sleep(1000);
		 
		 s1.selectByVisibleText("INDIA");
		 Thread.sleep(1000);
		 
		 for (int i = 0; i<=10; i++) {
			 s1.selectByIndex(i);
			 Thread.sleep(1000);
			 
			 if (i==8) {
				 break;
				
			}
			
		}
		 
		 driver.close();

	}

}
