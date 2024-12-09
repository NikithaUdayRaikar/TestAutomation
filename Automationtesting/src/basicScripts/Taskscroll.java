package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Taskscroll {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amozon.com");
        Thread.sleep(2000);
        
        
       WebElement ele = driver.findElement(By.className("nav_a"));
        Point loc = ele.getLocation();
        int x=loc.getX();
        int y=loc.getY();
        
        ele.click();
       
	}

}
