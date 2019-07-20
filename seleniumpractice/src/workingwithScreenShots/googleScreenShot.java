package workingwithScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleScreenShot {
	
	
	WebDriver driver;
	File srcfile;
	
	@BeforeTest
	public void openbrow() throws InterruptedException, IOException 
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");

	}
		
	@Test
	public void TakeScreenShots() throws IOException, InterruptedException
	{
		
		srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\Users\\Welcome\\Desktop\\ScreenShots Images\\SC1.PNG"));
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("flipkart");
		
		
		Thread.sleep(6000);
		
		srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\Users\\Welcome\\Desktop\\ScreenShots Images\\SearchInflipkart.PNG"));


		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/div/span")).click();
		
		Thread.sleep(6000);

		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
		
		Thread.sleep(6000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		
		srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\Users\\Welcome\\Desktop\\ScreenShots Images\\flipkartHomePage.PNG"));

	}
	}


