package baseDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class General {
 private WebDriver driver;

public General(WebDriver driver)
 {
	  this.driver=driver;
 }

public void myLibrary()
{
	 CourseManager cm=new CourseManager(driver);
	 cm.course_manager();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	 driver.findElement(By.xpath("//div[@data-id='my-library']")).click();//My Library page opens.
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }




	 public void bookOpen()
	 {
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
	 driver.findElement(By.xpath("//div[@data-reactid='.4.1.0.0.0.0.1.0.$txt9780078096482.0.0.0']")).click();//Flashcard book
	
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 } 
	 
	 public void bookOpen1()
	 {
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
	
	 driver.findElement(By.xpath("//div[@data-reactid='.4.1.0.0.0.0.1.0.$txt9781135720049.0.0.0']")).click();//Book Opens.
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 } 
	 
	 
}
