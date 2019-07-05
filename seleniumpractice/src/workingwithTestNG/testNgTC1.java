package workingwithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgTC1 {
	
ProfilesIni pr;
FirefoxProfile fr;
FirefoxDriver driver;

	
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{		
	   pr=new ProfilesIni();
	   fr=pr.getProfile("Akhil9");
	   driver=new FirefoxDriver();
	   driver.get("https://templeinfo.co.in/");
		

	Sleeper.sleepTightInSeconds(5);
	}
	@Test
	public void countnooftables()
	{

	List<WebElement>countt=driver.findElements(By.tagName("table"));
		System.out.println(countt.size());
		
		
		
	}
	@Test
	public void closewindow()
	{
		
		driver.close();
	}
	
	

}