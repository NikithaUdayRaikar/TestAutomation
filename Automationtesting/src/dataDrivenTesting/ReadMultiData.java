package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMultiData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis =new FileInputStream("./Testdata/Facebook.Credentials.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(fis);
        XSSFSheet sheet= workbook.getSheet("sheet1");
        XSSFRow row= sheet.getRow(1);
        XSSFCell cell=row.getCell(0);
        String val =cell.getStringCellValue();
        XSSFRow row1= sheet.getRow(1);
        XSSFCell cell1=row1.getCell(1);
        String val1 =cell1.getStringCellValue();
    
      
        
        System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(val);
		driver.findElement(By.id("pass")).sendKeys(val1);
		
		
        

	}

}
