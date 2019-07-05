package workingwithSIKULI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class downloadwithSikuli {

	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new FirefoxDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://all-free-download.com/wallpapers/download/cute_baby_wallpaper_3670.html");
		
		Thread.sleep(6000);
	}
	
	@Test
	public void sikulisownloadoperations() throws FindFailed
	
	{
		driver.findElement(By.xpath("//*[@id=\"detail_content\"]/table/tbody/tr[1]/td[1]/a")).click();
		
	Screen sc=new Screen();
	Pattern pt=new Pattern("C:\\Users\\Welcome\\Desktop\\Capture.PNG");
	sc.click(pt);
		
		
	}
	
	
	
	
}
