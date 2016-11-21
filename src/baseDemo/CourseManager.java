package baseDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseManager {
	
	private WebDriver driver;

	public CourseManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public void course_manager() {
		
		 // LoginClass logn=new LoginClass(driver);
		  //logn.logIn();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//li/a/span")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	

}
