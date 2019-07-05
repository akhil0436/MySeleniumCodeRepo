package workingwithJSExecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(workingwithTestNGListeners.creatingListeners.class)

public class fbLoginJSExecutor {
	
	WebDriver driver;
	@BeforeTest
	public void brwsrlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void operations()
	
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('email').value='aja@gmail.com'");
		
		js.executeScript("document.getElementById('pass').value='ajagrder1235'");
		
		js.executeScript("document.getElementById('u_0_a').click();");
		
		
	}

}
