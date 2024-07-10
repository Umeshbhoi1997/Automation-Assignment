package Automation_Assignment_Module7;


import org.apache.xmlbeans.impl.xb.xsdschema.KeyDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;


public class Quest_9_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		WebElement email= driver.findElement(By.id("email"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(email).click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys("VEER2GMAIL.com")
				.keyUp(email,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
				
		a1.perform();
		Thread.sleep(3000);
		driver.close();

	}

}
