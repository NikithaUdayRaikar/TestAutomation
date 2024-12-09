package basicScripts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class taskdropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement dropdown =driver.findElement(By.id("month"));
		Select s=new Select(dropdown);
		     List<WebElement> opts = s.getOptions();
		     int optcount=opts.size();
		 	System.out.println(optcount);
		 	  ArrayList<String> arr = new ArrayList<String>();
			for(int i=0;i<optcount;i++)
				{
				WebElement opt=opts.get(i);
				String txt=opt.getText();
				arr.add(txt);
				System.out.println(txt);
				}
			Collections.sort(arr,Collections.reverseOrder());
			for (String ar:arr)
			{
				System.out.println(ar);
			}
			Thread.sleep(2000);
			driver.close();
		}

	


	}


