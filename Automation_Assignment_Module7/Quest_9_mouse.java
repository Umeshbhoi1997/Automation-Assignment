package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



/*
 *  W.A.J.Script To use Mouse and Keyboard event using Action class Mouse Hover Event
 */

public class Quest_9_mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//		 ChromeDriver driver=new ChromeDriver();
			 
			 
			 System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				
			 driver.get("https://demo.guru99.com/test/newtours/register.php");
			 Thread.sleep(1000);
			 
			 driver.manage().window().maximize();
				Thread.sleep(1000);
				
				WebElement home=driver.findElement(By.linkText("Home"));
				WebElement flights=driver.findElement(By.linkText("Flights"));
				WebElement hotels=driver.findElement(By.linkText("Hotels"));
				
				Actions actions=new Actions(driver);
				Thread.sleep(1000);
				
				Action a1=actions.moveToElement(home).build();
				a1.perform();
				Thread.sleep(1000);
				
				Action a2=actions.moveToElement(flights).build();
				a2.perform();
				Thread.sleep(1000);
				
				Action a3=actions.moveToElement(hotels).build();
				a3.perform();
				Thread.sleep(1000);
				
				driver.close();
				
				
		
	}

}
