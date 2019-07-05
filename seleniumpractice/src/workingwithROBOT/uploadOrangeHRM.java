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

public class uploadOrangeHRM {
	
	WebDriver driver;
	@BeforeTest
	public void openbrows() throws InterruptedException
	{
		
driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(6000);
	}

	
	@Test
	public void loginHRM() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin ");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(6000);
		
	}
	
	
	@Test
	public void operations() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click();
		
		Thread.sleep(6000);
		
	}
	
	@Test
	public void robotuploadoperations() throws AWTException, InterruptedException
	{
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_P);
		
		Thread.sleep(6000);
		
		rb.keyPress(KeyEvent.VK_P);
		
		rb.keyPress(KeyEvent.VK_PERIOD);
		
		rb.keyPress(KeyEvent.VK_J);
		
		rb.keyPress(KeyEvent.VK_P);
		
		Thread.sleep(6000);
		
		rb.keyPress(KeyEvent.VK_G);
		
		Thread.sleep(6000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
}
