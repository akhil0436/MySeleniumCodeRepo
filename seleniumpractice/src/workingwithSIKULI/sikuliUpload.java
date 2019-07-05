package workingwithSIKULI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sikuliUpload {
	
	
	WebDriver driver;
	@BeforeTest
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://upload.photobox.com/en/#computer");
	}
	@Test
	public void opppprr() throws InterruptedException, FindFailed
	{
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"button_desktop\"]")).click();
		
		
		
		Screen sc=new Screen();
		
		
		Pattern filename=new Pattern("C:\\Users\\Welcome\\Desktop\\filename.PNG");
		
		Pattern open=new Pattern("C:\\Users\\Welcome\\Desktop\\openORsave.PNG");
	    
		sc.type(filename, "filename.png");
		
		sc.click(open);
		
	}

}
