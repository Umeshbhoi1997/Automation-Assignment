package Automation_Assignment_Module7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quest_1_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//	 WebDriver driver=new ChromeDriver();
		 
		 System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 
		
		 
		 driver.get("http://automationpractice.com/index.php");
		 Thread.sleep(1000);
		 
		 driver.manage().window().maximize();
			Thread.sleep(1000);
			
		 
		 driver.close();
	}

}
