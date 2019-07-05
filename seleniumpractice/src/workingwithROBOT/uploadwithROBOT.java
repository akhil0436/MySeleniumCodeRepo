package workingwithROBOT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uploadwithROBOT {

	WebDriver driver;
	@BeforeTest
	public void openbrowserrr() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.get("https://upload.photobox.com/en/");
		
		Thread.sleep(6000);
		
	}
	@Test
	public void performoperations() throws InterruptedException, AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"mycomputer\"]")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"button_desktop\"]")).click();
		Thread.sleep(6000);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_P);
		Thread.sleep(6000);
		
		rb.keyPress(KeyEvent.VK_P);
		
		
		
		rb.keyPress(KeyEvent.VK_PERIOD);
		
		
		
		rb.keyPress(KeyEvent.VK_J);
		
	
		
		rb.keyPress(KeyEvent.VK_P);
		
		
		rb.keyPress(KeyEvent.VK_G);
		
		Thread.sleep(6000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		}
	
	
}
