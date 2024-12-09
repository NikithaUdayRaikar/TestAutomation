package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Htmlcode/task2.html");
	    WebElement usn=driver.findElement(By.id("t1"));
	    usn.sendKeys("Nikitha");
	    Thread.sleep(2000);
	    WebElement psw=driver.findElement(By.name("n1"));
	    psw.sendKeys("12345");
	    Thread.sleep(2000);
	    WebElement com=driver.findElement(By.className("c1"));
	    com.sendKeys("12345");
	    Thread.sleep(2000);
	    usn.clear();
	    Thread.sleep(2000);
	    WebElement link=driver.findElement(By.partialLinkText("Facebook"));
	    link.click(); 
	   
	      
	      
		

	}

}
