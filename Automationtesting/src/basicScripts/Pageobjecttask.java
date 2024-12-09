package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageobjecttask {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		WebElement usn = driver.findElement(By.name("email"));
		usn.sendKeys("User");
		WebElement psw = driver.findElement(By.id("pass"));
		psw.sendKeys("user@123");
		driver.navigate().refresh();
		usn.sendKeys("Useerb");
		psw.sendKeys("Userb");
		driver.quit();

	}

}
