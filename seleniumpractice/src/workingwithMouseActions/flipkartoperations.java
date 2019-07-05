package workingwithMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkartoperations {

	
	WebDriver driver;
	@BeforeTest
	public void openbrowser1() throws InterruptedException 
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("flipkart");
		
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/div/span")).click();
		
		Thread.sleep(6000);

		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
		
		Thread.sleep(6000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	}
	
	
	@Test
	public void mainoperations() throws InterruptedException
	{
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span"));
        
		Thread.sleep(6000);

        Actions act=new Actions(driver);
        act.moveToElement(ele).build().perform();
        
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/ul/li/ul/li[1]/ul/li[4]/a")).click();
        
		
	}
	
	@Test
	public void menshoes()
	{
		WebElement dragprice=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[2]/div[3]/div[1]/div[1]"));
		
		Actions act1=new Actions(driver);
		
		int loction=dragprice.getLocation().y;
		
		act1.dragAndDropBy(dragprice, 50, loction).build().perform();
		
		
	}
	
	
}
