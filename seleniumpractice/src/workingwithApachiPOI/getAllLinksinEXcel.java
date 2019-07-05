package workingwithApachiPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getAllLinksinEXcel {

	WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}
	@Test
	public void GetallLinksToSheet() throws IOException
	{	
	
		String file="C:\\Users\\Welcome\\Desktop\\data1.xlsx";
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet sh=wbo.getSheet("Sheet3");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size(); i++) 
		{
			
		String gettxt=links.get(i).getText();
		sh.createRow(i).createCell(0).setCellValue(gettxt);
		}
		
		FileOutputStream fo=new FileOutputStream(file);
		
		
		
		
		
	}
	
	
	
	
}
