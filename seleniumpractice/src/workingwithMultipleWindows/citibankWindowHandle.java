package workingwithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class citibankWindowHandle {
	
	
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.online.citibank.co.in/");
		
		
	}
	@Test
	public void citibankoperations() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/ul[2]/li[1]/a")).click();
		
		String parent=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String child:windows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				 
				driver.findElement(By.xpath("//*[@id=\"simplicity1\"]/a")).click();
				
				driver.close();
				
			}
			
			
		}
		
		
		
	}

}
