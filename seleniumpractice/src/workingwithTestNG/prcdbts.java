package workingwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prcdbts {
	
	ProfilesIni pr;
	FirefoxProfile fr;
	FirefoxDriver driver;
	
	
	@BeforeTest
	public void openbrowser()
	
	{
		pr=new ProfilesIni();
		fr=pr.getProfile("Akhil9");
		driver= new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
	}
	
	@Test
	public void opr()
	{
		driver.findElement(By.linkText("Flights")).click();
		
		System.out.println("value is"+ "   "+driver.findElement(By.xpath("//*[@id=\"left-search\"]/div[1]/div/label[2]")).getText());
		
		

		
		
		
		
		
	}

}
