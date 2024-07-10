package Automation_Assignment_Module7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.EqualsMethod;

/*
 *  W.A.J.Script for Selecting multiple items in a drop dropdown
 */

public class Quest_3 {

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
		 
		 driver.close();
	}
}
