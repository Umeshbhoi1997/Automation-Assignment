package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * 1. Practice website:
 * 
 * https://phptravels.com/demo/
 */

 public class Quest_1_1 {
	 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 
		 driver.get("https://phptravels.com/demo/");
		 Thread.sleep(1000);
		 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("first_name")).sendKeys("Veer");
		Thread.sleep(1000);
		
		driver.findElement(By.name("last_name")).sendKeys("patel");
		Thread.sleep(1000);
		
		driver.findElement(By.name("business_name")).sendKeys("IT works");
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("veer@gmail.com");
		Thread.sleep(10000);
		
		
		driver.findElement(By.id("demo")).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}
		
	
	

}
