package workingwithBootStrapLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class paytmlogin {
	
	WebDriver driver;
	@BeforeTest
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
	}
	@Test
	public void paytmlogin1() throws InterruptedException

	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("ak@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"input_1\"]")).sendKeys("ak@12bfsbfbse");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button/span")).click();
		
		
	}

}
