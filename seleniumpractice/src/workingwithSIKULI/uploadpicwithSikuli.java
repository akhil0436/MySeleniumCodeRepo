package workingwithSIKULI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uploadpicwithSikuli {
	
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	
	}
	@Test
	public void uploadbyusingSIKULI() throws InterruptedException
	{
		
driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin ");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(6000);
		
	}
	@Test
	public void operat() throws InterruptedException, FindFailed
	{
		Thread.sleep(5000);
		
		WebElement jj=driver.findElement(By.cssSelector("#menu_pim_viewPimModule"));	
		jj.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click();
		
		Thread.sleep(6000);
		
		
		Screen sc=new Screen();
		
		Pattern filename=new Pattern("C:\\Users\\Welcome\\Desktop\\filename.PNG");
		
		Thread.sleep(6000);
		
		Pattern open=new Pattern("C:\\Users\\Welcome\\Desktop\\openORsave.PNG");
		
		Thread.sleep(6000);
		
		sc.type(filename, "C:\\Users\\Welcome\\Desktop\\filename.PNG");
		
		Thread.sleep(6000);
		
		sc.click(open);
		
	}
	
	
	

}
