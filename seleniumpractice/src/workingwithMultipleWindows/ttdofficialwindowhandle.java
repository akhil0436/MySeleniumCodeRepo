package workingwithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ttdofficialwindowhandle {
	
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tirumalatirupati.in/ttd-300rs-special-entry-darshan-ticket-timings/");
		
		Thread.sleep(5000);
	}
	@Test
	public void ttdwindow() throws InterruptedException
	
	{
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"post-90\"]/div[3]/ul[1]/li/ul/li/ul/li[7]/a")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				
				driver.switchTo().window(child);
				
				Thread.sleep(6000);
				
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(parent);
		
		
		
		
		
		
	}

}
