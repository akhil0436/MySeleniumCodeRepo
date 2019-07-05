package workingwithApachiPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mercurytravellsLogin {
	
	
	
	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(5000);
		
	}
	@Test
	public void LoginwithDifferentData() throws IOException, InterruptedException
	{
				
		String file="C:\\Users\\Welcome\\Desktop\\MercuryTravellsLogin.xlsx";
		
		FileInputStream fis=new FileInputStream(file);
		
		
		
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wbo.getSheet("Sheet1");
		
		Row r;
		
		for(int i=0; i<=sh.getLastRowNum(); i++)
		{
			r=sh.getRow(i);
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(r.getCell(0).getStringCellValue());
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys(r.getCell(1).getStringCellValue());
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
			
			String actual=driver.getTitle();
			r.createCell(3).setCellValue(actual);
			
			String expected=r.getCell(2).getStringCellValue();
			
			if(expected.contains(actual))
			{
				
				r.createCell(4).setCellValue("Pass");
				
			}
			else
			{
				r.createCell(4).setCellValue("Fail");
				
				
			}
			
			driver.get("https://ui.freecrm.com/");
			
			
			
			
		}
		
		driver.close();
		
		FileOutputStream fo=new FileOutputStream(file);
		wbo.write(fo);
		
		wbo.close();
		
		
		
		
		
		
	}

}
