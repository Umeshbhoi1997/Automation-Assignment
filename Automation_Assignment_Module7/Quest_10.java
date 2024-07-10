package Automation_Assignment_Module7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *  W.A.J. Script How to handled Alert in selenium

 */
public class Quest_10 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String main_w=driver.getWindowHandle();
		System.out.println(" Main window : "+main_w);
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(1000);
		Set<String> all_w=driver.getWindowHandles();
		Iterator<String>i1=all_w.iterator();
		while (i1.hasNext()) {
			String child_w = (String) i1.next();
			System.out.println(" child window : "+child_w);
			
			if (!main_w.equals(child_w)) {
				driver.switchTo().window(child_w);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("t@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(1000);
				
				driver.close();
				
			}
			
		}
		 driver.switchTo().window(main_w);
		 Thread.sleep(2000);
		 driver.close();
	}


}
