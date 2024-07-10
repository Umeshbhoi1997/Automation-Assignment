package Automation_Assignment_Module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*
 *  W.A.J. Script To find the total hyperlink from this web page
 */

public class Quest_11 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		List<WebElement> th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total no of column:- "+th.size());
		
		List<WebElement> tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total no of Row:- "+tr.size());
		
		for (int i = 1; i <=tr.size(); i++) {
			for (int j = 1; j <=th.size(); j++) {
				String data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("      |     "+data);
			}
			System.out.println();
			Thread.sleep(1000);
		}
		
	Thread.sleep(1500);
	driver.close();
	}
	

}
