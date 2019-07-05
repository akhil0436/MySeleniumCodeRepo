package workingwithLog4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class axisbankLoginwithLog4j {
	
	WebDriver driver;
	Logger log=Logger.getLogger(axisbankLoginwithLog4j.class);
	
	
	
	
	@Test
	public void open() throws InterruptedException
	{
		
		PropertyConfigurator.configure("log4j.properties");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.axisbank.com/");
		
		Thread.sleep(5000);
		
		log.info("Application Opened succefully in Chrome Browser");
		
		WebElement link=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div[1]/div[3]/ul/li[4]/a"));
		 
		Actions action=new Actions(driver);
		action.moveToElement(link).build().perform();
		
		log.info("Mouse succefully hover on Bank Smart");
		
		WebElement internetbankinglink=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div[1]/div[3]/ul/li[4]/div/div[1]/ul/li[1]/a"));
		
		internetbankinglink.click();
		
		log.info("succefully click on Internet Banking");
		
	}	
	
	


}