package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quest_1_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("http://ww12.demoaut.com/?usid=27&utid=6238997004");
		 Thread.sleep(1000);
		 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.linkText("Demo Software")).click();
		Thread.sleep(1000);
		
	//	driver.findElement(By.linkText("python Example")).click();
	//	Thread.sleep(1000);
		driver.close();
		
		
	}

}
