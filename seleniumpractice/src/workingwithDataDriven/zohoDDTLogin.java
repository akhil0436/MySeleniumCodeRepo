package workingwithDataDriven;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class zohoDDTLogin {

	WebDriver driver;
	@Test(dataProvider="ZohoLoginData")
	public void openbrowser(String ussername, String password) throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.zoho.in/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.xpath("//*[@id=\"lid\"]")).sendKeys(ussername);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys(password);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"signin_submit\"]")).click();
		
		Thread.sleep(5000);
				
		Assert.assertTrue(driver.getTitle().contains("Zoho"), "User is not able to Login with corect credentials");
		
	}
	
	@AfterMethod
	public void teardown() 
	{

		driver.quit();
		
	}
	
	
	@DataProvider(name="ZohoLoginData")
	public Object[][] PassingData()
	
	{
		
		Object[][] data=new Object[3][2];
		
		data[0][0] ="akhil09866@gmail.com";
				
		data[0][1]="Akhil@123456";
		
		
		data[1][0] ="akhil09866@gmail.com";
		
		data[1][1]="Akhil@12345";
		
		
		
		data[2][0] ="akhil09866@gmail.com";
		
		data[2][1]="Akhil@123456";
		
		return data;
		
		
		
	}
	
	
}
