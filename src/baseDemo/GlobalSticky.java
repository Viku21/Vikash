package baseDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalSticky {
	
	private WebDriver driver;
	public GlobalSticky(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public void addGlobalSticky() throws InterruptedException
	 {General g=new General(driver);
	 g.myLibrary();
	
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
	
	 driver.findElement(By.xpath("//div[@ data-reactid='.4.1.0.0.0.0.1.0.$txt9780596522548.0.0.0']")).click();//Book Opens.
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	 
	 Thread.sleep(10000);
	 WindowHandling w=new WindowHandling(driver);
     w.windowHandling();
	Thread.sleep(10000);
	driver.findElement(By.xpath(".//*[@id='tabs']/div[1]/div[2]/a[5]/span")).click();
		driver.switchTo().activeElement().sendKeys("Sticky");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-tooltip='Minimize Sticky']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-tooltip='Sticky']")).click();
    Thread.sleep(2000);
	driver.switchTo().activeElement();
	driver.findElement(By.xpath("//textarea[@tabindex='10']")).clear();
	
	driver.switchTo().activeElement().sendKeys("updated");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-tooltip='Minimize Sticky']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-tooltip='updated']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@data-tooltip='Delete']")).click();
    Thread.sleep(2000);
	 }
}
