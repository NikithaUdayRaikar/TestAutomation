package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Htmlcode/task2.html");
		WebElement link=driver.findElement(By.partialLinkText("Facebook"));
	    link.click(); 
	    WebElement Usn=driver.findElement(By.name("email"));
	    Usn.sendKeys("Nikitha Uday Raikar");
	    WebElement pwd=driver.findElement(By.name("pass"));
	    pwd.sendKeys("1235");
	    WebElement log=driver.findElement(By.name("login"));
	    log.click();
	    
	    

	}

}
