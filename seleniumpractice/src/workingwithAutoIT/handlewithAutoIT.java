package workingwithAutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlewithAutoIT {
	
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver=new FirefoxDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://all-free-download.com/wallpapers/download/cute_baby_2_wallpaper_3636.html");
		
		Thread.sleep(6000);
	}
	
	@Test
	public void autoitsampledownload() throws InterruptedException, IOException 
	{
		driver.findElement(By.xpath("//*[@id=\"detail_content\"]/table/tbody/tr[1]/td[1]/a")).click();
		
		Thread.sleep(5000);
			
		Runtime.getRuntime().exec("C:\\Users\\Welcome\\Desktop\\downloadwithautoit.exe");
		
	}
	
	//In AuotoIT script Editor
	
	/*WinWaitActive{"Opening _downloadfiles_wallpapers_1024_768_cute_baby_2_3636.jpg"}
	Send{"DOWN"}
	Send{"ENTER"}*/

	
	
}
