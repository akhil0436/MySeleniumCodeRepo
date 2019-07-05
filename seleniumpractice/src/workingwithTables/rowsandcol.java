package workingwithTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rowsandcol {
	
	WebDriver driver;
	@BeforeTest
	public void brwsr()
	{
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		
	}
	@Test
	public void oprations()
	{
		List<WebElement> tables=driver.findElements(By.tagName("table"));
		for(int i=0; i<tables.size(); i++) 
		{
			
		  List<WebElement> rows=tables.get(i).findElements(By.tagName("tr"));
		  for(int j=0; j<rows.size(); j++)
		  {
			  List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			  for(int k=0; k<cols.size(); k++)
			  {
				  String all=cols.get(i).getText();
				  System.out.println(all+"  ");
				  
			  }
			  System.out.println();
			 
			  
			  
		  }
			
		}
		
		
	}

}
