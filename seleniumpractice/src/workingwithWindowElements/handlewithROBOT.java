package workingwithWindowElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlewithROBOT {
	
	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
		driver=new FirefoxDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.pexels.com/search/baby/");
		
		Thread.sleep(6000);
	}
	
	
	@Test
	public void downloadpic() throws InterruptedException, AWTException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[1]/article/a[1]/img")).click();
		
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"photo-page-top\"]/div/div[2]/div/div/div/div/a/span")).click();
		
		
		Thread.sleep(6000);

		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		
		
		Thread.sleep(6000);

		Thread.sleep(6000);

		rb.keyPress(KeyEvent.VK_ENTER);

		
	}

}
