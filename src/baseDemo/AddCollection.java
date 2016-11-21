package baseDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCollection {

	private WebDriver driver;

	public AddCollection(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public void add_Collection() {
		// TODO Auto-generated method stub
		 Collection collection=new Collection(driver);
		 collection.my_Collection();
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
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("span.la-title")).click();
		 String win3=driver.getWindowHandle();
		 Set<String> s2=driver.getWindowHandles();
		 Iterator<String> itr2=s2.iterator();
		 while(itr2.hasNext())
		 {
			 String win4=null;
			 String cmp2=itr2.next();
			 if(win3!=cmp2)
			 {
				 win4=cmp2;
			 }
			 driver.switchTo().window(win4);
			 
		 }
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("input.txt.txt-prompt-entry"));
		 driver.switchTo().activeElement().sendKeys("New");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("a.msg-box-btn.button.default.primary")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

}
