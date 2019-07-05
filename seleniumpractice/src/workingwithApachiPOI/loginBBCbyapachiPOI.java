package workingwithApachiPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(workingwithTestNGListeners.creatingListeners.class)

public class loginBBCbyapachiPOI {
	
	
	
	
	WebDriver driver;
	Logger log;
	
	@BeforeTest
	public void launchbrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		
		log=Logger.getLogger(loginBBCbyapachiPOI.class);

	    PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php");
		
		Thread.sleep(5000);
		
		log.info("Application Opened succefully in Chrome Browser");
	}
	
	@Test
	public void loginwithapachiPOI() throws IOException, InterruptedException
	{
		
		FileInputStream pf=new FileInputStream("C:\\Users\\Welcome\\git\\MySeleniumCodeRepo\\seleniumpractice\\orangeHRMLogin.properties");
		
		Properties pro=new Properties();
		pro.load(pf);
		
		
		FileInputStream excelsheet=new FileInputStream("C:\\Users\\Welcome\\Desktop\\orangeHRMLogin.xlsx");	
		XSSFWorkbook wbo=new XSSFWorkbook(excelsheet);
		
		XSSFSheet sh=wbo.getSheet("Sheet1");
		
	     Row r;
	     
	     r=sh.getRow(0);
			
			driver.findElement(By.xpath(pro.getProperty("UssrnameXpath"))).sendKeys(r.getCell(0).getStringCellValue());
			
			driver.findElement(By.xpath(pro.getProperty("PswrdXpath"))).sendKeys(r.getCell(1).getStringCellValue());
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(pro.getProperty("LoginBtn"))).click();
			
			log.info("Application LogIN succefully in Chrome Browser");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(pro.getProperty("PimLink"))).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.id(pro.getProperty("AddEmployeeID"))).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.id(pro.getProperty("FirstNameID"))).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
			
			Thread.sleep(5000);
			
			driver.findElement(By.id(pro.getProperty("MiddleNameID"))).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
			
			driver.findElement(By.id(pro.getProperty("LastNameID"))).sendKeys(sh.getRow(2).getCell(0).getStringCellValue());
			
			Thread.sleep(5000);
			
			driver.findElement(By.id(pro.getProperty("EmpIdNum"))).sendKeys(sh.getRow(2).getCell(1).getStringCellValue());
			
			Thread.sleep(5000);
			
			driver.findElement(By.id(pro.getProperty("EmpProfilePic"))).sendKeys(sh.getRow(3).getCell(0).getStringCellValue());
			
			driver.findElement(By.id(pro.getProperty("CheckBoxID"))).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.id(pro.getProperty("SaveBtnXpath"))).click();
			
			log.info("Succefully AddEmployee Details in Application");
			
			
		
		
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Welcome\\Desktop\\orangeHRMLogin.xlsx");
		
		wbo.write(fo);
		
		wbo.close();
		
		
	}

}
