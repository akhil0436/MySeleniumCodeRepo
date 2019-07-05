package workingwithAutoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uploadwithAutoIT {
	
	
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new FirefoxDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(6000);
	}
	
	@Test
	public void sampleuploadwithAutoIT() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin ");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(6000);
		
		
	}

	@Test
	public void operationswithuploadAutoIT() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click();
		
		Thread.sleep(6000);
		
	}
	
	//In AuotoIT script Editor
	
	/*WinWaitActive{"Open"}
	Send{"pp.jpg"}
	Send{"ENTER"}*/
	
	
	
}
