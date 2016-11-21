package baseDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZoomClass {
	private WebDriver driver;

	public ZoomClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void zoom() throws InterruptedException {
		// TODO Auto-generated method stub
		 General g=new General(driver);
	     g.myLibrary();
	     g.bookOpen1(); Thread.sleep(5000);
		 WindowHandling w=new WindowHandling(driver);
		 w.windowHandling();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[@data-tooltip='Zoom Level']")).click();//Tap on Zoom button
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//div[@data-value='150%']")).click();//Select 150% zoom level
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	 
	 
}
