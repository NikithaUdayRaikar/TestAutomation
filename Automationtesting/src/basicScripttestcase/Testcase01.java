package basicScripttestcase;

import org.openqa.selenium.By;

public class Testcase01 extends Genericscript
{
   public void usn()
   {
	  boolean displayed = driver.findElement(By.id("email")).isDisplayed();
	  boolean enabled = driver.findElement(By.id("email")).isEnabled();
	  System.out.println(displayed+" "+enabled);
	  
   }
}
