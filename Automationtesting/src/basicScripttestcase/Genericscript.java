package basicScripttestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericscript 
{
	WebDriver driver;
   public void browsersetup()
   {
	   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
   }
   
   public void closebrowser()
   {
	   driver.quit();
   }
}
