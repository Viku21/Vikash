package baseDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bookmark {
	private WebDriver driver;

	public Bookmark(WebDriver driver)
	{
		this.driver=driver;
	}
    
	 public void bookmark() throws InterruptedException
	 {
		 General g=new General(driver);
		 g.myLibrary();
		 g.bookOpen1();
		 
		 WindowHandling w=new WindowHandling(driver);
		 w.windowHandling();
		 Thread.sleep(5000);
	 driver.findElement(By.cssSelector("div.page-bookmark.not-trigger-mouseonborder")).click();//bookmark
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 }
		
		
	}

