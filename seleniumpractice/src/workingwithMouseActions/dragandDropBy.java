package workingwithMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragandDropBy {
	
	WebDriver driver;
	@BeforeTest
	public void opn()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://jqueryui.com/slider/");
		
	}
	@Test
	public void draganddropBy() throws InterruptedException
	{
	WebElement sll=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
	
    Thread.sleep(5000);
	
    
    Actions act=new Actions(driver);
    
    Thread.sleep(5000);
    
    int location= sll.getLocation().y;
    
    act.dragAndDropBy(sll, 50, location).build().perform();
	}
	

}
