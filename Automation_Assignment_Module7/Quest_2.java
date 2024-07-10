package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  W.A.J.Script for Locating links by linkText() and partialLinkText()

 */

public class Quest_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://the-internet.herokuapp.com/");
		 Thread.sleep(1000);
		 
	//	 driver.findElement(By.linkText("A/B Testing")).click();
	//	 Thread.sleep(2000);
		 
		 driver.findElement(By.partialLinkText("Basic Auth")).click();
		 Thread.sleep(1000);
		 driver.close();
	}

}
