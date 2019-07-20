package workingwithDataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import workingwithApachiPOI.ExcelDataConfigLibrary;

public class newtoursRegistration {

	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
	}
	@Test
	public void registrationNewToursPage() throws IOException
	{
		
		ExcelDataConfigLibrary path=new ExcelDataConfigLibrary("C:\\Users\\Welcome\\Desktop\\orangeHRMLogin.xlsx");
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 0));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 1));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 2));
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(path.getdatafromsheet("Sheet3", 1, 3));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 4));
		
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 5));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 6));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 7));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")).sendKeys(path.getdatafromsheet("Sheet3", 1, 8));
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(path.getdatafromsheet("Sheet3", 1, 9));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 10));
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")).sendKeys(path.getdatafromsheet("Sheet3", 1, 11));
		
		
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
		
		
		WebElement fname=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		
		WebElement ussername=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		Assert.assertTrue(fname.equals(ussername), "The Ussername and password are correctly stored in servers");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
