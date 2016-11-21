package baseDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPageClass {
	private WebDriver driver;

	public ScrollPageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void scroll_Page() throws InterruptedException
	 {    General g=new General(driver);
	     g.myLibrary();
	    g.bookOpen1();
		 WindowHandling w=new WindowHandling(driver);
		 w.windowHandling();Thread.sleep(5000);
	 Actions action=new Actions(driver);
	 action.sendKeys(Keys.PAGE_DOWN);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 action.click(driver.findElement(By.xpath("//div[@class='page-viewer w-scroll scrollable']"))).perform();//page scroll
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
}
