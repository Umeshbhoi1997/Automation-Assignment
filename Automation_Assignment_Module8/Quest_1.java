package Automation_Assignment_Module8;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

/*
 *  W.a.framework program for data driven framework
 */

public class Quest_1 {

	public String[][] readData() throws InvalidFormatException, IOException {
		String[][] data=null;
		
	// 1. To select particular file 
		String filepath	="D:\\selenium\\Assignment.xlsx";
		
    // 2. to make a file
		File file=new File(filepath);
		
    // 3. To open this excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
	// 4.To open a particular sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		
	// 5. To check Total row 
		int nrow=sheet.getPhysicalNumberOfRows();
		System.out.println("Total no. of rows"+nrow);
		
		data=new String[nrow][];
		
		for (int i = 0; i < data.length; i++) 
		{
		
	      // 6. To select a Row
			Row row=sheet.getRow(i);
			
		 //  7.To check total Col
			
			int col=row.getPhysicalNumberOfCells();
			System.out.println(" Total no. col"+col);
			
			data[i]=new String[col];
			 
			for (int j = 0; j < data[i].length; j++) {
				Cell cell=row.getCell(j);
				
		 // 8. To convert cell value into String
				cell.setCellType(CellType.STRING);
				
		// 9.To get value from cell
				data[i][j]=cell.getStringCellValue();
			}
		
		}
		return data;

	}

	@Test
	public void test () throws InvalidFormatException, IOException, InterruptedException {
		String [][] data=readData();
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		for (int i = 0; i < data[i].length; i++) {
			WebDriver driver=new EdgeDriver();
		//	WebDriver driver=new ChromeDriver();	
	
				driver.get("https://secure1.inmotionhosting.com/index/login");
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				
				driver.findElement(By.id("username")).sendKeys(data[i][0]);
				Thread.sleep(1000);
				
				driver.findElement(By.id("password")).sendKeys(data[i][1]);
				Thread.sleep(2000);
				
				driver.findElement(By.id("login-submit")).click();
				Thread.sleep(2000);
				
				driver.close();
		
		}
	}
}
