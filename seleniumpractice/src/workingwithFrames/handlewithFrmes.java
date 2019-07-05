package workingwithFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlewithFrmes {
	
	
	WebDriver driver;
	@BeforeTest
	public void opnn()
	{
		driver=new ChromeDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		
	}
	@Test(enabled = false)
	public void opr()
	{
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
		
	}
	
	
	@Test
	public void unknownframe() throws InterruptedException
	
	
	
	{
		
		Thread.sleep(5000);
		

	
	   driver.switchTo().frame(1);
	   driver.findElement(By.xpath("/html/body/center/div/center/center/table/tbody/tr[2]/td/p/font[2]/a")).click();
	 
		
	
		
		
	}

}
