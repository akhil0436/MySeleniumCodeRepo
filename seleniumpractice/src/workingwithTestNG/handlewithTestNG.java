package workingwithTestNG;



import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlewithTestNG {
	
	FirefoxDriver driver;

	@BeforeTest
	 public void open ()
	 {
		
		System.out.println("open browser navigate to url");
	 }
	@Test(priority=0, enabled = true)
	
	public void register()
	{
		
		System.out.println("register for new user account");
		
	}
	
	@Test(priority = 3, enabled = false)
	
    public void login()
    {
	
		System.out.println("enter usser name and password click on logion btn");
		
    }
	
	@Test(enabled = true)
	public void composemail()
	
	{
		
		System.out.println("click on compose mail");
		
	}
	
	@Test(priority = 2, enabled=false)
	public void sentmail()
	{
		
		System.out.println("sentmail");
		
	}	
	
	@Test

	public void logout()
	{
		
		System.out.println("logout");
		
	}
	
	
	@Test
	public void closebrowser()
	
	{
		
		System.out.println("close all the browsers");
		
	}
	
	
	@AfterTest
	public void close()
	{
		
		driver.close();
		
	}
	
}

