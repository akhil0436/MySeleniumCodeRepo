package workingwithModularDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReusableMethodsForOrangeHRM {

	
	
	WebDriver driver;
	
	@BeforeTest
	public void BrowserLaunch()
	{
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test
	public void Login(String Ussername,String Password)
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(Ussername);
		
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
	@Test
	public void CheckLoginStatus()
	{
		
		String Expected="Welcome Login Admin";
		Assert.assertTrue(Expected.contains("Admin"), "Login status will be Succesfully");
			
	}
	@Test
	public void Logout()
	{
		driver.findElement(By.linkText("Welcome Admin")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
	@AfterTest
	public void Close()
	{
		
	    driver.close();
		
	}
	
	
}
