package workingwithBootStrapLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class goibiboLogin {
	
	WebDriver driver;
	@BeforeTest
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
	}
	@Test
	public void logingoibibo() throws InterruptedException

	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath("/html/body/section/div[2]/div[5]/div/a")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"authUsername\"]")).sendKeys("ak@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"authPassword\"]")).sendKeys("ak@12bfsbfbse");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"authExistingUserSignInBtn\"]")).click();
		
		
	}
}
