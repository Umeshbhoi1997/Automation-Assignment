package Automation_Assignment_Module7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quest_1_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("http://thedemosite.co.uk/");
		 Thread.sleep(1000);
		 driver.close();
	}

}
