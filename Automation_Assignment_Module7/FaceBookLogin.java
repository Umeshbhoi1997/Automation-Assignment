package Automation_Assignment_Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Quest-15
 */
public class FaceBookLogin {

public void Login(String email,String password) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		driver.findElement(By.id("email"))
		.sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("pass"))
		.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		Thread.sleep(5000);
		
		driver.close();
	
	}

}
