package baseDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableOfContent {
	private WebDriver driver;

	public TableOfContent(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void tableContent()
	  {
		General g=new General(driver);
		 g.myLibrary();
		 g.bookOpen1();
		 WindowHandling w=new WindowHandling(driver);
		 w.windowHandling();
		 driver.findElement(By.xpath("//a[@data-tooltip='Table Of Contents - Bookmarks - Go to Page']")).click();//TOC Opens.
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		  
		 driver.findElement(By.xpath("//input[@placeholder='Jump to page']")).sendKeys("50");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Go")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='left']")).click();//Page navigation 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='left']")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='left']")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='left']")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='right']")).click();//Page navigation.
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='right']")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-direction='right']")).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
