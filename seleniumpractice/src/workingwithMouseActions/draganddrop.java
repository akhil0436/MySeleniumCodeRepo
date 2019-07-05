package workingwithMouseActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void opppn()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
    }

	@Test
	public void dragable() throws InterruptedException
	{
		
		Thread.sleep(5000);
	    List<WebElement> allframes=driver.findElements(By.tagName("iframe"));
	    
	    for(int i=0; i<allframes.size();)
	    {
	    	driver.switchTo().frame(i);
	    	
	    	
	    	WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			
			
			Actions act=new Actions(driver);
			
			Thread.sleep(5000);

			act.dragAndDrop(drag, drop).build().perform();
			
			break;
	    }
		
		
		
		
		
	}
}
