package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
	    File perm=new File("./Screenshots/Defect1.png");
	    FileHandler.copy(temp, perm);
	    driver.quit();

	}

}
