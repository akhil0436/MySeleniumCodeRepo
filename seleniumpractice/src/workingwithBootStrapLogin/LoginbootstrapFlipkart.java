package workingwithBootStrapLogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginbootstrapFlipkart {
	
	WebDriver driver;
	@BeforeTest
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void loginflpkrt() throws InterruptedException
	{
		
		List<WebElement> allframes= driver.findElements(By.tagName("iframe"));
		System.out.println(allframes.size());
		
		for(int i=0; i<allframes.size(); i++) 
		{
			
		driver.switchTo().frame(i);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='_1jA3uo _34niwY']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("ak@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("ak12344556A@&^");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		
		Thread.sleep(5000);
		
		
		}
	}

}
