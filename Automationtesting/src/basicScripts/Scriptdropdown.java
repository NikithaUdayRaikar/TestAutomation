package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scriptdropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/dropdown.html");
		WebElement drop=driver.findElement(By.id("Celebrities"));
		Select s=new Select(drop);
		List<WebElement> opts=s.getOptions();
		int optscount=opts.size();
		System.out.println(optscount);
		for(int i=0;i<optscount;i++)
			{
			WebElement opt=opts.get(i);
			String txt=opt.getText();
			System.out.println(txt);
			}
		Thread.sleep(2000);
		driver.close();
	}

}
