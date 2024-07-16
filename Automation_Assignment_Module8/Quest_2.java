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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 *  W.a.framework program for keyword driven framework
 */
public class Quest_2 {

	@DataProvider(name="tanvi")
	public Object[][] readData() throws InvalidFormatException, IOException {
		Object[][] data=null;
		
	// 1. To select particular file 
		String filepath	="D:\\selenium\\Assignment.xlsx";
		
    // 2. to make a file
		File file=new File(filepath);
		
    // 3. To open this excel file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
	// 4.To open a particular sheet
		Sheet sheet=workbook.getSheet("Sheet2");
		
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

	WebDriver driver=null;
	@Test(dataProvider="tanvi")
	public void test (String keyword) throws InvalidFormatException, IOException, InterruptedException {
	//	Object [][] data=readData();
		System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		if (keyword.equals("open browser")) {
			 driver=new EdgeDriver();
			//	WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
		} else if (keyword.equals("open url")) {
			
			driver.get("https://www.inmotionhosting.com/?_gl=1*"
					+ "1h1vhz0*_gcl_au*NTEyODQ5NDQxLjE3MjEwMTE3NDY.&pk_vid=6cba7acb26735e911721012908b5db68");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}else if (keyword.equals("Click signin")) {
			driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/div[3]/a")).click();
			Thread.sleep(1000);
			
		} else if (keyword.equalsIgnoreCase("enter Username")) {
			
			driver.findElement(By.id("username")).sendKeys("rahul@gmail.com");
			Thread.sleep(1000);
			
		} else if (keyword.equals("enter password")) {
			
			driver.findElement(By.id("password")).sendKeys("rahul");
			Thread.sleep(2000);
		}else if (keyword.equals("click login")) {
			
			driver.findElement(By.id("login-submit")).click();
			Thread.sleep(1000);
		} else if (keyword.equals("close browser")) {
			driver.close();
		}
		

		
	}
}
