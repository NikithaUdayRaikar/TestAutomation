package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task7 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		 WebElement but1=driver.findElement(By.xpath("//button[@id='btn']"));
         but1.click();
         WebElement but2=driver.findElement(By.xpath("//button[@id='btn2']"));
         but2.click();
         WebElement but3=driver.findElement(By.xpath("//button[@id='btn4']"));
         but3.click();
         WebElement but4=driver.findElement(By.xpath("//button[@id='btn5']"));
         but4.click();
         WebElement but5=driver.findElement(By.xpath("//button[@id='btn6']"));
         but5.click();
         WebElement but6=driver.findElement(By.xpath("//button[@id='btn7']"));
         but6.click();
         WebElement but7=driver.findElement(By.xpath("//button[@id='btn8']"));
         but7.click();
	}

}
