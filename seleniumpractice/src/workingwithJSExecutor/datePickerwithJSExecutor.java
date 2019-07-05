package workingwithJSExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datePickerwithJSExecutor {
	
	WebDriver driver;
	@BeforeTest
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void operations1()
	{
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value='25/9';");
		
		
	}

	
		
}


