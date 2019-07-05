package workingwithTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlewithTables {

	
	ChromeDriver driver;
	@BeforeTest
	public void opn()
	{
		
		driver=new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/web-table-element.php");
		
	}
	@Test
	public void counttables()
	{
		
		List<WebElement> tables=driver.findElements(By.tagName("table"));
		
		System.out.println("no of tables are "+"   "+tables.size());
		
		
	}
	@Test
	public void countrows()

	{
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println("no of rows are "+"   "+rows.size());
		
	}
	@Test
	public void countcols() 
	{
		List<WebElement> cols=driver.findElements(By.tagName("td"));
		System.out.println("n of coloms are"+"    "+cols.size());
		
	}
}
