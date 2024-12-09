package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	WebElement search=driver.findElement(By.name("search_query"));
	search.sendKeys(" hindi songs");
	WebElement sea=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
	sea.click();
	}

}
