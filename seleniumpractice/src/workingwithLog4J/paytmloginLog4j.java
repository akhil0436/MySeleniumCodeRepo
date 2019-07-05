package workingwithLog4J;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class paytmloginLog4j {
	
	WebDriver driver;
	Logger log=Logger.getLogger(axisbankLoginwithLog4j.class);
	
	@BeforeTest
	public void launchopen() throws InterruptedException
	{
	
		PropertyConfigurator.configure("log4j.properties");
		
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		log.info("Succefully launched application in chrome browser");
		
		
		Thread.sleep(5000);
	}
	@Test
	public void logincredentials() throws InterruptedException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Welcome\\git\\MySeleniumCodeRepo\\seleniumpractice\\PaytmLoginCredentials.properties");
		Properties pro=new Properties();
		
		pro.load(fis);
		
		driver.findElement(By.xpath(pro.getProperty("ClickOnLoginBtnLink"))).click();
		
		log.info("Succefully Click on Loginbtn");
		
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(0);

		driver.findElement(By.xpath(pro.getProperty("ClickonLogin2inWindowPopUp"))).click();
		
		log.info("Succefully click on window PopUp Login Link");
		
		Thread.sleep(5000);

		driver.findElement(By.xpath(pro.getProperty("UsserId"))).sendKeys("akhil0436@gmail.com");
		
		Thread.sleep(5000);

		driver.findElement(By.xpath(pro.getProperty("EnterPassward"))).sendKeys("A123@ayaan");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("LoginBtn"))).click();
		
		log.info("Succefully enter Ussername and Password and Click on Login Button");
	}
	

}
