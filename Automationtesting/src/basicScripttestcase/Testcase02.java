package basicScripttestcase;

import org.openqa.selenium.By;

public class Testcase02 extends Genericscript
{
	public void psw()
	   {
		  boolean displayed = driver.findElement(By.id("psw")).isDisplayed();
		  boolean enabled = driver.findElement(By.id("psw")).isEnabled();
		  System.out.println(displayed+" "+enabled);
		  
	   }
	
}
