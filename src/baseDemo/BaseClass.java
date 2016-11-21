package baseDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	 protected WebDriver driver;
	 
	 
	@BeforeMethod
	public void setUp() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.staging.study.intel.com/");
	driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/ul/li[2]/a/span")).click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("txt-email")).sendKeys("stagingmagic_ak@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("qa123magic");
    driver.findElement(By.xpath("//button[@action='submit']")).click();

	}

	@AfterMethod
	public void tearDown() {
	// driver.close();
	driver.quit();
	}
	
	

	}

