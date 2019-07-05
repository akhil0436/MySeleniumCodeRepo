package workingwithAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reddifloginAlert {
	
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(5000);
	}
	
	@Test
	public void reddifalert() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(alert.getText());
		
		Thread.sleep(5000);
		
		alert.accept();
		
	}

}
