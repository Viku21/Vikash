package baseDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandling {
      private WebDriver driver;

	public WindowHandling(WebDriver driver)
      {
    	  this.driver=driver;
      }

	
	 public void windowHandling()
	 {
		 String win2=driver.getWindowHandle();
		 Set<String> s1=driver.getWindowHandles();
		 Iterator<String> itr1=s1.iterator();
		 while(itr1.hasNext())
		 {
			 String win3=null;
			 String cmp1=itr1.next();
			 if(win2!=cmp1)
			 {
				 win3=cmp1;
			 }
			 driver.switchTo().window(win3);
			 
		 }
	 }
}
