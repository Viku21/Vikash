package baseDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class FlashcradBook {
	
	public WebDriver driver;

	public FlashcradBook(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	 public void bookOpen1()
	 {
     General g=new General(driver);
	 g.myLibrary();
	 //g.bookOpen();
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
	public void tapFlashCard()
	{  
		WindowHandling win=new WindowHandling(driver);
		win.windowHandling();
		driver.findElement(By.linkText("Flashcards")).click();
	}
    
	
	public void veryFlashCard()
	{  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Very well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Very well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Very well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Very well")).click();

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
		driver.findElement(By.xpath("//span[@data-reactid='.0.1.1.0.0.1']")).click();//Tap on Show Known Card.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	
	public void someWhat()
	{
		driver. findElement(By.xpath("//a[@class='somewhatClass button']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver. findElement(By.xpath("//a[@class='somewhatClass button']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver. findElement(By.xpath("//a[@class='somewhatClass button']")).click();
	}
	
	public void notWell()
	{
		driver.findElement(By.linkText("Not well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Not well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Not well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Not well")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
    
	public void term()
	{
		driver.findElement(By.xpath("//a[@data-value='term']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void definition()
	{
		driver.findElement(By.xpath("//a[@data-value='definition']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-tooltip='Undo']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void overFlowAction()
	{
		driver.findElement(By.xpath("//a[@ data-tooltip='Reader Menu']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@ data-action='reset-deck']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@ data-action='shuffle-deck']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@ data-action='toggle-fullscreen']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		
		
		
	}
	 public void home_CM1()
	  {
		driver.findElement(By.xpath("//a[@data-tooltip='Home']")).click();//Tap on Home 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//div[@data-reactid='.4.1.0.0.0.0.1.0.$txt9780078096482.0.0.0']")).click();
		
	  }
	
	
}
