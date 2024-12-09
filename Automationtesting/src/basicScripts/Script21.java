package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Script21 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/Htmlcode/page.html");
		WebElement USN =driver.findElement(By.xpath("//input[@type='text'][1]"));
		if(USN.isDisplayed())
		{
		  if (USN.isEnabled())
		  {
			  USN.sendKeys("admin");
			  
		  }
		  else
		  {
			  System.out.println("USN is disabled");
		  }
		}
		else 
		{
			System.out.println("its not displayed");
		}
		
		WebElement CB=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
			if(CB.isDisplayed())
			{ 
				if(CB.isSelected())
				{ 
					System.out.println("CB is selected");
				}
				else
				{
					System.out.println("CB is not selected");
				}
			}
			else
			{
				System.out.println("is not selected");
			}

	}

}
