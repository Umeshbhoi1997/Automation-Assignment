package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * w.a. TestNG program to create dataprovider.
 */

public class Quest_20 {

	WebDriver driver;
	
	@DataProvider(name="umesh")
	public Object[] [] input(){
		return new Object[] [] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
	}
	
	@Test(dataProvider = "umesh")
	
	public void test(String username, String password) throws InterruptedException {
		
		
System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
		driver.close();
	}

}
