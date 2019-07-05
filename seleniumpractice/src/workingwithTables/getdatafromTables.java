package workingwithTables;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getdatafromTables {
	
	WebDriver driver;
	@BeforeTest
	public void opnbrowsr()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
	}
	@Test(enabled = false)
	public void opr()
	{
		
		WebElement data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]"));
		String gettext=data.getText();
		System.out.println(gettext);
		
	}
	
	@Test
	public void allcolget() throws InterruptedException
	{
	 WebElement all=driver.findElement(By.tagName("table"));
	 String get=all.getText();
	 System.out.println(get);
		
	}
    @Test(enabled = false)
    public void getallrow()
    {
    	WebElement allr=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr"));
    	String sp=allr.getText();
    	System.out.println(sp);
    	
    	
    }
}
