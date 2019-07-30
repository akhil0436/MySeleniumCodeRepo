package workingwithModularDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ResusableMethodsForFreeCRM {

	WebDriver driver;

	@BeforeTest
	public void OpenBrowser()
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://ui.freecrm.com/");
		
		
	}
	@Test
	public void LoginFreeCRM(String Username, String Password) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(Username);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys(Password);
				
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
	}
	

	@Test
	public void CheckLoginStatusForFreeCRM()
	{
		
		String Expected="Syed Akhil";
		String Actual=driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/span[1]")).getText();
		
		Assert.assertTrue(Actual.contains(Expected), "Succefully Login with given data");
		
		
	}
	@Test
	
	public void LogoutFreeCRM() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/i")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div[2]/a[4]/span")).click();
		
		
	}
	@Test
	public void CloseFreeCRM()
	{
		driver.close();
	}
	
	
}
