package workingwithMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseAction {
	
	
	WebDriver driver;
	@BeforeTest
	public void brwsr() 
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.mercurytravels.co.in/");
		
	}
	
	@Test
	public void opppr()
	{
		WebElement link=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[10]/a"));
		 
		Actions action=new Actions(driver);
		action.moveToElement(link).build().perform();
		
	}

}
