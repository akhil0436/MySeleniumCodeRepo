package workingwithTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gmailpractice {
 
	
	ProfilesIni pr;
	FirefoxProfile fr;
	FirefoxDriver driver;
	
	
	@BeforeTest
	public void openbrowser()
	
	{
		pr=new ProfilesIni();
		fr=pr.getProfile("Akhil9");
		driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test
	public void loginoperation() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("imakhil6");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		Thread.sleep(5000);
		
	}
	
	@Test
	public void sec1() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Akhil@112233445566");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		
		Sleeper.sleepTightInSeconds(60);

   }	
	
	@Test
	public void gmailoperations() throws InterruptedException
	{

		Sleeper.sleepTightInSeconds(60);

		
		driver.findElement(By.xpath("//*[@id=\":jv\"]/div/div]")).click();
		

		driver.findElement(By.xpath("//*[@id=\":q1\"]")).sendKeys("imakhil6@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\":pj\"]")).sendKeys("Hey this is automated script gmail");
		
		driver.findElement(By.xpath("//*[@id=\":qo\"]")).sendKeys("Hi, im Akhil just now i automate script for composing gmail for sample");
		
		
		
		driver.findElement(By.xpath("//*[@id=\":p9\"]")).click();
		
		
	}
		
		
		
		

	
}
