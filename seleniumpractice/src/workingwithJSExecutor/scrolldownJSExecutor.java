package workingwithJSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolldownJSExecutor {
	
	WebDriver driver;
	@BeforeTest
	public void brwsrlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/selenium-tutorials/click-element-using-javascriptexecutor");
	}
	@Test
	public void operations()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("scroll(0,900)");
		
	}

}
