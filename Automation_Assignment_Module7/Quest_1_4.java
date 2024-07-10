package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quest_1_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://the-internet.herokuapp.com/");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.linkText("A/B Testing")).click();
		 Thread.sleep(2000);
		 
		 driver.close();
	}

}
