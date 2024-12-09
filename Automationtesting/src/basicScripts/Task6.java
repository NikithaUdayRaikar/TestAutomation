package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		 WebElement nam=driver.findElement(By.id("name"));
		 nam.sendKeys("Nikitha Uday Raikar");
		 WebElement eml=driver.findElement(By.xpath("//input[@id='email']"));
		 eml.sendKeys("nikitharaikar58@gmail.com");
		 WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		 pwd.sendKeys("niki@123");
		 WebElement butt=driver.findElement(By.xpath("//button[@type='submit']"));
		 butt.click();
	}

}
