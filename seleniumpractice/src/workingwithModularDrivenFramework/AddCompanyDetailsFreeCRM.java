package workingwithModularDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import workingwithApachiPOI.ExcelDataConfigLibrary;

public class AddCompanyDetailsFreeCRM {

	WebDriver driver;
	
	ExcelDataConfigLibrary ExcelData;
	
	ResusableMethodsForFreeCRM AddCompany;
    
	@Test
	public void AddCompanyFromExcelSheet() throws InterruptedException, IOException
	{
		
		AddCompany=new ResusableMethodsForFreeCRM();
		
		ExcelData=new ExcelDataConfigLibrary("C:\\Users\\Welcome\\Desktop\\orangeHRMLogin.xlsx");
		
		
		AddCompany.OpenBrowser();
		
		AddCompany.LoginFreeCRM("imakhil6@gmail.com ", "Ak@123456");
		
		AddCompany.CheckLoginStatusForFreeCRM();

	}
	@Test
	public void MainOperatins() throws InterruptedException
	{
		
			Thread.sleep(5000);
		

			driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[4]")).click();
			
			
			
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")).sendKeys(ExcelData.getdatafromsheet("Sheet4", 1, 0));
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div/div/input")).sendKeys(ExcelData.getdatafromsheet("Sheet4", 1, 1));
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[1]/div/input")).sendKeys(ExcelData.getdatafromsheet("Sheet4", 1, 2));
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div/div/textarea")).sendKeys(ExcelData.getdatafromsheet("Sheet4", 1, 3));
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div/div/input")).sendKeys(ExcelData.getdatafromsheet("Sheet4", 1, 4));
			
			
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/div[2]/div[2]/span")).sendKeys("Medium");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/div/input")).sendKeys("C:\\Users\\Welcome\\Desktop\\SC.PNG");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]/i")).click();
		} 
		
		
		
		
	}
	
	
	
	

