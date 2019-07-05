package workingwithPropertFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangeHrmLogin {
	
	
	WebDriver driver;
	@BeforeTest
	public void brwsrlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test
	public void operations() throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\git\\MySeleniumCodeRepo\\seleniumpractice\\orangeHRMLogin.properties");
		
		Properties pro=new Properties();
		pro.load(fis);
		
		driver.findElement(By.xpath(pro.getProperty("UssrnameXpath"))).sendKeys("Admin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("PswrdXpath"))).sendKeys("admin123");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("LoginBtn"))).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("PimLink"))).click();
		
		Thread.sleep(5000);
		
		
		Select drpdwn=new Select(driver.findElement(By.id(pro.getProperty("DropdownId"))));
		
		drpdwn.selectByVisibleText("IT Manager");
		
		driver.findElement(By.xpath(pro.getProperty("ReportsLink"))).click();
		
		Thread.sleep(5000);
		
	}

}
