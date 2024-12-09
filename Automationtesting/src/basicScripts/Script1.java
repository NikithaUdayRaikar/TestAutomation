package basicScripts;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 
{
	
 public static void main(String[] args)
 {
	String key="webdriver.chrome.driver";
	String value="./Softwares/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
	
}
}
