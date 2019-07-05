package workingwithTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handledynamictables {

	WebDriver driver;
	
	@BeforeTest
	public void opn()
	{
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.mercurytravels.co.in/");
        
		
	}
	
	@Test
	public void opr()
	{
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker-days']/table/td"));
		
		
		for(int i=0; i<dates.size(); i++) 
		{
			String nvalue=dates.get(i).getText();
			
			if(nvalue.equalsIgnoreCase("30")) 
			{
				dates.get(i).click();
				break;
				
			}
			
			
		}
		
		
		
		
		
	}
	
	
}
