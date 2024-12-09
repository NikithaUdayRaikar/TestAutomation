import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Writemultipledata {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int nooflinks = links.size();
        XSSFWorkbook book=new XSSFWorkbook();
        XSSFSheet sheet=book.createSheet("Flipkartlinks");
        for(int i=0;i<nooflinks;i++)
        {
        	WebElement link = links.get(i);
        	String url = link.getAttribute("href");
        	XSSFRow row=sheet.createRow(i);
        	XSSFCell cel=row.createCell(0);
        	cel.setCellValue(url);
        	
        }
        FileOutputStream fos=new FileOutputStream("./Testdata/Flipkartlinks.xlsx");
        book.write(fos);
        book.close();
        fos.close();        }

}