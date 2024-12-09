package basicScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    Dimension d =new Dimension(400, 900);
	    driver.manage().window().setSize(d);

	}

}
