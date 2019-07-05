package workingwithPropertFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(workingwithTestNGListeners.creatingListeners.class)

public class freecrmlogin {
	
	WebDriver driver;
	@BeforeTest
	
	public void browserlunch()
	{
		driver=new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
	}
	@Test
	public void operation() throws IOException, InterruptedException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\git\\MySeleniumCodeRepo\\seleniumpractice\\freecrmLogin.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		driver.findElement(By.xpath(pro.getProperty("UsserInputXpath"))).sendKeys("imakhil6@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("PasswordXpath"))).sendKeys("Ak@123456");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("LoginBtn"))).click();
		
	}
	

}
