package workingwithFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class freecrmFrame {

	WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://freecrm.com/");
		
		
	}
	@Test
	public void login() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("imakhil6@gmail.com");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Ak@123456");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
	}
	
	@Test
	public void tc1() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
		
		Thread.sleep(5000);

		WebElement pick=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[2]/div/div/input"));
		pick.click();

		Thread.sleep(5000);
		
	    WebElement newidea= driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[2]/div/div/div[2]/div[348]"));
	    newidea.click();
	    
	    WebElement nnw=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[13]/div[2]/div/div/label"));
	    nnw.click();
	    
	    
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]")).click();
		
		
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div[2]/a[4]")).click();
		
		
		
		
	}
	
	
}
