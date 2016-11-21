package baseDemo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Collection {
	private WebDriver driver;

	public Collection(WebDriver driver)
	{
		this.driver=driver;
	}

	public void my_Collection() {
		// TODO Auto-generated method stub
		 CourseManager cm=new CourseManager(driver);
		 cm.course_manager();
		 String win=driver.getWindowHandle();
		 Set<String> s=driver.getWindowHandles();
		 Iterator<String> itr=s.iterator();
		 while (itr.hasNext()){
			 String win2=null;
			 String cmp=itr.next();
			 if(win!=cmp){
				 win2=cmp;
			 }
			 driver.switchTo().window(win2);
		 }
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("html/body/div[1]/section[1]/header/section[1]/div/div[2]/a[2]/span[2]")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
        


}
