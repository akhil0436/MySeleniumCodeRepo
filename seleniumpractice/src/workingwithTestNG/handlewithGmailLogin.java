package workingwithTestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlewithGmailLogin {
	
	
	ProfilesIni pr;
	FirefoxProfile fr;
	FirefoxDriver driver;

	
	@BeforeTest
	
	public void openbrwsr()
	{
		pr=new ProfilesIni();
		fr=pr.getProfile("Akhil9");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
	}
	
	@Test(priority = 0)
	public void logingmail()
	
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority = 1)
	public void reqprocess()
	{
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Vacancies")).click();
		
		WebElement drpdwn=driver.findElement(By.id("vacancySearch_jobTitle"));
		
		Select visible=new Select(drpdwn);
		visible.selectByVisibleText("IT Manager");
		
		WebElement drpdwn2=driver.findElement(By.id("vacancySearch_status"));
		Select visible2=new Select(drpdwn2);
		visible2.selectByVisibleText("Active");
		
		driver.findElement(By.id("btnSrch")).click();
		
	}
	@Test(priority = 2)
	public void logoutoperation() throws InterruptedException
	{
	   driver.findElement(By.linkText("Welcome Admin")).click();
	   driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	   
		
		
	}
	
	
	
	

}
